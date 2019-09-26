package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Oportunidade;
import com.example.demo.repository.OportunidadeRepository;

@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {
	
	@Autowired
	private OportunidadeRepository oportunidades;
	
	@GetMapping
	public List<Oportunidade> listar() {
//		Oportunidade oportunidade = new Oportunidade();
//		oportunidade.setId(1L);
//		oportunidade.setDescricao("Desenvolvimento de ERP com Angulas/Spring");
//		oportunidade.setNomeProspecto("Grupo Logistica Brasil02");
//		oportunidade.setValor(new BigDecimal(490000));
//		return Arrays.asList(oportunidade);
		
		return oportunidades.findAll();
	}

}
