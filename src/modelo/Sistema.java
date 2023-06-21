package modelo;

import java.util.ArrayList;

public class Sistema {
	
	private static Sistema instancia;
	
	private ArrayList<Cliente> clientes;
	private ArrayList<Habitacion> habitaciones;
	private ArrayList<Reserva> reservas;
	private ArrayList<Factura> facturas;
	
	
	public Sistema() {
		clientes = new ArrayList<Cliente>();
		habitaciones = new ArrayList<Habitacion>();
		reservas = new ArrayList<Reserva>();
		facturas = new ArrayList<Factura>();
	}
	
	public static Sistema getInstance() {
		if (instancia == null) {
			instancia = new Sistema();
		}
		return instancia;
	}
	
	public ArrayList<Cliente> getClientes(){
		return clientes;
	}
	
	public ArrayList<Habitacion> getHabitaciones(){
		return habitaciones;
	}
	
	public ArrayList<Reserva> getReservas(){
		return reservas;
	}
	
	public ArrayList<Factura> getFacturas(){
		return facturas;
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
	
	public void agregarFacturas(Factura factura) {
		facturas.add(factura);
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
	
	public Reserva getReservaXNumero(int numero) {
		for (Reserva lista: reservas) {
			if (lista.getNumero() == numero) {
				return lista;
			}
		}
		return null;
	}
	
	public Factura getFacturaXNumero(int numero) {
		for (Factura lista: facturas) {
			if (lista.getNumero() == numero) {
				return lista;
			}
		}
		return null;
	}
	
}
