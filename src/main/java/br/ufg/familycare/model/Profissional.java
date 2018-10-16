package br.ufg.familycare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Profissional {

	@Id 
	@GeneratedValue
	private Long id;

	@NotBlank(message="{nome.notblank}")
	@Size(min=1,max=255, message="{nome.size}")
	private String nome;

	@Email(message="{email.valido}")
	@Size(min=0,max=255, message="{email.size}")
	private String email;
	
	private String especialidade;

	private String teleCelular;

	private String telefoneFixo;

	private String endereco;

}
