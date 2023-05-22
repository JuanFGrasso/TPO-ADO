
import java.util.*;

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

}