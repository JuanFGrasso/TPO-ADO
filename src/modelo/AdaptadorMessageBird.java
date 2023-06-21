package modelo;

public class AdaptadorMessageBird implements MessageBird{

	public void enviarMail(String mensaje, String cabecera, String email) {
		System.out.println("Mensaje: "+ mensaje + " Cabecera: " + cabecera + " Email: " + email);
	}

}