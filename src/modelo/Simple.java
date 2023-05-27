package modelo;

public class Simple extends Habitacion implements IStrategyTipoHabitacion {

    public Simple(IStrategyTipoHabitacion tipoHabitacion, DisponibilidadHabitacion disponibilidad) {
    	super(tipoHabitacion, disponibilidad);
    }

    public double obtenerPrecio() {
        // TODO implement here
        return 0.0d;
    }

}