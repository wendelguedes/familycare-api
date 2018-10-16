package br.ufg.familycare.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufg.familycare.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Usuario findByEmail(String email);

	@Override
	List<Usuario> findAll();

}
