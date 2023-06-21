package modelo;

public class PoliticaDefault extends IStrategyPoliticas {
	
	public PoliticaDefault() {
		this.descuento = 0;
	}

    public void aplicarPoliticas(Reserva reserva) {
    	reserva.setMontoFinal(reserva.getMontoBase()*(1-descuento));
    }

}
