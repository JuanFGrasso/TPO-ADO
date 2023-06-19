package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private static Sistema instancia;
	
	ArrayList<Cliente> clientes;
	ArrayList<Habitacion> habitaciones;
	ArrayList<Reserva> reservas;
	
	
	public Sistema() {
		clientes = new ArrayList<Cliente>();
		habitaciones = new ArrayList<Habitacion>();
		reservas = new ArrayList<Reserva>();
	}
	
	public static Sistema getInstance() {
		if (instancia == null) {
			instancia = new Sistema();
		}
		return instancia;
	}
	
	public List<Cliente> getClientes(){
		return clientes;
	}
	
	public List<Habitacion> getHabitaciones(){
		return habitaciones;
	}
	
	public List<Reserva> getReservas(){
		return reservas;
	}
	
	public void agregarClientes(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void agregarHabitaciones(Habitacion habitacion) {
		habitaciones.add(habitacion);
	}
	
	public void agregarReservas(Reserva reserva) {
		reservas.add(reserva);
	}
	
	public boolean validarClienteExistente(Cliente cliente) {
		for (Cliente lista: clientes) {
			if (lista.getDni() == cliente.getDni()) {
				return true;
			}
		}
		return false;
	}
	
	public Cliente getClienteXDNI(String DNI) {
		for (Cliente lista: clientes) {
			if (lista.getDni() == DNI) {
				return lista;
			}
		}
		return null;
	}
	
	public boolean validarHabitacionExistente(Habitacion habitacion) {
		for (Habitacion lista: habitaciones) {
			if(lista.getNumero() == habitacion.getNumero()) {
				return true;
			}
		}
		return false;
	}
	
	public Habitacion getHabitacionXNumero(int numero) {
		for (Habitacion lista: habitaciones) {
			if (lista.getNumero() == numero) {
				return lista;
			}
		}
		return null;
	}
	
}
