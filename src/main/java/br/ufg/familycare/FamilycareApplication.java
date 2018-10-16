package br.ufg.familycare;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.ufg.familycare.enums.EnumPerfil;
import br.ufg.familycare.model.Usuario;
import br.ufg.familycare.repository.UsuarioRepository;


@SpringBootApplication
public class FamilycareApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilycareApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			initUsers(usuarioRepository, passwordEncoder);
		};

	}

	private void initUsers(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
		Usuario UsuarioTemp = usuarioRepository.findByEmail("admin@familycare.com");
		if (UsuarioTemp == null) {
			Usuario usuarioAdmin = new Usuario();
			usuarioAdmin.setEmail("admin@familycare.com");
			usuarioAdmin.setPassword(passwordEncoder.encode("123456"));
			usuarioAdmin.setPerfil(EnumPerfil.ADMIN);
			usuarioRepository.save(usuarioAdmin);
		}
	}
}
