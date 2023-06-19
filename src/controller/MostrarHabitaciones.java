package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.DisponibilidadHabitacion;
import modelo.Habitacion;
import modelo.Simple;
import modelo.Sistema;
import modelo.Suite;
import modelo.TipoHabitacion;

public class MostrarHabitaciones {
	
	Sistema sistema = Sistema.getInstance();
	
	public ArrayList<Habitacion> mostrarHabitacionesXFiltros(DisponibilidadHabitacion disponibilidad, int capacidad, TipoHabitacion tipo, LocalDate fecha){
		ArrayList<Habitacion> habitaciones = (ArrayList<Habitacion>) sistema.getHabitaciones();
		ArrayList<Habitacion> clone = new ArrayList<Habitacion>();
		
		for (Habitacion lista: habitaciones) {
			clone.add(lista);
		}
		
		if (disponibilidad != null) {
			clone.removeIf(t -> t.getDisponibilidadXDia(fecha) != disponibilidad.toString());
		}
		
		if (capacidad != -1 ) {
			clone.removeIf(t -> t.getCapacidad() != capacidad);
		}
		
		if (tipo != null) {
			if (tipo.equals(TipoHabitacion.SIMPLE)) {
				clone.removeIf(t -> t instanceof Suite);
			} else {
				clone.removeIf(t -> t instanceof Simple);
			}
		}	
		
		return clone;
	}

}
