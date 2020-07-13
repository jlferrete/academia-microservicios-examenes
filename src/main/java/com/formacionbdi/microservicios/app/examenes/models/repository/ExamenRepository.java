package com.formacionbdi.microservicios.app.examenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.commons.examenes.models.entity.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Long> {

	
	
}
