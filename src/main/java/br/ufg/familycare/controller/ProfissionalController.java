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

import br.ufg.familycare.model.Profissional;
import br.ufg.familycare.service.ProfissionalService;
import io.swagger.annotations.Api;

@RestController
@Api(value = "Guidelines", description = "Cadastro de Profissionais")
public class ProfissionalController {

	@Autowired
	private ProfissionalService profissionalService;

	@PostMapping("/profissionais")
	Profissional cadastrar(@Valid @RequestBody Profissional profissional) {
		return profissionalService.salvar(profissional);
	}

	@GetMapping("/profissionais/{id}")
	Profissional consultarPorId(@PathVariable Long id) {
		return profissionalService.consultarPorId(id).get();
	}

	@PutMapping("/profissionais/{id}")
	Profissional alterarProfissional(@Valid Profissional profissional, @PathVariable Long id) {
		return profissionalService.salvar(profissional);
	}

	@GetMapping("/profissionais")
	List<Profissional> listarTodos() {
		return profissionalService.listarTodos();
	}

	@DeleteMapping("/profissionais/{id}")
	void deletarPorId(@PathVariable Long id) {
		profissionalService.deletarPorId(id);
	}
}
