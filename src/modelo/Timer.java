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
	
	public void validarTiempo(Reserva reserva, LocalDate fechaHoy) {
		if (reserva.getEstadoReserva() instanceof Reservado) {
			if (reserva.getFechaCompra().isBefore(fechaHoy)) {
				reserva.getEstadoReserva().cancelar();
			}
		}
		
	}
	
}