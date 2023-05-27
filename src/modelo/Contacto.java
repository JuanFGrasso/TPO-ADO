package modelo;

public class Contacto {
	
	private String telefono;
    private String email;
    private IStrategyMetodoContacto metodo;

    public Contacto(String telefono, String email, IStrategyMetodoContacto metodo) {
    	this.telefono = telefono;
    	this.email = email;
    	this.metodo = metodo;
    }
    
    public void setStrategy(IStrategyMetodoContacto estrategia) {
        this.metodo = estrategia;
    }

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public IStrategyMetodoContacto getMetodo() {
		return metodo;
	}

	public void setMetodo(IStrategyMetodoContacto metodo) {
		this.metodo = metodo;
	}

}