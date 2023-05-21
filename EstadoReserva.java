
import java.util.*;

public abstract class EstadoReserva {

    public EstadoReserva() {
    }

    public abstract void reservar(Reserva reserva);

    public abstract void cancelar(Reserva reserva);

    public void concretar(Reserva reserva) {
        // TODO implement here
        return null;
    }

}