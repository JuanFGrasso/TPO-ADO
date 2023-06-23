package modelo;

public class Efectivo implements MedioDePago {

    public void abonarReserva(Reserva reserva) {
    	String idpago = String.valueOf(reserva.getNumero()) + String.valueOf(reserva.getCliente().getDni());
    	System.out.println("Se ha realizado el pago en efectivo con el id de pago " + idpago);
    }

}