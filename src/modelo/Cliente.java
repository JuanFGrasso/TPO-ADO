package modelo;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private Contacto contacto;
    
    public Cliente(String nombre, String apellido, String dni, Contacto contacto) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.dni = dni;
    	this.contacto = contacto;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
    
}
