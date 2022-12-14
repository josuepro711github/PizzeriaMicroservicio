package com.idat.pizzeria.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PizzaPizzeriaFK implements Serializable{

	private static final long serialVersionUID = 7442961068266842060L;
	
	@Column(name = "id_pizzeria", nullable = false, unique = true)
	private Integer idPizzeria;
	
	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idPizza;

	public Integer getIdPizzeria() {
		return idPizzeria;
	}

	public void setIdPizzeria(Integer idPizzeria) {
		this.idPizzeria = idPizzeria;
	}

	public Integer getIdPizza() {
		return idPizza;
	}

	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}

	
	
	
}
