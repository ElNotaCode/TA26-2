package com.crud.spring.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="proyecto")
public class Proyecto {

	@Id
	private String id;
	@Column(name="nombre")
	private String nombre;
	@Column(name="horas")
	private int horas;
	
	@OneToMany
	@JoinColumn(name="id_proyecto")
	private List<AsignadoA> asignadoA;

	public Proyecto() {
		
	}
	
	public Proyecto(String id, String nombre, int horas, List<AsignadoA> asignadoA) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignadoA = asignadoA;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@OneToMany
	@JoinColumn(name="id_proyecto")
	public List<AsignadoA> getAsignadoA() {
		return asignadoA;
	}

	public void setAsignadoA(List<AsignadoA> asignadoA) {
		this.asignadoA = asignadoA;
	}
	
}