package modelo;

import java.time.LocalDate;
import java.util.*;

public class Reserva {

    private int cantidadPersonas;
    private Habitacion habitacion;
    private Cliente cliente;
    private List<Extra> serviciosExtras;
    private LocalDate fechaCheckin;
    private LocalDate fechaCheckout;
    private double precioBase;
    private double montoFinal;
    private PoliticasDePrecio politicasPrecio;
    private EstadoReserva estadoReserva;
    private EstadoPago estadoPago;
    
    public Reserva(int cantidadPersonas , Habitacion habitacion, Cliente cliente, List<Extra> serviciosExtras, LocalDate fechaCheckin, LocalDate fechaCheckout, double precioBase, double montoFinal, PoliticasDePrecio politicasPrecio, EstadoReserva estadoReserva,EstadoPago estadoPago){
        this.cantidadPersonas = cantidadPersonas;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.serviciosExtras = serviciosExtras;
        this.fechaCheckin = fechaCheckin;
        this.fechaCheckout = fechaCheckout;
        this.precioBase = precioBase;
        this.montoFinal = montoFinal;
        this.politicasPrecio = politicasPrecio;
        this.estadoReserva = estadoReserva;
        this.estadoPago = estadoPago;
    }

    public void calcularTotalReserva() {
    	//TODO 
	}

    public double obtenerPrecioFinal() {
        return 0;
    }

	public int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Extra> getServiciosExtras() {
		return serviciosExtras;
	}

	public void setServiciosExtras(List<Extra> serviciosExtras) {
		this.serviciosExtras = serviciosExtras;
	}

	public LocalDate getFechaCheckin() {
		return fechaCheckin;
	}

	public void setFechaCheckin(LocalDate fechaCheckin) {
		this.fechaCheckin = fechaCheckin;
	}

	public LocalDate getFechaCheckout() {
		return fechaCheckout;
	}

	public void setFechaCheckout(LocalDate fechaCheckout) {
		this.fechaCheckout = fechaCheckout;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getMontoFinal() {
		return montoFinal;
	}

	public void setMontoFinal(double montoFinal) {
		this.montoFinal = montoFinal;
	}

	public PoliticasDePrecio getPoliticasPrecio() {
		return politicasPrecio;
	}

	public void setPoliticasPrecio(PoliticasDePrecio politicasPrecio) {
		this.politicasPrecio = politicasPrecio;
	}

	public EstadoReserva getEstadoReserva() {
		return estadoReserva;
	}

	public void setEstadoReserva(EstadoReserva estadoReserva) {
		this.estadoReserva = estadoReserva;
	}

	public EstadoPago getEstadoPago() {
		return estadoPago;
	}

	public void setEstadoPago(EstadoPago estadoPago) {
		this.estadoPago = estadoPago;
	}
    
}
