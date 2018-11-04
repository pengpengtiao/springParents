package org.springcloudPay.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplentConfig {
	@Bean(name="loadRestTemplent",value="loadRestTemplent")
	@LoadBalanced
	public RestTemplate getLoadRestTemplent() {
		return new RestTemplate();
	}
	@Bean(name="restTemplent",value="restTemplent")
	@LoadBalanced
	public RestTemplate getRestTemplent() {
		return new RestTemplate();
	}
	
}
