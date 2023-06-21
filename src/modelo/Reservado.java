package modelo;

public class Reservado extends EstadoReserva {

    public Reservado(Reserva reserva) {
    	super(reserva);
    	reserva.getCliente().getContacto().getMetodo().enviarNotificacion(reserva, "Registrado");
    }

    public void cancelar() {
    	reserva.liberarDisponibilidad();
        reserva.setEstadoReserva(new Cancelada(reserva));
    }

    public void concretar() {
        reserva.setEstadoReserva(new Pagado(reserva));
    }

}