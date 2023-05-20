
import java.util.*;

/**
 * 
 */
public abstract class EstadoPago {

    /**
     * Default constructor
     */
    public EstadoPago() {
    }

    /**
     * 
     */
    private Timer timer;

    /**
     * @param reserva 
     * @return
     */
    public abstract void pagar(Reserva reserva);

    /**
     * @param reserva 
     * @param timer 
     * @return
     */
    public abstract void cancelar(Reserva reserva, Timer timer);

}