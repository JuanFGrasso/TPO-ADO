package modelo;

public class Facturador {
	
	private MedioDePago medioDePago;
	private AdaptadorMercadoPago adapter;

    public Facturador(MedioDePago medioDePago, AdaptadorMercadoPago adapter) {
    	this.medioDePago = medioDePago;
    	this.adapter = adapter;
    }

    public void abonarReserva(Reserva reserva) {
        // TODO implement here
    }

    public Factura crearFactura(Cliente cliente, Reserva reserva) {
        // TODO implement here
        return null;
    }

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}

	public AdaptadorMercadoPago getAdapter() {
		return adapter;
	}

	public void setAdapter(AdaptadorMercadoPago adapter) {
		this.adapter = adapter;
	}

}