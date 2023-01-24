package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Empleado;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.modelo.Profesor;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IEmpleadoService;
import com.example.demo.uce.service.IEstudianteService;
import com.example.demo.uce.service.IHotelService;
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
	
	@Autowired
	private IHotelService hotelService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2DcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	    /*Ciudadano ciu = new Ciudadano();
	    ciu.setNombre("Renato ");
	    ciu.setApellido("Coloma Pozo");
	    //this.ciudadanoService.guardar(ciu);
	    //this.ciudadanoService.borrar(8);*/
	   
        
        /*ciu.setId(14);
        this.ciudadanoService.modificar(ciu);*/
       
	  
	   /*Empleado empleado = new Empleado();
	    empleado.setSalario(new BigDecimal(300));
	    empleado.setIngreso(LocalDateTime.now());
	    empleado.setCiudadano(ciu);
	    this.ciudadanoService.guardar(ciu);
	    ciu.setEmpleado(empleado);*/
	    
	    //this.ciudadanoService.borrar(21);
	    //this.empleadoService.agregar(empleado);
	   
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
	   
	 //----------------------------------------------------------------------------------------------------
		//HOTEL
		
		Hotel hotel = new Hotel();
		List<Habitacion > habitaciones = new ArrayList<>();
		
		hotel.setNombre("VeltMont ");
		hotel.setDireccion("Yaruqui");
		
		Habitacion hab = new Habitacion();
		hab.setNumero("A29");
		//hab.setNumero("A226");
		//hab.setNumero("A227");
		//hab.setNumero("A228");
		hab.setHotel(hotel);
		habitaciones.add(hab);
		hotel.setHabitaciones(habitaciones);
		
		this.hotelService.agregar(hotel);
		this.hotelService.borrar(11);
	
		
		hotel.setDireccion("San Andres -Quito");
		hotel.setId(9);
		this.hotelService.modificar(hotel);
		this.hotelService.encontrar(7);
	   

	}

}
