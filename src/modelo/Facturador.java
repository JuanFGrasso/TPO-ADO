package modelo;

public class Facturador {
	
	private MedioDePago medioDePago;

    public Facturador(MedioDePago medioDePago) {
    	this.medioDePago = medioDePago;
    }

    public void crearFactura(Reserva reserva) {
        Factura factura = new Factura(reserva);
        Sistema.getInstance().agregarFacturas(factura);
    }
    
    public void abonarReserva(Reserva reserva) {
    	this.medioDePago.abonarReserva(reserva);
    	reserva.getEstadoReserva().concretar();
    	crearFactura(reserva);
    }

	public MedioDePago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioDePago medioDePago) {
		this.medioDePago = medioDePago;
	}

}