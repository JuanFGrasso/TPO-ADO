package modelo;

public interface MercadoPago {
	
	public void realizarPagoTC(int numero, int codigo, String vencimiento, String idpago, double monto);
	
	public void realizarPagoTD(int numero, int codigo, String vencimiento, String idpago, double monto);
	
	public void realizarPagoTransferencia(String CBU, String idpago, double monto);


}