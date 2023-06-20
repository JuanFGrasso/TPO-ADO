package test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import controller.CargarClientes;
import modelo.AdaptadorEmail;
import modelo.AdaptadorSMS;
import modelo.AdaptadorWhatsApp;
import modelo.Cliente;
import modelo.Contacto;
import modelo.Email;
import modelo.SMS;
import modelo.Sistema;
import modelo.WhatsApp;

class TestCargarCliente {

	@Test
	void test() {
		CargarClientes cargac = new CargarClientes();
		
		boolean boolean1 = cargac.crearCliente("Lionel", "Messi", "33016244", new Contacto("44440000", "lionelmessi@gmail.com", new Email(new AdaptadorEmail())));
		Assert.assertEquals(true, boolean1);
		boolean boolean2 = cargac.crearCliente("Diego", "Maradona", "33016244", new Contacto("44441111", "diegomaradona@gmail.com", new SMS(new AdaptadorSMS())));
		Assert.assertEquals(false, boolean2);
		cargac.crearCliente("Diego", "Maradona", "14276579", new Contacto("44441111", "diegomaradona@gmail.com", new SMS(new AdaptadorSMS())));
		cargac.crearCliente("Roman", "Riquelme", "26752869", new Contacto("44442222", "romanriquelme@gmail.com", new WhatsApp(new AdaptadorWhatsApp())));
		
		ArrayList<Cliente> clientes = Sistema.getInstance().getClientes();
		
		Assert.assertEquals(3, clientes.size());
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

}
