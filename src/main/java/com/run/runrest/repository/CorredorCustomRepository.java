package com.run.runrest.repository;

import com.run.runrest.model.Corredor;

public interface CorredorCustomRepository {
	
	 public Corredor salvarCorredor(Corredor input);
	 
	 public Corredor editarCorredor(Corredor input);
}
