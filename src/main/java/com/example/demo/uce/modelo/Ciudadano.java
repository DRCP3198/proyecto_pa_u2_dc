package com.example.demo.uce.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="ciudadano")
public class Ciudadano {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ciu_seq")
	//Buena practica el nombre se le coloca el mismo de la secuencia
	@SequenceGenerator(name ="ciu_seq",sequenceName = "ciu_seq",allocationSize = 1) 
	@Column(name= "ciu_id")
	private Integer id;
	
	@Column(name= "ciu_nombre")
	private String nombre;
	
	@Column(name= "ciu_apellido")
	private String apellido;
	
	//Para decirle la relacion 1 a 1 ponemos la notacion @OneToOne
	@OneToOne(mappedBy = "ciudadano")
	//La relacion onetToOne le vamos a decir que el empleado se mapea
	//a ciudadano
	//Le debo decir empleado con que se va relacionar
	private Empleado empleado;
	
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
	
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
