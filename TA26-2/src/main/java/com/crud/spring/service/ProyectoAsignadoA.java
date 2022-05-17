package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.IProyectoDAO;
import com.crud.spring.dto.Proyecto;

@Service
public class ProyectoAsignadoA implements IProyectoService{
	
	@Autowired
	IProyectoDAO iProyectoDAO;

	@Override
	public List<Proyecto> listarProyecto() {
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto createProyecto(Proyecto proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyecto readProyecto(String id) {
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto updateProyecto(Proyecto proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void deleteProyecto(String id) {
		iProyectoDAO.deleteById(id);
	}
	
	

}
