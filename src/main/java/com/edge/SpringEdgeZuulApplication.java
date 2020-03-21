package com.edge;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.edge.filter.ErrorFilter;
import com.edge.filter.PostFilterProxy;
import com.edge.filter.PreFilterProxy;
import com.edge.filter.RouteFilter;


@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableCircuitBreaker
public class SpringEdgeZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEdgeZuulApplication.class, args);
	}

	
	@Bean
	public PreFilterProxy preFilter() {
		return new PreFilterProxy();
	}

	@Bean
	public PostFilterProxy postFilter() {
		return new PostFilterProxy();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
