package modelo;

public class PoliticaSesentaDias extends StrategyPoliticas {
	
	public PoliticaSesentaDias() {
		this.descuento = 0.20;
	}

    public void aplicarPoliticas(Reserva reserva) {
    	reserva.setMontoFinal(reserva.getMontoBase()*(1-descuento));
    }

}