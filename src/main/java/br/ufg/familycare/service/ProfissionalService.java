package br.ufg.familycare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.familycare.model.Profissional;
import br.ufg.familycare.repository.ProfissionalRepository;

@Service
public class ProfissionalService {

	@Autowired
	private ProfissionalRepository profissionalRepository;

	public Profissional salvar(Profissional profissional) {
		return profissionalRepository.save(profissional);
	}

	public Optional<Profissional> consultar(Long id) {
		return profissionalRepository.findById(id);
	}

	public List<Profissional> listar() {
		return (List<Profissional>) profissionalRepository.findAll();
	}

	public void remover(Long id) {
		profissionalRepository.deleteById(id);
	}

}