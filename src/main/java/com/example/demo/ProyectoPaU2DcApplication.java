package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IProfesorService;

@SpringBootApplication
public class ProyectoPaU2DcApplication implements CommandLineRunner {

	/*@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IProfesorService iProfesorService;*/
	
	@Autowired
	private ICiudadanoService ciudadanoService;
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	    Ciudadano ciu = new Ciudadano();
	    ciu.setNombre("Renato ");
	    ciu.setApellido("Coloma Pozo");
	    //this.ciudadanoService.guardar(ciu);
	    //this.ciudadanoService.borrar(8);
	   
        
        /*ciu.setId(14);
        this.ciudadanoService.modificar(ciu);*/
       
	  
	    Empleado empleado = new Empleado();
	    empleado.setSalario(new BigDecimal(300));
	    empleado.setIngreso(LocalDateTime.now());
	    empleado.setCiudadano(ciu);
	    this.ciudadanoService.guardar(ciu);
	    ciu.setEmpleado(empleado);
	    
	    //this.ciudadanoService.borrar(21);
	    this.empleadoService.agregar(empleado);
	   
	    //this.empleadoService.agregar(empleado);
	    //this.empleadoService.borrar(3);
	    
	    
	    //Segundo ejemplo
	    /*Ciudadano ciu2 = new Ciudadano();
	    ciu2.setNombre("Alberto");
	    ciu2.setApellido("Coloma Pozo");
	    
	    Empleado empleado2 = new Empleado();
	    empleado2.setSalario(new BigDecimal(200));
	    empleado2.setIngreso(LocalDateTime.now());
	    empleado2.setCiudadano(ciu2);
	    ciu2.setEmpleado(empleado2);*/
	    
	    //this.empleadoService.agregar(empleado2);
	   
	 
	   
	    
		
		
		
		
		

	}

}
