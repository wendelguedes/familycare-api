package br.ufg.familycare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.ufg.familycare.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({ FileStorageProperties.class })
public class FamilycareApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilycareApplication.class, args);
	}
}
