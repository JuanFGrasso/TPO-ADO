package modelo;

public class Cancelada extends EstadoReserva {

    public Cancelada(Reserva reserva) {
    	super(reserva);
    	reserva.getCliente().getContacto().getMetodo().enviarNotificacion(reserva, "Cancelada");
    }
    
    public void cancelar() {
    }

    public void concretar() {
    }

}