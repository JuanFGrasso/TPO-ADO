package modelo;

public class Email implements IStrategyMetodoContacto{
	
	private AdaptadorEmail adapter;

    public Email(AdaptadorEmail adapter) {
    	this.adapter = adapter;
    }

    public void enviarFactura(Factura factura, Cliente cliente) {
        // TODO implement here
    }

	public AdaptadorEmail getAdapter() {
		return adapter;
	}

	public void setAdapter(AdaptadorEmail adapter) {
		this.adapter = adapter;
	}

}