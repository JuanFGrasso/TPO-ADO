package modelo;

public class PoliticaDefault extends StrategyPoliticas {
	
	public PoliticaDefault() {
		this.descuento = 0;
	}

    public void aplicarPoliticas(Reserva reserva) {
    	reserva.setMontoFinal(reserva.getMontoBase()*(1-descuento));
    }

}
