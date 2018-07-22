package com.run.runrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.run.runrest.model.Corrida;

public interface CorridaRepository extends JpaRepository<Corrida, Long>, CorridaCustomRepository {

	
}