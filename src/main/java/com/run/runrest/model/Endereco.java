package com.run.runrest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long idEndereco;

	private String rua;
	
	private String estado;
	
	private String cidade;
	
}