package modelo;

public class TarjetaDeDebito implements MedioDePago {
	
	int numero;
	int codigo;
	String vencimiento;
	AdaptadorMercadoPago adapter;

    public TarjetaDeDebito(int numero, int codigo, String vencimiento, AdaptadorMercadoPago adapter) {
    	this.numero = numero;
    	this.codigo = codigo;
    	this.vencimiento = vencimiento;
    	this.adapter = adapter;
    }

    public void abonarReserva(Reserva reserva) {
    	String idpago = String.valueOf(reserva.getNumero()) + String.valueOf(reserva.getCliente().getDni());
    	double monto = reserva.getMontoFinal();
    	adapter.realizarPagoTD(numero, codigo, vencimiento, idpago, monto);
    }

}