package modelo;

public class AnticipacionSesentaDias extends IStrategyPoliticas {
	
	public AnticipacionSesentaDias() {
		this.descuento = 0.20;
	}

    public void aplicarPoliticas(Reserva reserva) {
    	reserva.setMontoFinal(reserva.getMontoBase()*(1-descuento));
    }

}