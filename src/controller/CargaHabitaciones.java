package controller;

import modelo.DisponibilidadHabitacion;
import modelo.Habitacion;
import modelo.Simple;
import modelo.Sistema;
import modelo.Suite;
import modelo.TipoHabitacion;

public class CargaHabitaciones {
	
	public Sistema sistema = Sistema.getInstance();
	
	public String crearHabitacion(int numero, DisponibilidadHabitacion disponibilidad, int capacidad, double precioDiario, TipoHabitacion tipo) {
		Habitacion habitacion;
		String mensaje;
		
		if (tipo.equals(TipoHabitacion.SIMPLE)) {
			habitacion = new Simple(numero, disponibilidad, capacidad, precioDiario);
		} else {
			habitacion = new Suite(numero, disponibilidad, capacidad, precioDiario);
		}
		
		if (!sistema.validarHabitacionExistente(habitacion)) {
			sistema.agregarHabitaciones(habitacion);
			mensaje = "Se ha creado la habitacion";
		} else {
			mensaje = "Ya existe una habitacion con el numero indicado";
		}
		
		return mensaje;
	}
	
	public String cambiarDisponibilidadHabitacion(int numero, DisponibilidadHabitacion disponibilidad) {
		Habitacion habitacion = sistema.getHabitacionXNumero(numero);
		String mensaje;
		
		if (habitacion != null) {
			habitacion.setDisponibilidad(disponibilidad);
			mensaje = "Se ha modificado la disponibilidad correctamente";
		} else {
			mensaje = "No existe la habitacion para el numero indicado";
		}
		
		return mensaje;
	}
	
	public String cambiarPrecioDiariodHabitacion(int numero, double precioDiario) {
		Habitacion habitacion = sistema.getHabitacionXNumero(numero);
		String mensaje;
		
		if (habitacion != null) {
			habitacion.setPrecioDiario(precioDiario);
			mensaje = "Se ha modificado el precio diario correctamente";
		} else {
			mensaje = "No existe la habitacion para el numero indicado";
		}
		
		return mensaje;
	}

}
