package modelo;

public abstract class EstadoReserva {
	
	Reserva reserva;

    public EstadoReserva(Reserva reserva) {
    	this.reserva = reserva;
    }

    public abstract void reservar(Reserva reserva);

    public abstract void cancelar(Reserva reserva);

    public abstract void concretar(Reserva reserva);

}