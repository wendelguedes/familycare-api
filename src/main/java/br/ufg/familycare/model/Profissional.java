package br.ufg.familycare.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import br.ufg.familycare.enuns.Sexo;
import lombok.Data;

@Entity
@Data
public class Profissional {

	@Id 
	@GeneratedValue
	private Long id;

	@NotBlank
	@Size(min=1,max=255, message="O campo nome ultrapassou o limite de 255 caracteres.")
	private String nome;

	@Email(message="Informe um e-mail válido.")
	@Size(min=0,max=255, message="O campo e-mail ultrapassou o limite de 255 caracteres.")
	private String email;

	@Size(min=0,max=20, message="O campo telefone ultrapassou o limite de 20 caracteres.")
	private String telefone;

	@Size(min=0,max=255, message="O campo endereço ultrapassou o limite de 255 caracteres.")
	private String endereço;

	private BigDecimal peso;

	private BigDecimal Altura;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Size(min=1,max=255, message="O nome da imagem de perfil ultrapassou o limite de 255 caracteres.")
	private String imagemPerfil;

}
