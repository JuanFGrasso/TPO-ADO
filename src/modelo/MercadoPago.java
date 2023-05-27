package modelo;

public class MercadoPago {
	
	private IAdapterMercadoPago adapter;

    public MercadoPago() {
    }

    public void abonarFactura(Factura f) {
        // TODO implement here
    }

	public IAdapterMercadoPago getAdapter() {
		return adapter;
	}

	public void setAdapter(IAdapterMercadoPago adapter) {
		this.adapter = adapter;
	}

}