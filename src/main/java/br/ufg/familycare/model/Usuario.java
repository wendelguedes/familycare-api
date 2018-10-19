package br.ufg.familycare.model;

import javax.persistence.Column;
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import br.ufg.familycare.enums.EnumPerfil;
import lombok.Data;

@Entity
@Data
public class Usuario {

	@Id 
	@GeneratedValue
	private Long id;
	
	@NotBlank(message="{nome.notblank}")
	@Size(min=1,max=255, message="{nome.size}")
	private String nome;

	@Email(message="{email.valido}")
	@Size(min=0,max=255, message="{email.size}")
	@Column(unique=true)
	private String email;

	@Size(min=6,message="{password.size}")
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;

	@NotNull(message="{perfil.valido}")
	@Enumerated(EnumType.STRING)
	private EnumPerfil perfil;
	
	@Type(type = "org.hibernate.type.TextType")
	private String imagemPerfil;

}
