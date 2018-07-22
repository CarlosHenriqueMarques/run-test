package com.run.runrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.run.runrest.model.Circuito;

public interface CircuitoRepository extends JpaRepository<Circuito, Long>, CircuitoCustomRepository {

	List<Circuito> findByIdCircuito(Long idCircuito);
}