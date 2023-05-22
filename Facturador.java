
import java.util.*;

public class Facturador {
	
	private MedioDePago medioDePago;
	private IAdapterMercadoPago adapter;

    public Facturador(MedioDePago medioDePago, IAdapterMercadoPago adapter) {
    	this.medioDePago = medioDePago;
    	this.adapter = adapter;
    }

    public void abonarReserva(Reserva reserva) {
        // TODO implement here
        return null;
    }

    public Factura crearFactura(Cliente cliente, Reserva reserva) {
        // TODO implement here
        return null;
    }

}