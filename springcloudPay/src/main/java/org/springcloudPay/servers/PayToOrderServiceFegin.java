package org.springcloudPay.servers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="order")
public interface PayToOrderServiceFegin {
	@RequestMapping("/order")
	public ResponseEntity<String> order();

}
