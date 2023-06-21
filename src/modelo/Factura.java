package modelo;

public class Factura {
	
	private int numero;
	private static int contador = 0;
    private Reserva reserva;

    public Factura(Reserva reserva) {
    	this.reserva = reserva;
    	this.numero = contador;
    	contador++;
    }
	
	public Reserva getReserva() {
		return reserva;
	}
	
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
    

}
