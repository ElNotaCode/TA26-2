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

import com.crud.spring.dto.Proyecto;
import com.crud.spring.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectosController {
	
	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarProyectos(){
		return proyectoServiceImpl.listarProyecto();
	}
	
	@PostMapping("/proyectos")
	public Proyecto createProyecto(@RequestBody Proyecto proyecto){
		return proyectoServiceImpl.createProyecto(proyecto);
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyecto readProyecto(@PathVariable(name="id") String id) {
		return proyectoServiceImpl.readProyecto(id);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyecto updateProyecto(@RequestBody Proyecto proyecto,@PathVariable(name="id") String id) {
		
		Proyecto proyecto_seleccionado = new Proyecto();
		Proyecto proyecto_actualizado = new Proyecto();
		
		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());
		
		proyecto_actualizado = proyectoServiceImpl.updateProyecto(proyecto_seleccionado);
		
		return proyecto_actualizado;
		
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void deleteProyecto(@PathVariable(name="id")String id) {
		proyectoServiceImpl.deleteProyecto(id);
	}
	

}
