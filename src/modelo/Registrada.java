package modelo;

public class Registrada extends EstadoReserva {

    public Registrada(Reserva reserva) {
    	super(reserva);
    }
    
    public void reservar(Reserva reserva) {
    }

    public void cancelar(Reserva reserva) {
        reserva.setEstadoReserva(new Cancelada(reserva));
    }

    public void concretar(Reserva reserva) {
        reserva.setEstadoReserva(new Pagada(reserva));
    }

}