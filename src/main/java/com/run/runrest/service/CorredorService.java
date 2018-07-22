package com.run.runrest.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.run.runrest.model.dto.CorredorDTO;

@org.springframework.stereotype.Service
@Transactional
public interface CorredorService {
	
	public CorredorDTO add(CorredorDTO input);
	
	public List<CorredorDTO> obterCorredor(Long idCorredor);

}
