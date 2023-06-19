package controller;

import modelo.Cliente;
import modelo.Contacto;
import modelo.Sistema;

public class CargarClientes {
	
	public Sistema sistema = Sistema.getInstance();
	
	public boolean crearCliente(String nombre, String apellido, String dni, Contacto contacto) {
		Cliente cliente = new Cliente(nombre, apellido, dni, contacto);
		boolean flag;
		
		if (!sistema.validarClienteExistente(cliente)) {
			sistema.agregarClientes(cliente);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public boolean cambiarNombreApellidoCliente(String DNI, String nombre, String apellido) {
		Cliente cliente = sistema.getClienteXDNI(DNI);
		boolean flag;
		
		if (cliente != null) {
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}
	
	public boolean cambiarContactoCliente(String DNI, Contacto contacto) {
		Cliente cliente = sistema.getClienteXDNI(DNI);
		boolean flag;
		
		if (cliente != null) {
			cliente.setContacto(contacto);
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
	}

}
