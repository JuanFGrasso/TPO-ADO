package controller;

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

}
