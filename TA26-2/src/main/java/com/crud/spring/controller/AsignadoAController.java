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

import com.crud.spring.dto.AsignadoA;
import com.crud.spring.service.AsignadoAServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoAController {

	@Autowired
	AsignadoAServiceImpl asignadoAServiceImpl;
	
	//listar
	@GetMapping("/asignadoA")
	public List<AsignadoA> listarAsignadoA(){
		return asignadoAServiceImpl.listarAsignadoA();
	}
	//C
	@PostMapping("/asignadoA")
	public AsignadoA createAsignadoA(@RequestBody AsignadoA asignadoA) {
		return asignadoAServiceImpl.createAsignadoA(asignadoA);
	}
	
	//R
	@GetMapping("/asignadoA/{id}")
	public AsignadoA readAsignadoA(@PathVariable(name="id")int id) {
		return asignadoAServiceImpl.readAsignadoA(id);
	}
	
	//U
	@PutMapping("/asignadoA/{id}")
	public AsignadoA updateAsignadoA(@PathVariable(name="id")int id,@RequestBody AsignadoA asignadoA) {
		
		AsignadoA asignadoA_seleccionado = new AsignadoA();
		AsignadoA asignadoA_actualizado = new AsignadoA();
		
		asignadoA_seleccionado.setCientifico(asignadoA.getCientifico());
		asignadoA_seleccionado.setProyecto(asignadoA.getProyecto());
		
		asignadoA_actualizado = asignadoAServiceImpl.updateAsignadoA(asignadoA_seleccionado);
		
		return asignadoA_actualizado;
	}
	
	//D
	@DeleteMapping("/asignadoA/{id}")
	public void deleteAsignadoA(@PathVariable(name="id") int id) {
		asignadoAServiceImpl.deleteAsignadoA(id);
	}
	
}
