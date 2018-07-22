package com.run.runrest.model.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.run.runrest.model.Circuito;
import com.run.runrest.model.dto.CircuitoDTO;

@Component
public class CircuitoMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	public List<CircuitoDTO> mapper(List<Circuito> circuitos) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		
		List<CircuitoDTO> circuitosDTO = modelMapper.map(circuitos, new TypeToken<List<CircuitoDTO>>() {}.getType());
		
		return circuitosDTO;
	}
}
