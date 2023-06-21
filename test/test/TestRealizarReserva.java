package test;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controller.CargarClientes;
import controller.CargarHabitaciones;
import controller.RealizarReserva;
import modelo.AdaptadorMercadoPago;
import modelo.AdaptadorMessageBird;
import modelo.AdaptadorTwillio;
import modelo.Contacto;
import modelo.DisponibilidadHabitacion;
import modelo.Email;
import modelo.Reserva;
import modelo.SMS;
import modelo.Sistema;
import modelo.TarjetaDeCrédito;
import modelo.TipoHabitacion;

class TestRealizarReserva {

	@Test
	void test() {
		CargarClientes cargac = new CargarClientes();
		CargarHabitaciones cargah = new CargarHabitaciones();
		RealizarReserva realizar = new RealizarReserva();
		
		cargac.crearCliente("Lionel", "Messi", "33016244", new Contacto("44440000", "lionelmessi@gmail.com", new Email(new AdaptadorMessageBird())));
		cargac.crearCliente("Diego", "Maradona", "14276579", new Contacto("44441111", "diegomaradona@gmail.com", new SMS(new AdaptadorTwillio())));
		cargah.crearHabitacion(200, 2, 20, TipoHabitacion.SIMPLE);
		
		boolean boolean1 = realizar.crearReserva(200, "33016244", LocalDate.parse("2023-06-20"), LocalDate.parse("2023-06-30"), LocalDate.parse("2023-07-10"));
		Assert.assertEquals(true, boolean1);
		boolean boolean2 = realizar.crearReserva(200, "14276579", LocalDate.parse("2023-06-20"), LocalDate.parse("2023-06-30"), LocalDate.parse("2023-07-10"));
		Assert.assertEquals(false, boolean2);
		boolean boolean3 = realizar.crearReserva(200, "14276579", LocalDate.parse("2023-06-20"), LocalDate.parse("2023-06-20"), LocalDate.parse("2023-06-30"));
		Assert.assertEquals(false, boolean3);
		boolean boolean4 = realizar.crearReserva(200, "14276579", LocalDate.parse("2023-06-20"), LocalDate.parse("2023-06-25"), LocalDate.parse("2023-07-15"));
		Assert.assertEquals(false, boolean4);
		boolean boolean5 = realizar.crearReserva(200, "14276579", LocalDate.parse("2023-06-20"), LocalDate.parse("2023-07-11"), LocalDate.parse("2023-07-30"));
		Assert.assertEquals(true, boolean5);
		
		ArrayList<Reserva> reservas = Sistema.getInstance().getReservas();
		
		System.out.print(String.format("%20s %20s %20s %20s %20s %40s %40s %n", "Numero", "DNI", "Habitacion", "Checkin", "Checkout", "Politica", "Estado"));
		for (Reserva lista: reservas) {
			String s1 = String.valueOf(lista.getNumero());
			String s2 = String.valueOf(lista.getCliente().getDni());
			String s3 = String.valueOf(lista.getHabitacion().getNumero());
			String s4 = lista.getFechaCheckin().toString();
			String s5 = lista.getFechaCheckout().toString();
			String s6 = lista.getPoliticasPrecio().getClass().toString();
			String s7 = lista.getEstadoReserva().getClass().toString();
			System.out.println(String.format("%20s %20s %20s %20s %20s %40s %40s", s1, s2, s3, s4, s5, s6, s7));
		}
		
		String string1 = Sistema.getInstance().getHabitacionXNumero(200).getDisponibilidadXDia(LocalDate.parse("2023-07-10"));
		Assert.assertEquals(DisponibilidadHabitacion.Reservada.toString(), string1);
		
		System.out.println();
		realizar.confirmarReserva(0, new TarjetaDeCrédito(40405650,197,"06/23", new AdaptadorMercadoPago()));
		Reserva reserva1 = Sistema.getInstance().getReservaXNumero(0);
		Assert.assertEquals("class modelo.Pagado", reserva1.getEstadoReserva().getClass().toString());
		
		realizar.cancelarReserva(1);
		Reserva reserva2 = Sistema.getInstance().getReservaXNumero(1);
		Assert.assertEquals("class modelo.Cancelada", reserva2.getEstadoReserva().getClass().toString());
		
		/*
		String[][] disponibilidad = Sistema.getInstance().getHabitacionXNumero(200).getDisponibilidad();
		
		System.out.println();
		for (int i = 0; i < 31; i++) {
			for (int j = 0; j < 12; j++) {
				System.out.print(String.format("%30s", disponibilidad[i][j]));
				if(j == 11) {
					System.out.println();
				}
			}
		}
		*/
	}

}
