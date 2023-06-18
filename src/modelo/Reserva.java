package modelo;

import java.time.LocalDate;
import java.util.*;

public class Reserva {
	
    private Habitacion habitacion;
    private Cliente cliente;
    private List<Extra> serviciosExtras;
    private LocalDate fechaCheckin;
    private LocalDate fechaCheckout;
    private double montoFinal;
    private IStrategyPoliticas politicasPrecio;
    private EstadoReserva estadoReserva;
    private EstadoPago estadoPago;
    
    public Reserva(int cantidadPersonas , Habitacion habitacion, Cliente cliente, List<Extra> serviciosExtras, LocalDate fechaCheckin, LocalDate fechaCheckout, IStrategyPoliticas politicasPrecio, EstadoReserva estadoReserva,EstadoPago estadoPago){
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.serviciosExtras = serviciosExtras;
        this.fechaCheckin = fechaCheckin;
        this.fechaCheckout = fechaCheckout;
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

	public double getMontoFinal() {
		return montoFinal;
	}

	public void setMontoFinal(double montoFinal) {
		this.montoFinal = montoFinal;
	}

	public IStrategyPoliticas getPoliticasPrecio() {
		return politicasPrecio;
	}

	public void setPoliticasPrecio(IStrategyPoliticas politicasPrecio) {
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
