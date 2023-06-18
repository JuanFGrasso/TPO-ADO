package modelo;

public class MercadoPago {
	
	private AdaptadorMercadoPago adapter;

    public MercadoPago() {
    }

    public void abonarFactura(Factura f) {
        // TODO implement here
    }

	public AdaptadorMercadoPago getAdapter() {
		return adapter;
	}

	public void setAdapter(AdaptadorMercadoPago adapter) {
		this.adapter = adapter;
	}

}