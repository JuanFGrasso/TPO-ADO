
import java.util.*;

/**
 * 
 */
public abstract class PoliticasDePrecio extends Reserva {

    /**
     * Default constructor
     */
    public PoliticasDePrecio() {
    }

    /**
     * 
     */
    private double porcentaje15dias = 0.15;

    /**
     * 
     */
    private double porcentaje60dias = 0.20;

    /**
     * 
     */
    private Reserva reserva;

    /**
     * @param reserva 
     * @return
     */
    public double aplicarPoliticas(Reserva reserva) {
        // TODO implement here
        return 0.0d;
    }

}