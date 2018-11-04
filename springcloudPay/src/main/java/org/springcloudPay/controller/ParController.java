package org.springcloudPay.controller;

import org.springcloudPay.servers.PayToOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParController {
	@Autowired
	PayToOrderService payToOrderService;
	
	@RequestMapping("/pay")
	public ResponseEntity<String> par(){
		return new ResponseEntity<String>(payToOrderService.payToOrderService(), HttpStatus.OK);
	}
}
