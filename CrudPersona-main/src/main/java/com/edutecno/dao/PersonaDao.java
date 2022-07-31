package com.edutecno.dao;

import java.util.List;

import com.edutecno.model.Persona;

public interface PersonaDao {
	
	public List<Persona> findAll();
	public Persona findById(int id);
	public boolean add(Persona persona);
	public boolean update(Persona persona);
	public boolean delete(Persona persona);

}
