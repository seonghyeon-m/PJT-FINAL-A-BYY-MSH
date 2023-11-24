package com.ssafy.tennis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.tennis.model.dto.User;
import com.ssafy.tennis.model.dto.Wait;
import com.ssafy.tennis.model.service.UserService;
import com.ssafy.tennis.model.service.WaitService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/wait")
@Api(tags = "대기 컨트롤러")
public class WaitRestController {
	@Autowired
	private WaitService waitService;

	@PostMapping("")
	@ApiOperation(value = "매치 요청 보내기")
	public ResponseEntity<Integer> sendMatch(@RequestBody Wait wait) {
		
		int result = waitService.sendWait(wait);
		return new ResponseEntity<Integer>(result, HttpStatus.CREATED);
	}

	@DeleteMapping("{accept}")
	@ApiOperation(value = "매칭 대기 초기화 ")
	private ResponseEntity<Void> deleteMatch(@PathVariable String accept) {
		waitService.deleteWait(accept);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@PutMapping("")
	@ApiOperation(value = "매칭 수락 ")
	private ResponseEntity<?> acceptMatch(@RequestBody Wait wait) throws IOException {
		waitService.acceptWait(wait);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/accept/{accept}")
	@ApiOperation(value = "받은요청 조회 ")
	public ResponseEntity<?> acceptRes(@PathVariable String accept){
		System.out.println(accept);
		List<Wait> list = waitService.acceptRes(accept);
		System.out.println(list);
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Wait>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/send/{sender}")
	@ApiOperation(value = "보낸요청 조회 ")
	public ResponseEntity<?> sendReq(@PathVariable String sender){
		
		List<Wait> list = waitService.sendReq(sender);
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Wait>>(list,HttpStatus.OK);
	}
	@PutMapping("/start")
	@ApiOperation(value = "매칭 시작 ")
	private ResponseEntity<?> matchStart(@RequestBody Wait wait) throws IOException {
		waitService.matchStart(wait);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@DeleteMapping("/decline/{sender}")
	@ApiOperation(value = "매칭 거절  ")
	private ResponseEntity<Void> declineWait(@PathVariable String sender) {
		waitService.declineWait(sender);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
