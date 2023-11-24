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
import com.ssafy.tennis.model.service.ResultService;
import com.ssafy.tennis.model.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/result")
@Api(tags = "매칭  컨트롤러")
public class ResultRestController {
	@Autowired
	private ResultService resultService;

	@GetMapping("{user1}")
	@ApiOperation(value = "매치 종료 결과 ")
	public ResponseEntity<?> finishList(@PathVariable String user1) {
		List<Result> list =resultService.finishMatch(user1);
//		System.out.println(userService.selectMale() );
		return new ResponseEntity<List<Result>>(list, HttpStatus.OK);
	}
	
	@PostMapping("")
	@ApiOperation(value = "매치 정보추가 ")
	public ResponseEntity<Result> insertMatch(@RequestBody Result result) {
		resultService.insertMatch(result);
//		System.out.println(userService.selectMale() );
		return new ResponseEntity<Result>(result, HttpStatus.OK);
	}
	
	@PutMapping("")
	@ApiOperation(value = "매치 정보업데이트")
	public ResponseEntity<Result> updateMatch(@RequestBody Result result) {
		resultService.updateMatch(result);
	System.out.println(result);
		return new ResponseEntity<Result>(result, HttpStatus.OK);
	}
	
	@GetMapping("/now/{user1}")
	@ApiOperation(value = "현재 매치 정보  ")
	public ResponseEntity<?> matchNow(@PathVariable String user1) {
		Result result = resultService.matchNow(user1);
//		System.out.println(userService.selectMale() );
		return new ResponseEntity<Result>(result, HttpStatus.OK);
	}
	
	@PostMapping("/past")
	@ApiOperation(value = "해당유저와의 과 매치 정보  ")
	public ResponseEntity<?> nowUserPast(@RequestBody Result result) {
		List<Result> list = resultService.nowUserPast(result);
//		System.out.println(userService.selectMale() );
		return new ResponseEntity<List<Result>>(list, HttpStatus.OK);
	}
	
	@PutMapping("/end")
	@ApiOperation(value = "매치 정보업데이트")
	public ResponseEntity<Result> matchEnd(@RequestBody Result result) {
		resultService.matchEnd(result);
	System.out.println(result);
		return new ResponseEntity<Result>(result, HttpStatus.OK);
	}

}
