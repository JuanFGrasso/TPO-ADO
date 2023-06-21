package modelo;

public class AdaptadorMercadoPago implements MercadoPago{

	public void realizarPagoTC(int numero, int codigo, String vencimiento, String idpago, double monto) {
		System.out.println("Se ha realizado el pago con TC " + numero + " con id de pago " + idpago + " por el monto " + monto);
		
	}

	public void realizarPagoTD(int numero, int codigo, String vencimiento, String idpago, double monto) {
		System.out.println("Se ha realizado el pago con TD " + numero + " con id de pago " + idpago + " por el monto " + monto);
		
	}

	public void realizarPagoTransferencia(String CBU, String idpago, double monto) {
		System.out.println("Se ha realizado la transferencia con CBU " + CBU + " con id de pago " + idpago + " por el monto " + monto);
	}
	
	


}