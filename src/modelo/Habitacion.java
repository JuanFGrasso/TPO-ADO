package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Habitacion {
	
	private int numero;
	private String[][] disponibilidad;
	private int capacidad;
	private double precioDiario;
	private ArrayList<Extra> serviciosExtras;
    
    public Habitacion(int numero, int capacidad, double precioDiario) {
    	this.numero = numero;
    	this.capacidad = capacidad;
    	this.precioDiario = precioDiario;
    	this.disponibilidad = new String[31][12];
    	inicializarDisponibilidad();
    }
    
    private void inicializarDisponibilidad() {
    	for(int i = 0; i < 31; i++) {
    		for (int j = 0; j < 12; j++) {
    			this.disponibilidad[i][j] = DisponibilidadHabitacion.Disponible.toString();
    		}
    	}
    }
    
    public int getNumero() {
    	return numero;
    }
    
    public void setNumero(int numero) {
    	this.numero = numero;
    }

	public String[][] getDisponibilidad() {
		return disponibilidad;
	}
	
	public String getDisponibilidadXDia(LocalDate fecha) {
		int dia = fecha.getDayOfMonth();
		int mes = fecha.getMonthValue();
		
		return (disponibilidad[dia][mes]);
	}
	
	public boolean validarDisponibilidadXRango(LocalDate inic, LocalDate fin) {
		LocalDate aux = inic;
		boolean flag = true;
		
		while (!aux.isAfter(fin)) {
			if (getDisponibilidadXDia(aux) == DisponibilidadHabitacion.Reservada.toString()) {
				flag = false;
			}
			aux = aux.plusDays(1);
		}
		
		return flag;
	}

	public void setDisponibilidadXDia(LocalDate fecha, DisponibilidadHabitacion disponibilidad) {
		int dia = fecha.getDayOfMonth();
		int mes = fecha.getMonthValue();
		
		this.disponibilidad[dia][mes] = disponibilidad.toString();
	}
	
	public void setDisponibilidadXRango(LocalDate inic, LocalDate fin, DisponibilidadHabitacion disponibilidad) {
		LocalDate aux = inic;
		
		while (!aux.isAfter(fin)) {
			setDisponibilidadXDia(aux, disponibilidad);
		}
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
	
	public void agregarServicio(Extra extra) {
		serviciosExtras.add(extra);
	}
	
	public ArrayList<Extra> getServiciosExtra() {
		return serviciosExtras;
	}

}
