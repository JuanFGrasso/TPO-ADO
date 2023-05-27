package modelo;

public class Factura {

    private Cliente cliente;
    private Reserva reserva;

    public Factura(Cliente cliente, Reserva reserva) {
    	this.cliente = cliente;
    	this.reserva = reserva;
    }
    
    public double calcularMonto() {
        // TODO implement here
        return 0.0d;
    }
    
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Reserva getReserva() {
		return reserva;
	}
	
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
    

}
