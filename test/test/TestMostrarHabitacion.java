package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controller.CargaHabitaciones;
import controller.MostrarHabitaciones;
import modelo.DisponibilidadHabitacion;
import modelo.Habitacion;
import modelo.Simple;
import modelo.TipoHabitacion;

class TestMostrarHabitacion {

	@Test
	void test() {
		CargaHabitaciones cargah = new CargaHabitaciones();
		MostrarHabitaciones mostrarh = new MostrarHabitaciones();
		
		ArrayList<Habitacion> test = new ArrayList<Habitacion>();
		test.add(new Simple(200, DisponibilidadHabitacion.Disponible,2,20));
		test.add(new Simple(500, DisponibilidadHabitacion.Disponible,2,50));
		
		cargah.crearHabitacion(200, DisponibilidadHabitacion.Disponible, 2, 20, TipoHabitacion.SIMPLE);
		cargah.crearHabitacion(300, DisponibilidadHabitacion.Disponible, 3, 50, TipoHabitacion.SIMPLE);
		cargah.crearHabitacion(400, DisponibilidadHabitacion.Disponible, 4, 100, TipoHabitacion.SUITE);
		cargah.crearHabitacion(500, DisponibilidadHabitacion.Disponible, 2, 50, TipoHabitacion.SIMPLE);
		
		ArrayList<Habitacion> lista = mostrarh.mostrarHabitacionesXFiltros(null, 2, null);
		
		for (Habitacion habitacion: lista) {
			String s1 = String.valueOf(habitacion.getNumero());
			String s2;
			if (habitacion instanceof Simple) {
				s2 = "Simple";
			} else {
				s2 = "Suite";
			}
			String s3 = habitacion.getDisponibilidad().toString();
			String s4 = String.valueOf(habitacion.getCapacidad());
			String s5 = String.valueOf(habitacion.getPrecioDiario());
			System.out.println(String.format("%20s %20s %20s %20s %20s", s1, s2, s3, s4, s5));
		}
	}

}
