package com.idat.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.pizzeria.model.PizzeriaDetalle;

@Repository
public interface DetallePizzeriaRepository extends JpaRepository<PizzeriaDetalle, Integer>{
	
}
