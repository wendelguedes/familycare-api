package br.ufg.familycare.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufg.familycare.model.Membro;

public interface MembroRepository extends CrudRepository<Membro, Long> {

    @Override
	List<Membro> findAll();

}
