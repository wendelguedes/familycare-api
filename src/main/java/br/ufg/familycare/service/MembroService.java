package br.ufg.familycare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.familycare.model.Membro;
import br.ufg.familycare.repository.MembroRepository;

@Service
public class MembroService {

	@Autowired
	private MembroRepository membroRepository;

	public Membro salvar(Membro membro) {
		return membroRepository.save(membro);
	}

	public Optional<Membro> consultar(Long id) {
		return membroRepository.findById(id);
	}

	public List<Membro> listar() {
		return (List<Membro>) membroRepository.findAll();
	}

	public void remover(Long id) {
		membroRepository.deleteById(id);
	}

}