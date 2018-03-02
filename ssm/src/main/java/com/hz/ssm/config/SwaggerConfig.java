package com.hz.ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = "com.hz.ssm.controlller")
public class SwaggerConfig {

	@Bean
	public Docket creatDocket() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("hz.com").genericModelSubstitutes(DeferredResult.class)
				.select().apis(RequestHandlerSelectors.basePackage("com.hz")).paths(PathSelectors.any()).build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("黄镇ssm Api接口文档").description("黄镇").termsOfServiceUrl("http://www.baidu.com")
				.version("1.0").build();

	}
}