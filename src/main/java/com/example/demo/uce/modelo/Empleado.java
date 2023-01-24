package com.
example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table (name = "empleado")
@Entity
public class Empleado {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "empl_seq")
	//Buena practica el nombre se le coloca el mismo de la secuencia
	@SequenceGenerator(name ="empl_seq",sequenceName = "empl_seq",allocationSize = 1) 
	@Column(name="empl_id")
	private Integer id;
	
	@Column(name="empl_salario")
	private BigDecimal salario;
	
	@Column(name="empl_ingreso")
	private LocalDateTime ingreso;
	
	@OneToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name="empl_id_ciudadano")
	private Ciudadano ciudadano;

	
	//SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDateTime getIngreso() {
		return ingreso;
	}

	public void setIngreso(LocalDateTime ingreso) {
		this.ingreso = ingreso;
	}
	

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", salario=" + salario + ", ingreso=" + ingreso + "]";
	}
	
	
	


}
