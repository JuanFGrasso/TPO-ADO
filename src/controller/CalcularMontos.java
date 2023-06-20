package controller;

import modelo.Reserva;
import modelo.Sistema;

public class CalcularMontos {
	
	Sistema sistema = Sistema.getInstance();
	
	public boolean calcularMontoBase(int numero) {
		Reserva reserva = sistema.getReservaXNumero(numero);
		boolean flag;
		
		if (reserva != null) {
			reserva.calcularMontoBase();
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public boolean calcularMontoFinal(int numero) {
		Reserva reserva = sistema.getReservaXNumero(numero);
		boolean flag;
		
		if (reserva != null) {
			reserva.calcularMontoFinal();
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	

}
