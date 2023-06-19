package modelo;

public class SMS implements IStrategyMetodoContacto{
	
	private AdaptadorSMS adapter;

    public SMS(AdaptadorSMS adapter) {
    	this.adapter = adapter;
    }
  
    public void enviarFactura(Factura factura, Cliente cliente) {
        // TODO implement here
    }

	public AdaptadorSMS getAdapter() {
		return adapter;
	}

	public void setAdapter(AdaptadorSMS adapter) {
		this.adapter = adapter;
	}
    
}