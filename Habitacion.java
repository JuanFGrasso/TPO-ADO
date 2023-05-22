package negocio;
import java.io.Serializable;
import java.util.*;

public class Habitacion {
	
	private IStrategyTipoHabitacion tipoHabitacion;
	private DisponibilidadHabitacion disponibilidad;
    
    public Habitacion(IStrategyTipoHabitacion tipoHabitacion, DisponibilidadHabitacion disponibilidad) {
    	this.disponibilidad = disponibilidad;
    	this.tipoHabitacion = tipoHabitacion;
    }

    
    public DisponibilidadHabitacion obtenerDisponibilidad() {
        return disponibilidad;
    }

    public void setStrategy(IStrategyTipoHabitacion estrategia) {
        this.tipoHabitacion = estrategia;
    }

    public double obtenerPrecio() {
        // TODO implement here
        return 0.0d;
    }

}
