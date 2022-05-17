package com.crud.spring.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado_a")
public class AsignadoA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="dni")
	Cientifico cientifico;
	
	@ManyToOne
	@JoinColumn(name="id_proyecto")
	Proyecto proyecto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cientifico getCientifico() {
		return cientifico;
	}

	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "AsignadoA [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}
	
}
