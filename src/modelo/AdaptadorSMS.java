package modelo;

public class AdaptadorSMS implements Twilio{

	public void enviarSMS(String mensaje, String numero) {
		System.out.println("Se ha enviado el SMS al numero " + numero);
	}

	public void enviarWhatsApp(String mensaje, String numero) {
	}

}