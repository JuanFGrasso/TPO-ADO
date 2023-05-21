
import java.util.*;

public abstract class EstadoPago {
	
	private Timer timer;

    public EstadoPago() {
    }

    public abstract void pagar(Reserva reserva);

    public abstract void cancelar(Reserva reserva, Timer timer);

}