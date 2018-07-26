package com.run.runrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.run.runrest.model.dto.CorredorDTO;
import com.run.runrest.service.CorredorService;
import com.run.runrest.util.CustomErrorType;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
@RequestMapping("corredores")
public class CorredorController {

	@Autowired
	private CorredorService service;

	@ApiImplicitParams({
			@ApiImplicitParam(name = "idCorredor", value = "Obter as informações do corredor", required = true, dataType = "string", paramType = "path") })
	@GetMapping("/corredor/{idCorredor}")
	public List<CorredorDTO> obterCorredor(@PathVariable("idCorredor") Long idCorredor) {
		return this.service.obterCorredor(idCorredor);
	}

	@PostMapping("/corredor")
	public ResponseEntity<?> add(@RequestBody CorredorDTO input) {
		if (input.getIdCorredor() != null) {
			return new ResponseEntity<Object>(new CustomErrorType("Se saia que você está tentando inserir um corredor com ID. Aqui não pai"), HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(this.service.add(input), HttpStatus.OK);
	}

	@PutMapping("/corredor/{idCorredor}")
	public ResponseEntity<?> edit(@PathVariable("id") long id, @RequestBody CorredorDTO input) {
		service.add(input);
		System.out.println("EA");
		return null;
	}
}