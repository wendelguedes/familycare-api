package br.ufg.familycare.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Consulta {

	@Id 
	@GeneratedValue
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date data;
	
	@Temporal(TemporalType.TIME)
	private Date hora;

	private String descricao;
	
	private String endereço;
	
	private Boolean lembrar;

	@ManyToOne
	private Membro membro;
	
	@ManyToOne
	private Profissional profissional;
	
}
