package test;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controller.CargarHabitaciones;
import controller.MostrarHabitaciones;
import modelo.DisponibilidadHabitacion;
import modelo.Habitacion;
import modelo.Simple;
import modelo.TipoHabitacion;

class TestMostrarHabitacion {

	@Test
	void test() {
		CargarHabitaciones cargah = new CargarHabitaciones();
		MostrarHabitaciones mostrarh = new MostrarHabitaciones();
		
		LocalDate date = LocalDate.parse("2023-06-19");
		
		cargah.crearHabitacion(200, 2, 20, TipoHabitacion.SIMPLE);
		cargah.crearHabitacion(300, 3, 50, TipoHabitacion.SIMPLE);
		cargah.crearHabitacion(400, 4, 100, TipoHabitacion.SUITE);
		cargah.crearHabitacion(500, 2, 50, TipoHabitacion.SUITE);
		
		ArrayList<Habitacion> lista1 = mostrarh.mostrarHabitacionesXFiltros(null, 2, null, date);
		ArrayList<Habitacion> lista2 = mostrarh.mostrarHabitacionesXFiltros(DisponibilidadHabitacion.Disponible, -1, null, date);
		ArrayList<Habitacion> lista3 = mostrarh.mostrarHabitacionesXFiltros(null, 2, TipoHabitacion.SUITE, date);
		ArrayList<Habitacion> lista4 = mostrarh.mostrarHabitacionesXFiltros(DisponibilidadHabitacion.Reservada, 4, TipoHabitacion.SUITE, date);
		
		Assert.assertEquals(2, lista1.size());
		System.out.print(String.format("%20s %20s %20s %20s %20s %n", "Numero", "Tipo", "Disponibilidad", "Capacidad", "Precio Diario"));
		for (Habitacion habitacion: lista1) {
			String s1 = String.valueOf(habitacion.getNumero());
			String s2;
			
			if (habitacion instanceof Simple) {
				s2 = "Simple";
			} else {
				s2 = "Suite";
			}
			
			String s3 = habitacion.getDisponibilidadXDia(date);
			String s4 = String.valueOf(habitacion.getCapacidad());
			String s5 = String.valueOf(habitacion.getPrecioDiario());
			System.out.println(String.format("%20s %20s %20s %20s %20s", s1, s2, s3, s4, s5));
		}
		
		Assert.assertEquals(4, lista2.size());
		System.out.print(String.format("%n %20s %20s %20s %20s %20s %n", "Numero", "Tipo", "Disponibilidad", "Capacidad", "Precio Diario"));
		for (Habitacion habitacion: lista2) {
			String s1 = String.valueOf(habitacion.getNumero());
			String s2;
			
			if (habitacion instanceof Simple) {
				s2 = "Simple";
			} else {
				s2 = "Suite";
			}
			
			String s3 = habitacion.getDisponibilidadXDia(date);
			String s4 = String.valueOf(habitacion.getCapacidad());
			String s5 = String.valueOf(habitacion.getPrecioDiario());
			System.out.println(String.format("%20s %20s %20s %20s %20s", s1, s2, s3, s4, s5));
		}
		
		Assert.assertEquals(1, lista3.size());
		System.out.print(String.format("%n %20s %20s %20s %20s %20s %n", "Numero", "Tipo", "Disponibilidad", "Capacidad", "Precio Diario"));
		for (Habitacion habitacion: lista3) {
			String s1 = String.valueOf(habitacion.getNumero());
			String s2;
			
			if (habitacion instanceof Simple) {
				s2 = "Simple";
			} else {
				s2 = "Suite";
			}
			
			String s3 = habitacion.getDisponibilidadXDia(date);
			String s4 = String.valueOf(habitacion.getCapacidad());
			String s5 = String.valueOf(habitacion.getPrecioDiario());
			System.out.println(String.format("%20s %20s %20s %20s %20s", s1, s2, s3, s4, s5));
		}
		
		Assert.assertEquals(0, lista4.size());
		System.out.print(String.format("%n %20s %20s %20s %20s %20s %n", "Numero", "Tipo", "Disponibilidad", "Capacidad", "Precio Diario"));
		for (Habitacion habitacion: lista4) {
			String s1 = String.valueOf(habitacion.getNumero());
			String s2;
			
			if (habitacion instanceof Simple) {
				s2 = "Simple";
			} else {
				s2 = "Suite";
			}
			
			String s3 = habitacion.getDisponibilidadXDia(date);
			String s4 = String.valueOf(habitacion.getCapacidad());
			String s5 = String.valueOf(habitacion.getPrecioDiario());
			System.out.println(String.format("%20s %20s %20s %20s %20s", s1, s2, s3, s4, s5));
		}
		
	}

}
