package br.ufg.familycare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.familycare.model.Medicamento;
import br.ufg.familycare.repository.MedicamentoRepository;

@Service
public class MedicamentoService {

	@Autowired
	private MedicamentoRepository medicamentoRepository;

	public Medicamento salvar(Medicamento medicamento) {
		return medicamentoRepository.save(medicamento);
	}

	public Optional<Medicamento> consultarPorId(Long id) {
		return medicamentoRepository.findById(id);
	}

	public List<Medicamento> listarTodos() {
		return medicamentoRepository.findAll();
	}

	public void deletarPorId(Long id) {
		medicamentoRepository.deleteById(id);
	}

}