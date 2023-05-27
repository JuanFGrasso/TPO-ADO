package modelo;

public class Timer {
	
	private double limite = 24;

    public Timer(double limite) {
    	this.limite = limite;
    }

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}