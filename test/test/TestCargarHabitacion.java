package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controller.CargarHabitaciones;
import modelo.Habitacion;
import modelo.Sistema;
import modelo.TipoHabitacion;

class TestCargarHabitacion {

	@Test
	void test() {
		CargarHabitaciones cargah = new CargarHabitaciones();
		
		boolean boolean1 = cargah.crearHabitacion(200, 2, 20, TipoHabitacion.SIMPLE);
		Assert.assertEquals(true, boolean1);
		boolean boolean2 = cargah.crearHabitacion(200, 3, 20, TipoHabitacion.SUITE);
		Assert.assertEquals(false, boolean2);
		cargah.crearHabitacion(300, 3, 50, TipoHabitacion.SIMPLE);
		cargah.crearHabitacion(400, 4, 100, TipoHabitacion.SUITE);
		cargah.crearHabitacion(500, 2, 50, TipoHabitacion.SUITE);
		
		ArrayList<Habitacion> habitaciones = Sistema.getInstance().getHabitaciones();
		Assert.assertEquals(4, habitaciones.size());
		
		System.out.print(String.format("%20s %20s %20s %20s %n", "Numero", "Capacidad", "Precio Diario", "Tipo"));
		for (Habitacion lista: habitaciones) {
			String s1 = String.valueOf(lista.getNumero());
			String s2 = String.valueOf(lista.getCapacidad());
			String s3 = String.valueOf(lista.getPrecioDiario());
			String s4 = lista.getClass().toString();
			System.out.println(String.format("%20s %20s %20s %20s", s1, s2, s3, s4));
		}
		
	}

}
