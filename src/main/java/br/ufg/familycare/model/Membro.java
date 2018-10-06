package br.ufg.familycare.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.ufg.familycare.enuns.Sexo;
import lombok.Data;

@Entity
@Data
public class Membro {

	@Id 
	@GeneratedValue
	private Long id;

	@NotNull(message="A data de nascimento é obrigatória")
	private Date dataNascimento;

	@NotBlank(message="{nome.notblank}")
	@Size(min=1,max=255, message="{nome.size}")
	private String nome;

	@Email(message="Informe um e-mail válido.")
	@Size(min=0,max=255, message="O e-mail do membro ultrapassou o limite de 255 caracteres.")
	private String email;

	@Size(min=0,max=20, message="O telefone do membro ultrapassou o limite de 20 caracteres.")
	private String telefone;

	private BigDecimal peso;

	private BigDecimal Altura;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Size(min=1,max=255, message="O nome da imagem de perfil ultrapassou o limite de 255 caracteres.")
	private String imagemPerfil;

}
