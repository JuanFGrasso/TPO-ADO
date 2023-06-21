package modelo;

public interface IStrategyMetodoContacto {

    public void enviarFactura(Factura factura);
    
    public void enviarNotificacion(Reserva reserva, String estado);

}