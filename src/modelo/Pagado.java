package modelo;

public class Pagado extends EstadoReserva {

    public Pagado(Reserva reserva) {
    	super(reserva);
    }

    public void cancelar() {
    	reserva.liberarDisponibilidad();
    	reserva.setEstadoReserva(new Cancelada(reserva));
    }

    public void concretar() {
    }

}