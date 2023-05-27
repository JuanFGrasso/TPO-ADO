package modelo;

public class Facturador {
	
	private MedioDePago medioDePago;
	private IAdapterMercadoPago adapter;

    public Facturador(MedioDePago medioDePago, IAdapterMercadoPago adapter) {
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

	public IAdapterMercadoPago getAdapter() {
		return adapter;
	}

	public void setAdapter(IAdapterMercadoPago adapter) {
		this.adapter = adapter;
	}

}