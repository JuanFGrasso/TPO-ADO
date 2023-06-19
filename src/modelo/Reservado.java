package modelo;

public class Reservado extends EstadoReserva {

    public Reservado(Reserva reserva) {
    	super(reserva);
    }

    public void cancelar() {
    	reserva.liberarDisponibilidad();
        reserva.setEstadoReserva(new Cancelada(reserva));
    }

    public void concretar() {
        reserva.setEstadoReserva(new Pagado(reserva));
    }

}