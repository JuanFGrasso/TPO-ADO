package test;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controller.CalcularMontos;
import controller.CargarClientes;
import controller.CargarHabitaciones;
import controller.RealizarReserva;
import modelo.AdaptadorMessageBird;
import modelo.Contacto;
import modelo.Email;
import modelo.Internet;
import modelo.MiniBar;
import modelo.Reserva;
import modelo.Sistema;
import modelo.TipoHabitacion;

class TestCalcularMontos {

	@Test
	void test() {
		CargarClientes cargac = new CargarClientes();
		CargarHabitaciones cargah = new CargarHabitaciones();
		RealizarReserva realizar = new RealizarReserva();
		CalcularMontos calcularm = new CalcularMontos();
		
		cargac.crearCliente("Lionel", "Messi", "33016244", new Contacto("44440000", "lionelmessi@gmail.com", new Email(new AdaptadorMessageBird())));
		cargah.crearHabitacion(200, 2, 20, TipoHabitacion.SIMPLE);
		cargah.agregarExtraHabitacion(200, new Internet(50));
		cargah.agregarExtraHabitacion(200, new MiniBar(75));
		realizar.crearReserva(200, "33016244", LocalDate.parse("2023-06-20"), LocalDate.parse("2023-06-30"), LocalDate.parse("2023-07-10"));
		realizar.crearReserva(200, "33016244", LocalDate.parse("2023-06-20"), LocalDate.parse("2023-07-12"), LocalDate.parse("2023-07-21"));
		
		Reserva reserva1 = Sistema.getInstance().getReservaXNumero(0);
		calcularm.calcularMontoBase(0);
		Assert.assertEquals(345, reserva1.getMontoBase(), 0);
		
		calcularm.calcularMontoFinal(0);
		Assert.assertEquals(345, reserva1.getMontoFinal(), 0);
		
		Reserva reserva2 = Sistema.getInstance().getReservaXNumero(1);
		calcularm.calcularMontoBase(1);
		Assert.assertEquals(325, reserva2.getMontoBase(), 0);
		
		calcularm.calcularMontoFinal(1);
		Assert.assertEquals(276.25, reserva2.getMontoFinal(), 0);
		
		
	}

}
