package modelo;

public class Cancelada extends EstadoReserva {

    public Cancelada(Reserva reserva) {
    	super(reserva);
    }

    public void reservar(Reserva reserva) {
        reserva.setEstadoReserva(new Registrada(reserva));
    }

    public void cancelar(Reserva reserva) {
    }

    public void concretar(Reserva reserva) {
    	reserva.setEstadoReserva(new Pagada(reserva));
    }

}