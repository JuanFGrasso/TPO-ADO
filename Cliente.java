package negocio;
import java.io.Serializable;
import java.util.*;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private Contacto contacto;
    
    public Cliente() {
    }
    
    public Cliente(String nombre, String apellido, String dni, Contacto contacto) {
    	this.nombre = nombre;
    	this.apellido = apellido;
    	this.dni = dni;
    	this.contacto = contacto;
    }



}
