package br.ufg.familycare.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.ufg.familycare.model.Medicamento;

public interface MedicamentoRepository extends CrudRepository<Medicamento, Long> {

	@Override
	List<Medicamento> findAll();

}
