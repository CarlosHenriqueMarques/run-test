package com.run.runrest.model;

import java.io.Serializable;

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
public class PatrocinioCorrida implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long idPatrocinioCorrida;

	@ManyToOne
	@JoinColumn(name = "idPatrocinio", insertable = false, updatable = false)
	private Patrocinio patrocinio;

	@ManyToOne
	@JoinColumn(name = "idCorrida", insertable = false, updatable = false)
	private Corrida corrida;

}