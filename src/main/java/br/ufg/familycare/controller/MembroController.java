package br.ufg.familycare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.familycare.model.Membro;
import br.ufg.familycare.model.Usuario;
import br.ufg.familycare.service.MembroService;
import io.swagger.annotations.Api;

@RestController
@Api(value = "Guidelines", description = "Cadastro de Membros")
public class MembroController {

	@Autowired
	private MembroService membroService;

	@PostMapping("/membros")
	Membro cadastrar(@Valid @RequestBody Membro membro) {
		return membroService.salvar(membro);
	}

	@GetMapping("/membros/{id}")
	Membro consultarPorId(@PathVariable Long id) {
		return membroService.consultarPorId(id).get();
	}
	
	@PutMapping("/membros/{id}")
	Membro alterarMembro(@Valid Membro membro, @PathVariable Long id) {
		return membroService.salvar(membro);
	}

	@GetMapping("/membros")
	List<Membro> listarTodos() {
		return membroService.listarTodos();
	}

	@DeleteMapping("/membros/{id}")
	void deletarPorId(@PathVariable Long id) {
		membroService.deletarPorId(id);
	}
}
