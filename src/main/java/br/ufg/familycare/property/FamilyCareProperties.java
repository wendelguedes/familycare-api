package br.ufg.familycare.property;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Validated
@Configuration
@ConfigurationProperties(prefix = "familycare")
public class FamilyCareProperties {

	@Getter
	@Setter
	@NotBlank
	private String uploadDir;

	@Getter
	@Setter
	private Jwt jwt;

	@Validated
	public static class Jwt {

		@Getter
		@Setter
		@NotBlank
		private String secret;

		@Getter
		@Setter
		@NotNull
		private Long expiration;
	}

}