package br.ufg.familycare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.familycare.model.Consulta;
import br.ufg.familycare.repository.ConsultaRepository;

@Service
public class ConsultaService {

	@Autowired
	private ConsultaRepository consultaRepository;

	public Consulta salvar(Consulta consulta) {
		return consultaRepository.save(consulta);
	}

	public Optional<Consulta> consultarPorId(Long id) {
		return consultaRepository.findById(id);
	}

	public List<Consulta> listarTodos() {
		List<Consulta> consultas = consultaRepository.findAll();
		return consultas;
	}

	public void deletarPorId(Long id) {
		consultaRepository.deleteById(id);
	}

}