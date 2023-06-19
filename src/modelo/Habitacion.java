package modelo;

public abstract class Habitacion {
	
	private int numero;
	private DisponibilidadHabitacion disponibilidad;
	private int capacidad;
	private double precioDiario;
    
    public Habitacion(int numero, DisponibilidadHabitacion disponibilidad, int capacidad, double precioDiario) {
    	this.numero = numero;
    	this.disponibilidad = disponibilidad;
    	this.capacidad = capacidad;
    	this.precioDiario = precioDiario;
    }
    
    public int getNumero() {
    	return numero;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }

	public DisponibilidadHabitacion getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(DisponibilidadHabitacion disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecioDiario() {
		return precioDiario;
	}

	public void setPrecioDiario(double precioDiario) {
		this.precioDiario = precioDiario;
	}

}
