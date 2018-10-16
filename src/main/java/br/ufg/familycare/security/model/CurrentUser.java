package br.ufg.familycare.security.model;

import br.ufg.familycare.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class CurrentUser {

	@Setter
	@Getter
	private String token;

	@Setter
	@Getter
	private Usuario usuario;
}
