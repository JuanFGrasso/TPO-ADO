package modelo;

public class Pagada extends EstadoReserva {

    public Pagada(Reserva reserva) {
    	super(reserva);
    }

    public void reservar(Reserva reserva) {
    	reserva.setEstadoReserva(new Registrada(reserva));
    }

    public void cancelar(Reserva reserva) {
    	reserva.setEstadoReserva(new Cancelada(reserva));
    }

    public void concretar(Reserva reserva) {
    }

}