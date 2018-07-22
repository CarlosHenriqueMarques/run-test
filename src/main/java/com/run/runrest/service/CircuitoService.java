package com.run.runrest.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.run.runrest.model.dto.CircuitoDTO;

@org.springframework.stereotype.Service
@Transactional
public interface CircuitoService {

	List<CircuitoDTO> obterCircuitos(Long idCircuito);

}
