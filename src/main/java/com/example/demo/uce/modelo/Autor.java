package com.example.demo.uce.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "autor")
public class Autor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_aut")
	@SequenceGenerator(name = "seq_aut", sequenceName = "seq_aut",allocationSize = 1)
	@Column(name= "aut_id")
	private Integer id;
	
	@Column(name ="aut_nombre")
	private String nombre;
	
	
	@ManyToMany(mappedBy = "autores", cascade = CascadeType.ALL) //Nombre  del conjunto "Set" de Libro
	private Set<Libro> libros;

	
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

	public Set<Libro> getLibros() {
		return libros;
	}

	public void setLibros(Set<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", libros=" + libros + "]";
	}
	
	
	

}
