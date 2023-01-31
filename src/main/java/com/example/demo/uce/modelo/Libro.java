package com.example.demo.uce.modelo;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro")
//PRINCIPAL puede ser cualquiera de las dos
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_lib")
	@SequenceGenerator(name = "seq_lib", sequenceName = "seq_lib",allocationSize = 1)
	@Column(name = "lib_id")
	private Integer id;
	
	@Column(name = "lib_nombre")
	private String nombre;
	
	@Column(name = "lib_editorial")
	private String editorial;

	//Cuando voy a usar un mapeo directo lo remplace por un conjunto "Set" en ves de una collecion List
	@ManyToMany
	//En la principal debemos poner la anotacion @JoinTable debe tener el nombre de la tabla de bautizo como
	//de rompimiento, normalmente libro_autor que va ser la tabla de rompimiento.El siguiente atributo
	//joinColumns = @JoiColumn y le doy la PK con la que va a representarse 
	@JoinTable(
	name ="libro_autor",   //Nombre de la Tabla de rompimiento
	joinColumns =@JoinColumn(name="liau_id_libro"),//La columna FK de libro
	inverseJoinColumns = @JoinColumn(name="liau_id_autor")//la columna FK autor
	)
	private Set<Autor> autores;
	
	//SET y  GET
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", editorial=" + editorial + ", autores=" + autores + "]";
	}
	
	
	

}
