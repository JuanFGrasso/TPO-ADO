package modelo;

public class AdaptadorWhatsApp implements Twilio{

	public void enviarSMS(String mensaje, String numero) {
	}
	public void enviarWhatsApp(String mensaje, String numero) {
		System.out.println("Se ha enviado el WhatsApp al numero " + numero);
	}

}