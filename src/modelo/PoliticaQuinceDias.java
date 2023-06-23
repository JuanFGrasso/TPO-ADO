package modelo;

public class PoliticaQuinceDias extends StrategyPoliticas {
	
	public PoliticaQuinceDias() {
		this.descuento = 0.15;
	}

    public void aplicarPoliticas(Reserva reserva) {
    	reserva.setMontoFinal(reserva.getMontoBase()*(1-descuento));
    }

}