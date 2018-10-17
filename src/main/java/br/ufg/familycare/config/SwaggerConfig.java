package br.ufg.familycare.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.ufg.familycare"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaData())
				.securitySchemes(Arrays.asList(apiKey()))
				.useDefaultResponseMessages(false);
	}

	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("FamilyCare - Sistema para gestão familiar.")
				.description("Bibliotecas: Spring Boot 2.0.5.RELEASE, Swagger-ui 2.8.0, Postgresql, Java 8 e Lombok")
				.version("version 1.0")
				.build();
	}
	
	private ApiKey apiKey() {
        return new ApiKey("Authorization", "Authorization", "header");
      }

}