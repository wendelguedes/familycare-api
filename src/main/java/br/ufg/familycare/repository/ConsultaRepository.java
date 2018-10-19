package br.ufg.familycare.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufg.familycare.model.Consulta;

public interface ConsultaRepository extends CrudRepository<Consulta, Long> {

	@Override
	List<Consulta> findAll();

}
