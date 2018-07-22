package com.run.runrest.model;

import java.io.Serializable;
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
public class Patrocinio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long idPatrocinio;

	private String nomePatrocinio;
	
	@OneToMany(mappedBy = "patrocinio")
	private List<PatrocinioCorrida> patrocinioCorrida;

	
}