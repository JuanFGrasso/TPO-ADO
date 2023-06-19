package controller;

import java.time.LocalDate;

import modelo.Cliente;
import modelo.Habitacion;
import modelo.Reserva;
import modelo.Sistema;

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
	
	public boolean confirmarReserva(int numero) {
		Reserva reserva = sistema.getReservaXNumero(numero);
		boolean flag;
		
		if (reserva != null) {
			reserva.getEstadoReserva().concretar();
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

}
