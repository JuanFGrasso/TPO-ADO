package modelo;

public class Email implements IStrategyMetodoContacto{
	
	private AdaptadorMessageBird adapter;

    public Email(AdaptadorMessageBird adapter) {
    	this.adapter = adapter;
    }

    public void enviarFactura(Factura factura) {
    	String mensaje = "Factura.PDF";
    	String cabecera = "Reserva " + String.valueOf(factura.getReserva().getNumero());
    	String email = factura.getReserva().getCliente().getContacto().getEmail();
    	adapter.enviarMail(mensaje, cabecera, email);
    }
    
    public void enviarNotificacion(Reserva reserva, String estado) {
    	String mensaje = "Su reserva se encuentra en el estado " + estado;
    	String cabecera = "Reserva " + String.valueOf(reserva.getNumero());
    	String email = reserva.getCliente().getContacto().getEmail();
    	adapter.enviarMail(mensaje, cabecera, email);
    }

	public AdaptadorMessageBird getAdapter() {
		return adapter;
	}

	public void setAdapter(AdaptadorMessageBird adapter) {
		this.adapter = adapter;
	}

}