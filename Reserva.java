
import java.util.*;

/**
 * 
 */
public class Reserva {

    /**
     * Default constructor
     */
    public Reserva() {
    }

    /**
     * 
     */
    private int cantidadPersonas;

    /**
     * 
     */
    private Habitacion habitacion;

    /**
     * 
     */
    private Cliente cliente;

    /**
     * 
     */
    private List<Extra> serviciosExtras;

    /**
     * 
     */
    private LocalDate fechaCheckin;

    /**
     * 
     */
    private LocalDate fechaCheckout;

    /**
     * 
     */
    private double precioBase;

    /**
     * 
     */
    private double montoFinal;

    /**
     * 
     */
    private PoliticasDePrecio politicasPrecio;

    /**
     * 
     */
    private EstadoReserva estadoReserva;

    /**
     * 
     */
    private EstadoPago estadoPago;

    /**
     * @return
     */
    public void calcularTotalReserva() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double obtenerPrecioFinal() {
        // TODO implement here
        return 0.0d;
    }

}