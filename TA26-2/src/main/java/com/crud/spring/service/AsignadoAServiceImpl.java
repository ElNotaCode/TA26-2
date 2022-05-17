package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.spring.dao.IAsignadoADAO;
import com.crud.spring.dto.AsignadoA;
import com.crud.spring.dto.Proyecto;

@Service
public class AsignadoAServiceImpl implements IAsignadoAService {
	
	@Autowired
	IAsignadoADAO iAsignadoADAO;

	@Override
	public List<AsignadoA> listarAsignadoA() {
		return iAsignadoADAO.findAll();
	}

	@Override
	public AsignadoA createAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public AsignadoA readAsignadoA(int id) {
		return iAsignadoADAO.findById(id).get();
	}

	@Override
	public AsignadoA updateAsignadoA(AsignadoA asignadoA) {
		return iAsignadoADAO.save(asignadoA);
	}

	@Override
	public void deleteAsignadoA(int id) {
		iAsignadoADAO.deleteById(id);
	}

}
