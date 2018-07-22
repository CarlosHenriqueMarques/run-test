package com.run.runrest.model.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.run.runrest.model.CorredorCorrida;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CorredorDTO {

	@JsonProperty(access = Access.READ_ONLY) 
	private Long idCorredor;

	
	private String nomeCorredor;

	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
	LocalDate dataNascimento;
	
	
	private String cpf;

	//@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	@JsonIgnore
	private List<CorredorCorrida> corredorCorrida;

}
