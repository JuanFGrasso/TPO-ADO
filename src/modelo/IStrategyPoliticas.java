package modelo;

public abstract class IStrategyPoliticas {
	
	protected double descuento;
	
	public abstract double aplicarPoliticas(Reserva reserva);
	
	public double getDescuento() {
		return descuento;
	}
	
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

}