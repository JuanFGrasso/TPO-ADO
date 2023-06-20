package modelo;

public class AnticipacionQuinceDias extends IStrategyPoliticas {
	
	public AnticipacionQuinceDias() {
		this.descuento = 0.15;
	}

    public void aplicarPoliticas(Reserva reserva) {
    	reserva.setMontoFinal(reserva.getMontoBase()*(1-descuento));
    }

}