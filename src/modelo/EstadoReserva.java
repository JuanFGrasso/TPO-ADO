package modelo;

public abstract class EstadoReserva {

	protected Reserva reserva;

    public EstadoReserva(Reserva reserva) {
    	this.reserva = reserva;
    }

    public abstract void cancelar();

    public abstract void concretar();

}