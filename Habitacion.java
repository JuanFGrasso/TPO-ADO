package negocio;
import java.io.Serializable;
import java.util.*;

public class Habitacion {
	
	private IStrategyTipoHabitacion tipoHabitacion;
    private DisponibilidadHabitacion disponibilidad;
    

    public Habitacion() {
    }
    
    public Habitacion(IStrategyTipoHabitacion tipoHabitacion, DisponibilidadHabitacion disponibilidad) {
    	this.disponibilidad = disponibilidad;
    	this.tipoHabitacion = tipoHabitacion;
    }

    
    public DisponibilidadHabitacion obtenerDisponibilidad() {
        // TODO implement here
        return null;
    }

    public void setStrategy(IStrategyTipoHabitacion estrategia) {
        // TODO implement here
    }

    public double obtenerPrecio() {
        // TODO implement here
        return 0.0d;
    }

}
