package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserva {
	
	private static int contador = 0;
	private int numero;
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fechaCompra;
    private LocalDate fechaCheckin;
    private LocalDate fechaCheckout;
    private IStrategyPoliticas politicasPrecio;
    private EstadoReserva estadoReserva;
    private double montoBase;
    private double montoFinal;
    
    public Reserva(Habitacion habitacion, Cliente cliente,LocalDate fechaCompra, LocalDate fechaCheckin, LocalDate fechaCheckout){
    	determinarPolitica();
    	habitacion.setDisponibilidadXRango(fechaCheckin, fechaCheckout, DisponibilidadHabitacion.Reservada);
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaCompra = fechaCompra;
        this.fechaCheckin = fechaCheckin;
        this.fechaCheckout = fechaCheckout;
        this.estadoReserva = new Reservado(this);
        this.numero = contador;
        contador++;
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
	
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
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
	
	public double getMontoBase() {
		return montoBase;
	}
	
	public void setMontoBase(double montoBase) {
		this.montoBase = montoBase;
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
	
	public int getNumero() {
		return numero;
	}
	
	public void liberarDisponibilidad() {
		this.habitacion.setDisponibilidadXRango(fechaCheckin, fechaCheckout, DisponibilidadHabitacion.Disponible);
	}
	
	public void determinarPolitica() {
		if (fechaCompra.compareTo(fechaCheckin) >= 60) {
			politicasPrecio = new AnticipacionSesentaDias();
		} else if (fechaCompra.compareTo(fechaCheckin) >= 15) {
			politicasPrecio = new AnticipacionQuinceDias();
		} else {
			politicasPrecio = new AnticipacionDefault();
		}
	}
	
	public void calcularMontoBase() {
		int dias = fechaCheckin.compareTo(fechaCheckin);
		ArrayList<Extra> extras = habitacion.getServiciosExtra();
		double montoextra = 0;
		for (Extra lista: extras) {
			montoextra = montoextra + lista.getPrecio();
		}
		this.montoBase = dias * habitacion.getPrecioDiario() + montoextra;
	}
	
	public void calcularMontoFinal() {
		this.politicasPrecio.aplicarPoliticas(this);
	}
	
}
