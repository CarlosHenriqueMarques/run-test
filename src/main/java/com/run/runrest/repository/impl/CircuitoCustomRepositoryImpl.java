package com.run.runrest.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.run.runrest.repository.CircuitoCustomRepository;

@Repository
class CircuitoCustomRepositoryImpl implements CircuitoCustomRepository {

	@PersistenceContext
	private EntityManager em;

	// @Override
	// public List<Saldo> obterPorMatriculas(List<Long> matriculas) {
	//
	// TypedQuery<Saldo> query = em.createQuery("SELECT s FROM Saldo s JOIN FETCH
	// s.cota c WHERE s.id.numeroMatricula IN :matriculas", Saldo.class);
	// query.setParameter("matriculas", matriculas);
	//
	// List<Saldo> saldos = query.getResultList();
	//
	// return saldos;
	// }

}
