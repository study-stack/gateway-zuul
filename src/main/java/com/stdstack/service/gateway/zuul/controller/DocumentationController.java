package com.stdstack.service.gateway.zuul.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
@EnableAutoConfiguration
public class DocumentationController implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        resources.add(swaggerResource("stdstack-course-service", "/courses/v2/api-docs"));

        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion("0.1"); //we can take it from pom todo
        return swaggerResource;
    }
}
