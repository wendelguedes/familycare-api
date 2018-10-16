package br.ufg.familycare.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.ufg.familycare.enums.EnumPerfil;
import br.ufg.familycare.model.Usuario;

public class JwtUserFactory {

	private JwtUserFactory() {
	}

	public static JwtUser create(Usuario usuario) {
		return new JwtUser(usuario.getId(), usuario.getEmail(), usuario.getPassword(),
				mapToGrantedAuthorities(usuario.getPerfil()));
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(EnumPerfil perfil) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(perfil.toString()));
		return authorities;
	}
}