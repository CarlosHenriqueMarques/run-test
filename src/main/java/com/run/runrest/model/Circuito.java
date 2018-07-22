package com.run.runrest.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Circuito implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long idCircuito;

	private String nomeCircuito;
	
	LocalDate dataInicioCircuito;
	
	LocalDate dataFimCircuito;

	@OneToMany(mappedBy = "circuito")
	private List<Corrida> corridas;
	
}