package modelo;

public class AdaptadorEmail implements MessageBird{

	public void enviarMail(String mensaje, String cabecera, String email) {
		System.out.println("Se ha enviado la factura " + cabecera + " al email " + email);
	}

}