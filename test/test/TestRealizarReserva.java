package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.CargarClientes;
import controller.CargarHabitaciones;
import controller.RealizarReserva;
import modelo.AdaptadorEmail;
import modelo.Contacto;
import modelo.Email;

class TestRealizarReserva {

	@Test
	void test() {
		CargarClientes cargac = new CargarClientes();
		CargarHabitaciones cargah = new CargarHabitaciones();
		RealizarReserva realizar = new RealizarReserva();
		
		cargac.crearCliente("Lionel", "Messi", "33016244", new Contacto("44440000", "lionelmessi@gmail.com", new Email(new AdaptadorEmail())));
	}

}
