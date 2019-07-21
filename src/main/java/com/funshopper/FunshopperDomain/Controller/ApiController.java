package com.funshopper.FunshopperDomain.Controller;


import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class ApiController {
	@Value("${spring.application.name:unnamed_app}")
	String applicationName;

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				 .select()
		         .apis(RequestHandlerSelectors.withClassAnnotation(RepositoryRestResource.class))
				 .paths(regex(".*/api/.*")).build().pathMapping("/")
				.apiInfo(new ApiInfoBuilder().title(applicationName + " Endpoints").build());
				//.apis(RequestHandlerSelectors.any()).

	}

	@GetMapping(value = "/")
	public ModelAndView getApiInfo() {
		return new ModelAndView("redirect:/swagger-ui.html");
	}
}
