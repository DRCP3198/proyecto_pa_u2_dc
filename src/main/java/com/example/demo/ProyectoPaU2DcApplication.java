package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU2DcApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Estudiante estu = new Estudiante();
		//estu.setId(2);
		estu.setNombre("RENATO");
		estu.setApellido("POZO");
		estu.setCedula("1751457167");
		estu.setCiudad("Quito");
		estu.setGenero("M");
		
	    this.estudianteService.agregar(estu);
		/*this.estudianteService.borrar(1);
		this.estudianteService.borrar(3);
		this.estudianteService.borrar(4);*/
	  //System.out.println(this.estudianteService.encontrar(4));
		
		
		
		
		

	}

}
