package controller;

import modelo.Cliente;
import modelo.Contacto;
import modelo.Sistema;

public class CargaClientes {
	
	public Sistema sistema = Sistema.getInstance();
	
	public String crearCliente(String nombre, String apellido, String dni, Contacto contacto) {
		Cliente cliente = new Cliente(nombre, apellido, dni, contacto);
		String mensaje;
		
		if (!sistema.validarClienteExistente(cliente)) {
			sistema.agregarClientes(cliente);
			mensaje = "Se ha creado correctamente el cliente";
		} else {
			mensaje = "Ya existe un cliente con el DNI indicado";
		}
		
		return mensaje;
	}
	
	public String cambiarNombreApellidoCliente(String DNI, String nombre, String apellido) {
		Cliente cliente = sistema.getClienteXDNI(DNI);
		String mensaje;
		
		if (cliente != null) {
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			mensaje = "Se ha modificado el nombre y apellido correctamente";
		} else {
			mensaje = "No existe el cliente para el DNI indicado";
		}
		
		return mensaje;
	}
	
	public String cambiarContactoCliente(String DNI, Contacto contacto) {
		Cliente cliente = sistema.getClienteXDNI(DNI);
		String mensaje;
		
		if (cliente != null) {
			cliente.setContacto(contacto);
			mensaje = "Se ha modificado el contacto correctamente";
		} else {
			mensaje = "No existe el cliente para el DNI indicado";
		}
		
		return mensaje;
	}

}
