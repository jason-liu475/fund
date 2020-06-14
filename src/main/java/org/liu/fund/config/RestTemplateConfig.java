package org.liu.fund.config;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author liu
 */
@Slf4j
@Configuration
public class RestTemplateConfig {
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder, ClientHttpRequestFactory clientHttpRequestFactory) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		restTemplate.setRequestFactory(clientHttpRequestFactory);
		return restTemplate;
	}
	@Bean
	public ClientHttpRequestFactory simpleClientHttpRequestFactory(){
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		//单位为ms
		factory.setReadTimeout(5000);
		//单位为ms
		factory.setConnectTimeout(5000);
		return factory;
	}
}
