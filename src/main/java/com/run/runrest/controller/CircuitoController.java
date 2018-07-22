package com.run.runrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.run.runrest.model.dto.CircuitoDTO;
import com.run.runrest.service.CircuitoService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
@RequestMapping("circuitos")
public class CircuitoController {

	@Autowired
	private CircuitoService service;

	@ApiImplicitParams({
			@ApiImplicitParam(name = "idCircuito", value = "Obter os circuitos", required = true, dataType = "string", paramType = "path")})
	@GetMapping("/circuito/{idCircuito}")
	public List<CircuitoDTO> obterSaldosPorMatricula(@PathVariable("idCircuito") Long idCircuito) {
		return this.service.obterCircuitos(idCircuito);
	}
}