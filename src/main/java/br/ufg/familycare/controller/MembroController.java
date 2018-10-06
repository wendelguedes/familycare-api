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
	Membro consultar(@PathVariable Long id) {
		return membroService.consultar(id).get();
	}

	@PutMapping("/membros/{id}")
	Membro alterarMembro(@Valid Membro novoMembro, @PathVariable Long id) {

		return membroService.consultar(id)
				.map(membro -> {
					membro.setNome(novoMembro.getNome());
					return membroService.salvar(membro);
				})
				.orElseGet(() -> {
					novoMembro.setId(id);
					return membroService.salvar(novoMembro);
				});
	}

	@GetMapping("/membros")
	List<Membro> listar() {
		return membroService.listar();
	}

	@DeleteMapping("/membros/{id}")
	void removerMembro(@PathVariable Long id) {
		membroService.remover(id);
	}
}
