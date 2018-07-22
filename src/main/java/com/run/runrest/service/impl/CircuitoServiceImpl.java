package com.run.runrest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.run.runrest.model.dto.CircuitoDTO;
import com.run.runrest.model.mapper.CircuitoMapper;
import com.run.runrest.repository.CircuitoRepository;
import com.run.runrest.service.CircuitoService;

@Service
public class CircuitoServiceImpl implements CircuitoService {

	@Autowired
	private CircuitoRepository circuitoRepository;

	@Autowired
	private CircuitoMapper circuitoMapper;

	@Override
	public List<CircuitoDTO> obterCircuitos(Long idCircuito) {
		List<CircuitoDTO> circuitos = circuitoMapper.mapper(circuitoRepository.findByIdCircuito(idCircuito));

		return circuitos;
	}	
	
}
