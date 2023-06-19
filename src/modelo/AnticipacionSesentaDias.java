package modelo;

public class AnticipacionSesentaDias extends IStrategyPoliticas {
	
	public AnticipacionSesentaDias() {
		this.descuento = 0.20;
	}

    public double aplicarPoliticas(Reserva reserva) {
        return 0;
    }

}