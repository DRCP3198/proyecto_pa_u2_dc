package com.example.demo.uce.service;


import com.example.demo.uce.modelo.Profesor;

public interface IProfesorService {
	
	public void agregar(Profesor profesor);
	//CRUD siempre por pk "PRIMARY KEY"
	public void modificar(Profesor profesor);
	public Profesor encontrar(Integer id);
	public void borrar(Integer id);

}
