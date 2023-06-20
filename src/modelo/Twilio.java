package modelo;

public interface Twilio {
	
	public void enviarSMS(String mensaje, String numero);
	public void enviarWhatsApp(String mensaje, String numero);

}
