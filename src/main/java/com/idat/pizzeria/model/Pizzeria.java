package com.idat.pizzeria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pizzerias")
public class Pizzeria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizzeria;
	private String dirrecion;
	private String sede;
	
	public Pizzeria() {
		super();
	}

	public Pizzeria(Integer idPizzeria, String dirrecion, String sede) {
		super();
		this.idPizzeria = idPizzeria;
		this.dirrecion = dirrecion;
		this.sede = sede;
	}

	public Integer getIdPizzeria() {
		return idPizzeria;
	}

	public void setIdPizzeria(Integer idPizzeria) {
		this.idPizzeria = idPizzeria;
	}

	public String getDirrecion() {
		return dirrecion;
	}

	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}
	
	
	
}
