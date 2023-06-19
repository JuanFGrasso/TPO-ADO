package modelo;

public class AnticipacionQuinceDias extends IStrategyPoliticas {
	
	public AnticipacionQuinceDias() {
		this.descuento = 0.15;
	}

    public double aplicarPoliticas(Reserva reserva) {
    	return 0;
    }

}