package modelo;

public class Suite extends Habitacion implements IStrategyTipoHabitacion {

    public Suite(IStrategyTipoHabitacion tipoHabitacion, DisponibilidadHabitacion disponibilidad) {
    	super(tipoHabitacion, disponibilidad);
    }

    public double obtenerPrecio() {
        // TODO implement here
        return 0.0d;
    }

}