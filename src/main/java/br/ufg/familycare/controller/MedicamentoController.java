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

import br.ufg.familycare.model.Medicamento;
import br.ufg.familycare.service.MedicamentoService;
import io.swagger.annotations.Api;

@RestController
@Api(value = "medicamentos", description = "Cadastro de medicamentos")
public class MedicamentoController {

	@Autowired
	private MedicamentoService medicamentoService;

	@PostMapping("/medicamentos")
	Medicamento cadastrar(@Valid @RequestBody Medicamento medicamento) {
		return medicamentoService.salvar(medicamento);
	}

	@GetMapping("/medicamentos/{id}")
	Medicamento consultarPorId(@PathVariable Long id) {
		return medicamentoService.consultarPorId(id).get();
	}

	@PutMapping("/medicamentos/{id}")
	Medicamento alterarMedicamento(@Valid Medicamento medicamento, @PathVariable Long id) {
		return medicamentoService.salvar(medicamento);
	}

	@GetMapping("/medicamentos")
	List<Medicamento> listarTodos() {
		return medicamentoService.listarTodos();
	}

	@DeleteMapping("/medicamentos/{id}")
	void deletarPorId(@PathVariable Long id) {
		medicamentoService.deletarPorId(id);
	}
}
