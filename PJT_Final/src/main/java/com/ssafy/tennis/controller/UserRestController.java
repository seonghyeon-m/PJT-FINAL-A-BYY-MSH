package com.ssafy.tennis.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.tennis.model.dto.Result;
import com.ssafy.tennis.model.dto.User;
import com.ssafy.tennis.model.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(tags = "유저 컨트롤러")
public class UserRestController {
	@Autowired
	private UserService userService;

	@GetMapping("musers")
	@ApiOperation(value = "남자유저 랭킹")
	public ResponseEntity<?> mUserList() {
//		System.out.println(userService.selectMale() );
		return new ResponseEntity<List<User>>(userService.selectMale(), HttpStatus.OK);
	}

	@GetMapping("fusers")
	@ApiOperation(value = "여자 유저 랭킹")
	public ResponseEntity<?> fUserList() {
//		System.out.println(userService.selectFemale() );
		return new ResponseEntity<List<User>>(userService.selectFemale(), HttpStatus.OK);
	}

	@GetMapping("{user_Id}")
	@ApiOperation(value = "유저 한명 조회")
	public ResponseEntity<?> oneUser(@PathVariable String user_Id) {
		System.out.println(user_Id);
		User user = userService.selectOne(user_Id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping("/search/{search}")
	@ApiOperation(value ="유저 검색 결과")
	public ResponseEntity<?> searchUser(@PathVariable String search) {
		System.out.println(search+"controller");
		List<User> slist = userService.searchUser(search);
		if (slist == null || slist.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<User>>(slist, HttpStatus.OK);
	}

	@GetMapping("logout")
	@ApiOperation(value = "로그아웃")
	public ResponseEntity<Void> logout(HttpSession session) {
//		session.invalidate();

		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PostMapping("login")
	@ApiOperation(value = "로그인")
	public ResponseEntity<?> login(@RequestBody User user, HttpSession session) {
		User tmp = userService.logIn(user);
//		System.out.println(tmp);
		System.out.println(user);
//		if (tmp == null)
//			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
//
//		session.setAttribute("loginUser", tmp.getId());
		return new ResponseEntity<User>(tmp, HttpStatus.OK);
	}

	@PostMapping("signup")
	@ApiOperation(value = "회원 가입")
	public ResponseEntity<Integer> signup(@RequestBody User user) {
		System.out.println(user);
		int result = userService.signUp(user);

		return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
	}
	
	@PutMapping("/user1")
	@ApiOperation(value = "유저레이팅 업데이트 ")
	public ResponseEntity<User> user1Rate(@RequestBody User user) {
		userService.user1Rate(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PutMapping("/user2")
	@ApiOperation(value = "유저 레이팅 업데이")
	public ResponseEntity<User> user2Rate(@RequestBody User user) {
		userService.user2Rate(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PostMapping("/searchsel")
	@ApiOperation(value = "유저 한명 조회")
	public ResponseEntity<?> searchSelect(@RequestBody User user) {
//		System.out.println(user);
		User u =userService.searchSelect(user);
		return new ResponseEntity<User>(u, HttpStatus.OK);
	}
	
	@GetMapping("/check/{phone}")
	@ApiOperation(value = "핸드폰 번호 중복 체크")
	public ResponseEntity<?> checkPhone(	@PathVariable String phone) {
		User user = userService.checkPhone(phone);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PutMapping("/upass")
	@ApiOperation(value = "유저 비밀번호 업데이")
	public ResponseEntity<User> updatePass(@RequestBody User user) {
		System.out.println(user);
		userService.updatePass(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}
