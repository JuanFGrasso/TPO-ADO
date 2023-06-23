package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Cliente;
import modelo.Facturador;
import modelo.Habitacion;
import modelo.MedioDePago;
import modelo.Reserva;
import modelo.Sistema;
import modelo.Timer;

public class RealizarReserva {
	
	Sistema sistema = Sistema.getInstance();
	
	public boolean crearReserva(int numero, String DNI,LocalDate fechaCompra, LocalDate fechain, LocalDate fechaout) {
		boolean flag;
		
			Cliente cliente = sistema.getClienteXDNI(DNI);
			Habitacion habitacion = sistema.getHabitacionXNumero(numero);
			if (habitacion.validarDisponibilidadXRango(fechain, fechaout)) {
				Reserva reserva = new Reserva(habitacion, cliente, fechaCompra, fechain, fechaout);
				sistema.agregarReservas(reserva);
				flag = true;
			} else {
				flag = false;
			}
		
			return flag;
	}
	
	public boolean confirmarReserva(int numero, MedioDePago medio) {
		CalcularMontos calcularm = new CalcularMontos();
		calcularm.calcularMontoBase(numero);
		calcularm.calcularMontoFinal(numero);
		
		Reserva reserva = sistema.getReservaXNumero(numero);
		boolean flag;
		
		if (reserva != null) {
			Facturador facturador = new Facturador(medio);
			facturador.abonarReserva(reserva);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public boolean cancelarReserva(int numero) {
		Reserva reserva = sistema.getReservaXNumero(numero);
		boolean flag;
		
		if (reserva != null) {
			reserva.getEstadoReserva().cancelar();
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public boolean validarTiempo(int numero) {
		Reserva reserva = sistema.getReservaXNumero(numero);
		boolean flag;
		
		if (reserva != null) {
			Timer.validarTiempo(reserva);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public void mostrarReservas() {
		ArrayList<Reserva> reservas = sistema.getReservas();
		System.out.println();
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
	}

}
