package controller;

import java.util.ArrayList;

import modelo.AdaptadorMessageBird;
import modelo.AdaptadorTwillio;
import modelo.Cliente;
import modelo.Contacto;
import modelo.Email;
import modelo.SMS;
import modelo.Sistema;
import modelo.WhatsApp;

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
	
	public void mostrarClientes() {
		ArrayList<Cliente> clientes = sistema.getClientes();
		System.out.print(String.format("%20s %20s %20s %20s %30s %30s %n", "Nombre", "Apellido", "DNI", "Telefono", "Email", "Metodo"));
		for (Cliente lista: clientes) {
			String s1 = lista.getNombre();
			String s2 = lista.getApellido();
			String s3 = lista.getDni();
			String s4 = lista.getContacto().getTelefono();
			String s5 = lista.getContacto().getEmail();
			String s6 = lista.getContacto().getMetodo().getClass().toString();
			System.out.println(String.format("%20s %20s %20s %20s %30s %30s", s1, s2, s3, s4, s5, s6));
		}
	}
	
	public Contacto crearContacto(String telefono, String email, int opcion) {
		Contacto contacto;
		
		if (opcion == 0) {
			contacto = new Contacto(telefono, email, new Email(new AdaptadorMessageBird()));
		} else if (opcion == 1) {
			contacto = new Contacto(telefono, email, new SMS(new AdaptadorTwillio()));
		} else if (opcion == 2) {
			contacto = new Contacto(telefono, email, new WhatsApp(new AdaptadorTwillio()));
		} else {
			contacto = null;
		}
		
		return contacto;
		
	}

}
