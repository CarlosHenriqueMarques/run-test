package com.run.runrest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.run.runrest.model.Corredor;

public interface CorredorRepository extends JpaRepository<Corredor, Long>, CorredorCustomRepository {

	List<Corredor> findByIdCorredor(Long idCorredor);
}