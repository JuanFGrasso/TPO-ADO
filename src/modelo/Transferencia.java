package modelo;

public class Transferencia implements MedioDePago {
	
	String CBU;
	AdaptadorMercadoPago adapter;

    public Transferencia(String CBU, AdaptadorMercadoPago adapter) {
    	this.CBU = CBU;
    	this.adapter = adapter;
    }

    public void abonarReserva(Reserva reserva) {
    	String idpago = String.valueOf(reserva.getNumero()) + String.valueOf(reserva.getCliente().getDni());
    	double monto = reserva.getMontoFinal();
    	adapter.realizarPagoTransferencia(this.CBU, idpago, monto);
    }

}