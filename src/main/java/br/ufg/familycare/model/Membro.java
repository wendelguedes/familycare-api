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

import org.hibernate.annotations.Type;

import br.ufg.familycare.enums.EnumSexo;
import lombok.Data;

@Entity
@Data
public class Membro {

	@Id 
	@GeneratedValue
	private Long id;

	@NotNull(message="{data-nascimento.notnull}")
	private Date dataNascimento;

	@NotBlank(message="{nome.notblank}")
	@Size(min=1,max=255, message="{nome.size}")
	private String nome;

	@Email(message="{email.valido}")
	@Size(min=0,max=255, message="{email.size}")
	private String email;

	@Size(min=0,max=20, message="{telefone.size}")
	private String telefone;

	private BigDecimal peso;

	private BigDecimal Altura;

	@Enumerated(EnumType.STRING)
	private EnumSexo sexo;

	@Type(type = "org.hibernate.type.TextType")
	private String imagemPerfil;

}
