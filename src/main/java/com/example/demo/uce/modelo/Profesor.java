package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//PARA decirle que voy a trabajar con una tabla de la base de datos
//Relacion tabla objeto Java.

@Entity
@Table(name = "profesor")
public class Profesor {
	
	//Mapear la columnas de la tabla como atributos
	//Los tipos de datos que vamos a mapear no con tipos primitivos
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "prof_seq")
	//Buena practica el nombre se le coloca el mismo de la secuencia
	@SequenceGenerator(name ="prof_seq",sequenceName = "prof_seq",allocationSize = 1) 
	@Column(name = "prof_id")
	private  Integer id;

	@Column(name = "prof_nombre")
	private String nombre;

	@Column(name = "prof_apellido")
	private String apellido;

	@Column(name = "prof_materia")
	private String materia;

	@Column(name = "prof_cedula")
	private String cedula;

	@Column(name = "prof_telefono")
	private String telefono;
	
	@Column(name = "prof_nivel_estudio")
	private String nivelEstudio;
	
	
	
	//SET y GET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNivelEstudio() {
		return nivelEstudio;
	}

	public void setNivelEstudio(String nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", materia=" + materia
				+ ", cedula=" + cedula + ", telefono=" + telefono + ", nivelEstudio=" + nivelEstudio + "]";
	}

	
	
	
	
	
	
	
	
	
	
	

}
