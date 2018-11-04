package org.springcloudOrder.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestRibbnDemo {
	@RequestMapping("/order")
	public ResponseEntity<String> order(){
		return new ResponseEntity<String>("HELLO ORDER SERVER  8890", HttpStatus.OK);
	}

}
