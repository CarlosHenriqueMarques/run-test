package com.run.runrest.model.mapper;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.run.runrest.model.Corredor;
import com.run.runrest.model.dto.CorredorDTO;

@Component
public class CorredorMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	public List<CorredorDTO> mapperList(List<Corredor> corredores) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		
		List<CorredorDTO> corredoresDTO = modelMapper.map(corredores, new TypeToken<List<CorredorDTO>>() {}.getType());
		
		return corredoresDTO;
	}
	
	public Corredor convertToEntity(CorredorDTO dto) {
		Corredor post = modelMapper.map(dto, Corredor.class);
//	    post.setSubmissionDate(dto.getSubmissionDateConverted(
//	      userService.getCurrentUser().getPreference().getTimezone()));
//	  
//	    if (postDto.getId() != null) {
//	        Post oldPost = postService.getPostById(postDto.getId());
//	        post.setRedditID(oldPost.getRedditID());
//	        post.setSent(oldPost.isSent());
//	    }
	    return post;
	}
	
	public CorredorDTO mapperSingle(Corredor corredor) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		
		CorredorDTO corredoresDTO = modelMapper.map(corredor, new TypeToken<List<CorredorDTO>>() {}.getType());
		
		return corredoresDTO;
	}
}
