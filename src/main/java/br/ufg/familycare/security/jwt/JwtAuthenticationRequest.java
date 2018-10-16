package br.ufg.familycare.security.jwt;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class JwtAuthenticationRequest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String email;

	@Getter
	@Setter
	private String password;

}
