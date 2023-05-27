package modelo;

public class SMS {
	
	private IAdapterSMS adapter;

    public SMS(IAdapterSMS adapter) {
    	this.adapter = adapter;
    }
  
    public void enviarFactura(Factura factura, Cliente cliente) {
        // TODO implement here
    }

	public IAdapterSMS getAdapter() {
		return adapter;
	}

	public void setAdapter(IAdapterSMS adapter) {
		this.adapter = adapter;
	}
    
}