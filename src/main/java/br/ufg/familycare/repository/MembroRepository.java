package br.ufg.familycare.repository;

import org.springframework.data.repository.CrudRepository;

import br.ufg.familycare.model.Membro;

public interface MembroRepository extends CrudRepository<Membro, Long> {

}
