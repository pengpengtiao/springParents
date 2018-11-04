package org.springcloudPay.servers.impl;

import org.springcloudPay.servers.PayToOrderService;
import org.springcloudPay.servers.PayToOrderServiceFegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class PayToOrderServiceImpl implements PayToOrderService {
	@Autowired
	@Qualifier("restTemplent")
	RestTemplate restTemplate;
	
	@Autowired
	PayToOrderServiceFegin payToOrderServiceFegin;
	
	public String payToOrderService() {
		ResponseEntity<String> result =  payToOrderServiceFegin.order();
		return result.getBody();
	}

}
