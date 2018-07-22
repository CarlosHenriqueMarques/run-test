package com.run.runrest.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Corrida implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long idCorrida;

	private String nomeCorrida;
	
	private LocalDate dataCorrida;
	
	private Long tamanhoPercurso;
	
	@ManyToOne
	@JoinColumn(name = "idEndereco", insertable = false, updatable = false)
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name = "idCircuito", insertable = false, updatable = false)
	private Circuito circuito;
	
	@OneToMany(mappedBy = "corrida")
	private List<CorredorCorrida> corredorCorrida;
	
	@OneToMany(mappedBy = "corrida")
	private List<PatrocinioCorrida> patrocinioCorrida;
	
}