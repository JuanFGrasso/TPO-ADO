
import java.util.*;

/**
 * 
 */
public class Pago extends EstadoPago {

    /**
     * Default constructor
     */
    public Pago() {
    }

    /**
     * @param reserva 
     * @return
     */
    public void pagar(Reserva reserva) {
        // TODO implement here
        return null;
    }

    /**
     * @param reserva 
     * @param timer 
     * @return
     */
    public void cancelar(Reserva reserva, Timer timer) {
        // TODO implement here
        return null;
    }

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