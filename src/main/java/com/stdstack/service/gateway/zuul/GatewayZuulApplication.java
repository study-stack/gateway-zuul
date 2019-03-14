package com.stdstack.service.gateway.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableZuulProxy
@SpringBootApplication
@EnableResourceServer
@EnableSwagger2
@EnableEurekaClient
public class GatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayZuulApplication.class, args);
    }


}

