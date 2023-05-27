package modelo;

public class Email {
	
	private IAdapterEmail adapter;

    public Email(IAdapterEmail adapter) {
    	this.adapter = adapter;
    }

    public void enviarFactura(Factura factura, Cliente cliente) {
        // TODO implement here
    }

	public IAdapterEmail getAdapter() {
		return adapter;
	}

	public void setAdapter(IAdapterEmail adapter) {
		this.adapter = adapter;
	}

}