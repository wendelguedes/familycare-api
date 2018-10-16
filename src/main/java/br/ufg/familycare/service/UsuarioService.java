package br.ufg.familycare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.familycare.model.Usuario;
import br.ufg.familycare.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public Optional<Usuario> consultarPorId(Long id) {
		return usuarioRepository.findById(id);
	}
	
	public Usuario consultarPorEmail(String email) {
		return usuarioRepository.findByEmail(email);
	}

	public List<Usuario> listarTodos() {
		return usuarioRepository.findAll();
	}

	public void deletarPorId(Long id) {
		usuarioRepository.deleteById(id);
	}

}