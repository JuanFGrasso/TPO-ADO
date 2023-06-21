package controller;

import java.time.LocalDate;

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

}
