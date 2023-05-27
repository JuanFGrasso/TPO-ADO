package modelo;

public class WhatsApp {
	
	private IAdapterWhatsApp adapter;

    public WhatsApp(IAdapterWhatsApp adapter) {
    	this.adapter = adapter;
    }

    public void enviarFactura(Factura factura, Cliente cliente) {
        // TODO implement here
    }

	public IAdapterWhatsApp getAdapter() {
		return adapter;
	}

	public void setAdapter(IAdapterWhatsApp adapter) {
		this.adapter = adapter;
	}  

}