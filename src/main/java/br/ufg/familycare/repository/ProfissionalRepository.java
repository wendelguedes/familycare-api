package br.ufg.familycare.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufg.familycare.model.Profissional;

public interface ProfissionalRepository extends CrudRepository<Profissional, Long> {
	
	@Override
    List<Profissional> findAll();

}
