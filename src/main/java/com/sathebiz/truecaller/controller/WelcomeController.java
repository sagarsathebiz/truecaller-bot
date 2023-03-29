package com.sathebiz.truecaller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathebiz.truecaller.util.MessageProperty;
import com.sathebiz.truecaller.vo.BaseResponse;

@RestController
@RequestMapping(value = "/welcome")
public class WelcomeController {
	
	@Autowired
	private MessageProperty messageProperty;

	@GetMapping(value = "/info")
	public ResponseEntity<Object> getInfo() {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setData(null);
		baseResponse.setMessageCode(messageProperty.getSuccessCode());
		baseResponse.setMessage(messageProperty.getSuccessMessage());
		baseResponse.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<Object>(baseResponse,HttpStatus.OK);
	}
	
}
