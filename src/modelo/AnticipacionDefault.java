package modelo;

public class AnticipacionDefault extends IStrategyPoliticas {
	
	public AnticipacionDefault() {
		this.descuento = 0;
	}

    public void aplicarPoliticas(Reserva reserva) {
    	reserva.setMontoFinal(reserva.getMontoBase()*(1-descuento));
    }

}
