package modelo;

public class Habitacion {
	
	private IStrategyTipoHabitacion tipoHabitacion;
	private DisponibilidadHabitacion disponibilidad;
    
    public Habitacion(IStrategyTipoHabitacion tipoHabitacion, DisponibilidadHabitacion disponibilidad) {
    	this.disponibilidad = disponibilidad;
    	this.tipoHabitacion = tipoHabitacion;
    }

    public double obtenerPrecio() {
        // TODO implement here
        return 0.0d;
    }

	public IStrategyTipoHabitacion getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(IStrategyTipoHabitacion tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public DisponibilidadHabitacion getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(DisponibilidadHabitacion disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}
