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
import com.example.demo.uce.service.IHabitacionService;
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
	
	@Autowired
	private IHabitacionService habitacionService;
	
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
		
		
		hotel.setNombre("VeltMont ");
		hotel.setDireccion("Yaruqui");
		
		
		List<Habitacion > habitaciones = new ArrayList<>();
		Habitacion hab = new Habitacion();
		hab.setNumero("A29");
		hab.setHotel(hotel);
		habitaciones.add(hab);
		
		
		Habitacion hab1 = new Habitacion();
		hab1.setNumero("A28");
		hab1.setHotel(hotel);
		habitaciones.add(hab1);
		
		
		
		Habitacion hab2 = new Habitacion();
		hab2.setNumero("A30");
		hab2.setHotel(hotel);
		habitaciones.add(hab2);
		
		
		Habitacion hab3 = new Habitacion();
		hab3.setNumero("A31");
		hab3.setHotel(hotel);
		habitaciones.add(hab3);
		
		
		Habitacion hab4 = new Habitacion();
		hab4.setNumero("A32");
		hab4.setHotel(hotel);
		habitaciones.add(hab4);
		
		hotel.setHabitaciones(habitaciones);
	
		
		//Para agregar a un hotel especifico un dormitorio extra
		/*Hotel hot= this.hotelService.encontrar(7);
		Habitacion hab5 = new Habitacion();
		hab5.setNumero("C56");
		hab5.setHotel(hot);
		habitaciones.add(hab5);
		this.habitacionService.guardar(hab5);*/
		//this.habitacionService.eliminar(11);
		
		/*Habitacion habit = this.habitacionService.encontrar(31);
		this.habitacionService.eliminar(31);*/
		//****************************************************************
		//Consultar el hotel por su id y imprimir todas sus habitaciones
		 Hotel consulta = this.hotelService.encontrar(5);
		
		 //consulta.getHabitaciones();
		 for (Habitacion habitacion : consulta.getHabitaciones()) {
			
			System.out.println(habitacion);
			
		}
		
		
		//this.
		
		
		/*this.hotelService.agregar(hotel);
		this.hotelService.borrar(4);
		Hotel hotelito = this.hotelService.encontrar(8);
		hotelito.setDireccion("Tumbaco");
		hotelito.setNombre("Hotel Quito");
		this.hotelService.modificar(hotelito);*/
		
	
		
		/*hotel.setDireccion("San Andres -Quito");
		hotel.setId(9);
		//this.hotelService.modificar(hotel);
		this.hotelService.encontrar(7);*/
		
	   

	}

}
