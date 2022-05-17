package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Cientifico;

public interface ICientificoService  {
	//listar
	public List<Cientifico> listarCientificos();
	//C
	public Cientifico createCientifico(Cientifico cientifico);
	//R
	public Cientifico readCientifico(String dni);
	//U
	public Cientifico updateCientifico(Cientifico cientifico);
	//D
	public void deleteCientifico(String dni);
}
