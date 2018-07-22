package com.run.runrest.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CorredorCorrida implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long idCorredorCorrida;

	@ManyToOne
	@JoinColumn(name = "idCorredor", insertable = false, updatable = false)
	private Corredor corredor;
	
	@ManyToOne
	@JoinColumn(name = "idCorrida", insertable = false, updatable = false)
	private Corrida corrida;
	
	private LocalDate tempoChegada;
	
}