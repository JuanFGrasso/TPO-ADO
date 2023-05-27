package modelo;

public class Extra {
	
	private double precio;
    private String nombre;

    public Extra(double precio, String nombre) {
    	this.precio = precio;
    	this.nombre = nombre;
    }

    public void calcularValorExtras() {
        // TODO implement here
    }

    public double obtenerPreciosExtras() {
        // TODO implement here
        return 0.0d;
    }

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}