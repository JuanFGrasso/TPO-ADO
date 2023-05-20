package negocio;
import java.io.Serializable;
import java.util.*;

public class Factura {

    private Cliente cliente;
    private Reserva reserva;

    public Factura() {
    }
    public Factura(Cliente cliente, Reserva reserva) {
    	this.cliente = cliente;
    	this.reserva = reserva;
    }
    public double calcularMonto() {
        // TODO implement here
        return 0.0d;
    }

}
