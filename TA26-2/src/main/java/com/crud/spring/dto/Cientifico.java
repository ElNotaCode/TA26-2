package com.crud.spring.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cientificos")
public class Cientifico {
	
	@Id
	private String dni;
	@Column(name="nombre_apellidos")
	private String nombre_apellidos;
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<AsignadoA> asignadoA;
	
	public Cientifico() {
		
	}

	public Cientifico(String dni, String nombre_apellidos, List<AsignadoA> asignadoA) {
		//super();
		this.dni = dni;
		this.nombre_apellidos = nombre_apellidos;
		this.asignadoA = asignadoA;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre_apellidos() {
		return nombre_apellidos;
	}

	public void setNombre_apellidos(String nombre_apellidos) {
		this.nombre_apellidos = nombre_apellidos;
	}

	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "AsignadoA")
	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}

	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nombre_apellidos=" + nombre_apellidos + ", asignadoA=" + asignadoA + "]";
	}
	
}
