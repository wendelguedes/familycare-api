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

import br.ufg.familycare.model.Consulta;
import br.ufg.familycare.service.ConsultaService;
import io.swagger.annotations.Api;

@RestController
@Api(value = "consultas", description = "Cadastro de consultas")
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;

	@PostMapping("/consultas")
	Consulta cadastrar(@Valid @RequestBody Consulta consulta) {
		return consultaService.salvar(consulta);
	}

	@GetMapping("/consultas/{id}")
	Consulta consultarPorId(@PathVariable Long id) {
		return consultaService.consultarPorId(id).get();
	}

	@PutMapping("/consultas/{id}")
	Consulta alterarConsulta(@Valid Consulta consulta, @PathVariable Long id) {
		return consultaService.salvar(consulta);
	}

	@GetMapping("/consultas")
	List<Consulta> listarTodos() {
		return consultaService.listarTodos();
	}

	@DeleteMapping("/consultas/{id}")
	void deletarPorId(@PathVariable Long id) {
		consultaService.deletarPorId(id);
	}
}
