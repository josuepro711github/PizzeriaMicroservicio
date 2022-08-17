package com.idat.pizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.pizzeria.client.OpenFeignClient;
import com.idat.pizzeria.dto.Pizza;
import com.idat.pizzeria.model.PizzaPizzeriaFK;
import com.idat.pizzeria.model.Pizzeria;
import com.idat.pizzeria.model.PizzeriaDetalle;
import com.idat.pizzeria.repository.DetallePizzeriaRepository;
import com.idat.pizzeria.repository.PizzeriaRepository;

@Service
public class PizzeriaServiceImpl implements PizzeriaService {

	@Autowired
	private PizzeriaRepository repository;
	
	@Autowired
	private DetallePizzeriaRepository repositoryDetalle;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Override
	public List<Pizzeria> listar() {
		return repository.findAll();
	}

	@Override
	public Pizzeria obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizzeria pizzeria) {
		repository.save(pizzeria);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Pizzeria pizzeria) {
		repository.saveAndFlush(pizzeria);
	}

	@Override
	public void asignarPizzaPizzeria() {
		
		List<Pizza> listado = feign.listarPizzasSeleccionados();
		PizzaPizzeriaFK fk = null;
		PizzeriaDetalle detalle = null;
		
		for (Pizza pizza : listado) {
			fk = new PizzaPizzeriaFK();
			fk.setIdPizza(pizza.getIdPizza());;
			fk.setIdPizzeria(1);
			
			detalle = new PizzeriaDetalle();
			detalle.setFk(fk);
			
			repositoryDetalle.save(detalle);
		}
		
	}
}


















