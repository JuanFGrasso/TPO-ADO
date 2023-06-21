package modelo;

public class AdaptadorTwillio implements Twilio{

	public void enviarSMS(String mensaje, String numero) {
		System.out.println("Mensaje: "+ mensaje + " Numero: " + numero);
	}
	public void enviarWhatsApp(String mensaje, String numero) {
		System.out.println("Mensaje: "+ mensaje + " Numero: " + numero);
	}

}