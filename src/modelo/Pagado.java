package modelo;

public class Pagado extends EstadoReserva {

    public Pagado(Reserva reserva) {
    	super(reserva);
    	reserva.getCliente().getContacto().getMetodo().enviarNotificacion(reserva, "Pagado");
    }

    public void cancelar() {
    	reserva.liberarDisponibilidad();
    	reserva.setEstadoReserva(new Cancelada(reserva));
    }

    public void concretar() {
    }

}