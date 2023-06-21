package modelo;

public class SMS implements IStrategyMetodoContacto{
	
	private AdaptadorTwillio adapter;

    public SMS(AdaptadorTwillio adapter) {
    	this.adapter = adapter;
    }
  
    public void enviarFactura(Factura factura) {
    	String mensaje = "Factura.PDF";
    	String numero = factura.getReserva().getCliente().getContacto().getTelefono();
    	adapter.enviarWhatsApp(mensaje, numero);
    }
    
    public void enviarNotificacion(Reserva reserva, String estado) {
    	String mensaje = "Su reserva se encuentra en el estado " + estado;
    	String numero = reserva.getCliente().getContacto().getTelefono();
    	adapter.enviarWhatsApp(mensaje, numero);
    }

	public AdaptadorTwillio getAdapter() {
		return adapter;
	}

	public void setAdapter(AdaptadorTwillio adapter) {
		this.adapter = adapter;
	}
    
}