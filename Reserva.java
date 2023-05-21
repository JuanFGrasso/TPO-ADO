
import java.time.LocalDate;
import java.util.*;
import java.io.Serializable;

public class Reserva implements Serializable{

    private int cantidadPersonas;
    private Habitacion habitacion;
    private Cliente cliente;
    private List<Extra> serviciosExtras;
    private LocalDate fechaCheckin;
    private LocalDate fechaCheckout;
    private double precioBase;
    private double montoFinal;
    private PoliticasDePrecio politicasPrecio;
    private EstadoReserva estadoReserva;
    private EstadoPago estadoPago;
    
    public Reserva() {
    }
    public Reserva(int cantidadPersonas , Habitacion habitacion, Cliente cliente, List<Extra> serviciosExtras, LocalDate fechaCheckin, LocalDate fechaCheckout, double precioBase, double montoFinal, PoliticasDePrecio politicasPrecio, EstadoReserva estadoReserva,EstadoPago estadoPago){
        this.cantidadPersonas = cantidadPersonas;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.serviciosExtras = serviciosExtras;
        this.fechaCheckin = fechaCheckin;
        this.fechaCheckout = fechaCheckout;
        this.precioBase = precioBase;
        this.montoFinal = montoFinal;
        this.politicasPrecio = politicasPrecio;
        this.estadoReserva = estadoReserva;
        this.estadoPago = estadoPago;
    }

    public void calcularTotalReserva() {
    	//TODO 
	}

    public double obtenerPrecioFinal() {
        return 0;
    }

}
