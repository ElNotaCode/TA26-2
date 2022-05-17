package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Proyecto;

public interface IProyectoService {
	//listar
	public List<Proyecto> listarProyecto();
	//C
	public Proyecto createProyecto(Proyecto proyecto);
	//R
	public Proyecto readProyecto(String id);
	//U
	public Proyecto updateProyecto(Proyecto proyecto);
	//D
	public void deleteProyecto(String id);
}
