package modelo;

import java.time.LocalDate;

public abstract class Timer {
	
	private double limite = 24;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public static void validarTiempo(Reserva reserva) {
		if (reserva.getEstadoReserva() instanceof Reservado) {
			if (reserva.getFechaCompra().isBefore(LocalDate.now())) {
				reserva.getEstadoReserva().cancelar();
			}
		}
		
	}
	
}