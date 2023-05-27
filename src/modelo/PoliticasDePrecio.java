package modelo;

public abstract class PoliticasDePrecio {
	
	private double porcentaje15dias = 0.15;
    private double porcentaje60dias = 0.20;

    public PoliticasDePrecio() {
    }

    public double aplicarPoliticas(Reserva reserva) {
        // TODO implement here
        return 0.0d;
    }

	public double getPorcentaje15dias() {
		return porcentaje15dias;
	}

	public void setPorcentaje15dias(double porcentaje15dias) {
		this.porcentaje15dias = porcentaje15dias;
	}

	public double getPorcentaje60dias() {
		return porcentaje60dias;
	}

	public void setPorcentaje60dias(double porcentaje60dias) {
		this.porcentaje60dias = porcentaje60dias;
	}
    
}