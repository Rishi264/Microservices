package com.example.cloudgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
		@Bean
		public RouteLocator getRoutesLocator(RouteLocatorBuilder rout) {
			return rout.routes()
					.route(p->p.path("/notes/**").uri("lb://noteservice/notes"))
					.route(p->p.path("/comments/**").uri("lb://commentservice/comments"))
					.build();
		}
		
}
