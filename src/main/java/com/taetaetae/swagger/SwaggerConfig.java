package com.taetaetae.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
			.groupName("Test API")
			.apiInfo(new ApiInfoBuilder()
				.title("사칙연산 API")
				.description("스웨거를 활용해서 API문서를 만들어보아요")
				.version("1.0.1")
				.termsOfServiceUrl("https://taetaetae.github.io")
				.contact(new Contact(
					"taetaetae",
					"https://taetaetae.github.io/resume",
					"taetaetae_@naver.com")
				)
				.build()
			)
			.useDefaultResponseMessages(false)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.taetaetae.swagger"))
			.paths(PathSelectors.any())
			.build();
	}
}