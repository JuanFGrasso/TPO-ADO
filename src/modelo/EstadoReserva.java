package modelo;

public abstract class EstadoReserva {

    public EstadoReserva() {
    }

    public abstract void reservar(Reserva reserva);

    public abstract void cancelar(Reserva reserva);

    public abstract void concretar(Reserva reserva);

}