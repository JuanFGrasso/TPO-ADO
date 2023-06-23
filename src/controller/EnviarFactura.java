package controller;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Factura;
import modelo.Sistema;

public class EnviarFactura {
	
	Sistema sistema = Sistema.getInstance();
	
	public boolean enviarFactura(int numero) {
		Factura factura = sistema.getFacturaXNumero(numero);
		boolean flag;
		
		if (factura != null) {
			Cliente cliente = factura.getReserva().getCliente();
			cliente.getContacto().getMetodo().enviarFactura(factura);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public void mostrarFacturas() {
		ArrayList<Factura> facturas = sistema.getFacturas();
		System.out.println();
		System.out.print(String.format("%20s %20s %n", "Numero", "Reserva"));
		for (Factura lista: facturas) {
			String s1 = String.valueOf(lista.getNumero());
			String s2 = String.valueOf(lista.getReserva().getNumero());
			
			System.out.println(String.format("%20s %20s", s1, s2));
		}
	}

}
