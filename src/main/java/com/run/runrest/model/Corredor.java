package com.run.runrest.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Corredor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idCorredor;

	private String nomeCorredor;

	LocalDate dataNascimento;

	private String cpf;

	@JsonIgnore
	@OneToMany(mappedBy = "corredor")
	private List<CorredorCorrida> corredorCorrida;

}