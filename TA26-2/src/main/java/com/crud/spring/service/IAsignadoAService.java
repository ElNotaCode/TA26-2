package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.AsignadoA;

public interface IAsignadoAService {
	//listar
	public List<AsignadoA> listarAsignadoA();
	//C
	public AsignadoA createAsignadoA(AsignadoA asignadoA);
	//R
	public AsignadoA readAsignadoA(int id);
	//U
	public AsignadoA updateAsignadoA(AsignadoA asignadoA);
	//D
	public void deleteAsignadoA(int id);
}
