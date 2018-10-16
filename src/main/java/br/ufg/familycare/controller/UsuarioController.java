package br.ufg.familycare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.familycare.model.Usuario;
import br.ufg.familycare.service.UsuarioService;
import io.swagger.annotations.Api;

@RestController
@Api(value = "Guidelines", description = "Cadastro de Usuários")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostMapping("/usuarios")
	Usuario cadastrar(@Valid @RequestBody Usuario usuario) {
		return usuarioService.salvar(usuario);
	}

	@GetMapping("/usuarios/{id}")
	Usuario consultarPorId(@PathVariable Long id) {
		return usuarioService.consultarPorId(id).get();
	}

	@PutMapping("/usuarios/{id}")
	Usuario alterarUsuario(@Valid Usuario usuario, @PathVariable Long id) {
		usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
		return usuarioService.salvar(usuario);
	}

	@GetMapping("/usuarios")
	List<Usuario> listarTodos() {
		return usuarioService.listarTodos();
	}

	@DeleteMapping("/usuarios/{id}")
	void deletarPorId(@PathVariable Long id) {
		usuarioService.deletarPorId(id);
	}
}
