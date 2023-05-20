
import java.util.*;

/**
 * 
 */
public abstract class EstadoReserva {

    /**
     * Default constructor
     */
    public EstadoReserva() {
    }

    /**
     * @param reserva 
     * @return
     */
    public abstract void reservar(Reserva reserva);

    /**
     * @param reserva 
     * @return
     */
    public abstract void cancelar(Reserva reserva);

    /**
     * @param reserva 
     * @return
     */
    public void concretar(Reserva reserva) {
        // TODO implement here
        return null;
    }

}