package com.crud.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.dto.Cientifico;
import com.crud.spring.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listaCientifico(){
		return cientificoServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientifico createCientifico(@RequestBody Cientifico cientifico) {
		return cientificoServiceImpl.createCientifico(cientifico);
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientifico readCientifico(@PathVariable(name="dni") String dni) {
		return cientificoServiceImpl.readCientifico(dni);
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientifico updateCientifico(@PathVariable(name="dni") String dni,@RequestBody Cientifico cientifico) {
		
		Cientifico cientifico_seleccionado = new Cientifico();
		Cientifico cientifico_actualizado = new Cientifico();
		
		cientifico_seleccionado.setDni(cientifico.getDni());
		cientifico_seleccionado.setNombre_apellidos(cientifico.getNombre_apellidos());
		
		cientifico_actualizado = cientificoServiceImpl.updateCientifico(cientifico_seleccionado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void deleteCliente(@PathVariable(name="dni") String dni) {
		cientificoServiceImpl.deleteCientifico(dni);
	}
	
}
