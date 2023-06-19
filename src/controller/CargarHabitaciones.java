package controller;

import java.time.LocalDate;

import modelo.DisponibilidadHabitacion;
import modelo.Extra;
import modelo.Habitacion;
import modelo.Simple;
import modelo.Sistema;
import modelo.Suite;
import modelo.TipoHabitacion;

public class CargarHabitaciones {
	
	public Sistema sistema = Sistema.getInstance();
	
	public boolean crearHabitacion(int numero, int capacidad, double precioDiario, TipoHabitacion tipo) {
		Habitacion habitacion;
		boolean flag;
		
		if (tipo.equals(TipoHabitacion.SIMPLE)) {
			habitacion = new Simple(numero, capacidad, precioDiario);
		} else {
			habitacion = new Suite(numero, capacidad, precioDiario);
		}
		
		if (!sistema.validarHabitacionExistente(habitacion)) {
			sistema.agregarHabitaciones(habitacion);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public boolean cambiarDisponibilidadHabitacion(int numero, DisponibilidadHabitacion disponibilidad, LocalDate fecha) {
		Habitacion habitacion = sistema.getHabitacionXNumero(numero);
		boolean flag;
		
		if (habitacion != null) {
			habitacion.setDisponibilidadXDia(fecha, disponibilidad);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public boolean cambiarPrecioDiariodHabitacion(int numero, double precioDiario) {
		Habitacion habitacion = sistema.getHabitacionXNumero(numero);
		boolean flag;
		
		if (habitacion != null) {
			habitacion.setPrecioDiario(precioDiario);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public boolean agregarExtraHabitacion(int numero, Extra extra) {
		Habitacion habitacion = sistema.getHabitacionXNumero(numero);
		boolean flag;
		
		if (habitacion != null) {
			habitacion.agregarServicio(extra);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}

}
