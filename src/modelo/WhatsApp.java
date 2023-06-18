package modelo;

public class WhatsApp {
	
	private AdaptadorWhatsApp adapter;

    public WhatsApp(AdaptadorWhatsApp adapter) {
    	this.adapter = adapter;
    }

    public void enviarFactura(Factura factura, Cliente cliente) {
        // TODO implement here
    }

	public AdaptadorWhatsApp getAdapter() {
		return adapter;
	}

	public void setAdapter(AdaptadorWhatsApp adapter) {
		this.adapter = adapter;
	}  

}