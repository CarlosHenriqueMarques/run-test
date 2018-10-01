package com.run.runrest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.run.runrest.model.Corredor;
import com.run.runrest.model.dto.CorredorDTO;
import com.run.runrest.model.mapper.CorredorMapper;
import com.run.runrest.repository.CorredorRepository;
import com.run.runrest.service.CorredorService;

@Service
public class CorredorServiceImpl implements CorredorService {

	@Autowired
	private CorredorRepository corredorRepository;

	@Autowired
	private CorredorMapper corredorMapper;

	@Override
	public CorredorDTO add(CorredorDTO input) {
		Corredor entity = corredorMapper.convertToEntity(input);
		corredorRepository.save(entity);
		//corredorRepository.salvarCorredor(entity);
		return input;
	}

	@Override
	public List<CorredorDTO> obterCorredor(Long idCorredor) {
		List<CorredorDTO> corredores = corredorMapper.mapperList(corredorRepository.findByIdCorredor(idCorredor));
		return corredores;
	}

	@Override
	public CorredorDTO edit(CorredorDTO input) {
		return null;
	}

}
