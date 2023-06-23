package vista;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import controller.CargarClientes;
import controller.CargarHabitaciones;
import controller.EnviarFactura;
import controller.MostrarHabitaciones;
import controller.RealizarReserva;
import modelo.AdaptadorMercadoPago;
import modelo.DisponibilidadHabitacion;
import modelo.Efectivo;
import modelo.Habitacion;
import modelo.Simple;
import modelo.TarjetaDeCrédito;
import modelo.TarjetaDeDebito;
import modelo.TipoHabitacion;
import modelo.Transferencia;

public class Menu {
	
	CargarHabitaciones cargarh = new CargarHabitaciones();
	MostrarHabitaciones mostrarh = new MostrarHabitaciones();
	CargarClientes cargarc = new CargarClientes();
	RealizarReserva realizar = new RealizarReserva();
	EnviarFactura enviarf = new EnviarFactura();
	
	public void MenuPrincipal() {
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Habitaciones");
            System.out.println("2. Usuarios");
            System.out.println("3. Reservas");
            System.out.println("4. Facturas");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	MenuHabitaciones();
                    break;
                case 2:
                	MenuUsuarios();
                    break;
                case 3:
                    MenuReservas();
                    break;
                case 4:
                    MenuFactura();
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 5);
	}
	
	private void MenuHabitaciones() {
		Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
        	System.out.println("Menu:");
            System.out.println("1. Crear habitacion");
            System.out.println("2. Cambiar disponibilidad habitacion");
            System.out.println("3. Cambiar precio diario habitacion");
            System.out.println("4. Mostrar habitaciones por filtro");
            System.out.println("9. Volver");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
            case 1:
                System.out.print("Ingrese el numero:");
                int numero = scanner.nextInt();
                System.out.print("Ingrese la capacidad:");
                int capacidad = scanner.nextInt();
                System.out.print("Ingrese el precio:");
                double precio = scanner.nextDouble();
                System.out.print("Ingrese el tipo de habitacion (0: SIMPLE, 1: SUITE):");
                int tipo = scanner.nextInt();
                
                if (tipo == 0) {
                	cargarh.crearHabitacion(numero, capacidad, precio, TipoHabitacion.SIMPLE);
                } else if (tipo == 1){
                	cargarh.crearHabitacion(numero, capacidad, precio, TipoHabitacion.SUITE);
                }
                
                break;
            case 2:
                System.out.print("Ingrese el numero:");
                int numero2 = scanner.nextInt();
                System.out.print("Ingrese la disponibilidad de habitacion (0: Disponible, 1: Reservado):");
                int dispo2 = scanner.nextInt();
                System.out.print("Ingrese la fecha (AAAA-MM-DD):");
                String fecha2 = scanner.next();
                
                if (dispo2 == 0) {
                	cargarh.cambiarDisponibilidadHabitacion(numero2, DisponibilidadHabitacion.Disponible, LocalDate.parse(fecha2));
                } else if (dispo2 == 1){
                	cargarh.cambiarDisponibilidadHabitacion(numero2, DisponibilidadHabitacion.Reservada, LocalDate.parse(fecha2));
                }
                
                break;
            case 3:
            	System.out.print("Ingrese el numero:");
                int numero3 = scanner.nextInt();
                System.out.print("Ingrese el precio diario:");
                double precio3 = scanner.nextInt();
                
                cargarh.cambiarPrecioDiariodHabitacion(numero3, precio3);
                
                break;
            case 4:
            	System.out.print("Ingrese la disponibilidad de habitacion (0: Disponible, 1: Reservado):");
                int dispo4 = scanner.nextInt();
                System.out.print("Ingrese la capacidad:");
                int capacidad4 = scanner.nextInt();
                System.out.print("Ingrese el tipo de habitacion (0: SIMPLE, 1: SUITE):");
                int tipo4 = scanner.nextInt();
                System.out.print("Ingrese la fecha (AAAA-MM-DD):");
                String fecha4 = scanner.next();
                
                ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
                
                if (dispo4 == 0) {
                	if (tipo4 == 0) {
                		habitaciones = mostrarh.mostrarHabitacionesXFiltros(DisponibilidadHabitacion.Disponible, capacidad4, TipoHabitacion.SIMPLE, LocalDate.parse(fecha4));
                	} else if (tipo4 == 1) {
                		habitaciones = mostrarh.mostrarHabitacionesXFiltros(DisponibilidadHabitacion.Disponible, capacidad4, TipoHabitacion.SUITE, LocalDate.parse(fecha4));
                	}
                } else if (dispo4 == 1) {
                	if (tipo4 == 0) {
                		habitaciones = mostrarh.mostrarHabitacionesXFiltros(DisponibilidadHabitacion.Reservada, capacidad4, TipoHabitacion.SIMPLE, LocalDate.parse(fecha4));
                	} else if (tipo4 == 1) {
                		habitaciones = mostrarh.mostrarHabitacionesXFiltros(DisponibilidadHabitacion.Reservada, capacidad4, TipoHabitacion.SUITE, LocalDate.parse(fecha4));
                	}
                }
            	
                System.out.print(String.format("%20s %20s %20s %20s %20s %n", "Numero", "Tipo", "Disponibilidad", "Capacidad", "Precio Diario"));
        		for (Habitacion habitacion: habitaciones) {
        			String s1 = String.valueOf(habitacion.getNumero());
        			String s2;
        			
        			if (habitacion instanceof Simple) {
        				s2 = "Simple";
        			} else {
        				s2 = "Suite";
        			}
        			
        			String s3 = habitacion.getDisponibilidadXDia(LocalDate.parse(fecha4));
        			String s4 = String.valueOf(habitacion.getCapacidad());
        			String s5 = String.valueOf(habitacion.getPrecioDiario());
        			System.out.println(String.format("%20s %20s %20s %20s %20s", s1, s2, s3, s4, s5));
        		}
                
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
                break;
            }
		
        } while(opcion != 9);
	}
	
	private void MenuUsuarios() {
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Cambiar nombre y apellido del cliente");
            System.out.println("3. Cambiar contacto cliente");
            System.out.println("4. Mostrar clientes");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	System.out.print("Ingrese el nombre:");
                	String nombre = scanner.next();
                	System.out.print("Ingrese el apellido:");
                	String apellido = scanner.next();
                	System.out.print("Ingrese el dni:");
                	String dni = scanner.next();
                	System.out.print("Ingrese el telefono:");
                	String telefono = scanner.next();
                	System.out.print("Ingrese el email:");
                	String email = scanner.next();
                	System.out.print("Ingrese el metodo (1: Email, 2: SMS, 3: Whatsapp):");
                	int metodo = scanner.nextInt();
                	
                	cargarc.crearCliente(nombre, apellido, dni, cargarc.crearContacto(telefono, email, opcion));
                	
                	break;
                	
                case 2:
                	System.out.print("Ingrese el dni:");
                	String dni2 = scanner.next();
                	System.out.print("Ingrese el nombre:");
                	String nombre2 = scanner.next();
                	System.out.print("Ingrese el apellido:");
                	String apellido2 = scanner.next();
                	
                	cargarc.cambiarNombreApellidoCliente(dni2, nombre2, apellido2);
                	
                    break;
                case 3:
                	System.out.print("Ingrese el dni:");
                	String dni3 = scanner.next();
                	System.out.print("Ingrese el telefono:");
                	String telefono3 = scanner.next();
                	System.out.print("Ingrese el email:");
                	String email3 = scanner.next();
                	System.out.print("Ingrese el metodo (1: Email, 2: SMS, 3: Whatsapp):");
                	int metodo3 = scanner.nextInt();
                	
                	cargarc.cambiarContactoCliente(dni3, cargarc.crearContacto(telefono3, email3, opcion));
                	
                    break;
                case 4:
                    
                	cargarc.mostrarClientes();
                	
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 9);
	}
	
	private void MenuReservas() {
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Crear Reserva");
            System.out.println("2. Confirmar Reserva");
            System.out.println("3. Cancelar Reserva");
            System.out.println("4. Validar Tiempos");
            System.out.println("5. Mostrar Reservas");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	System.out.print("Ingrese numero de habitacion: ");
                	int habitacion = scanner.nextInt();
                	System.out.print("Ingrese el dni del cliente: ");
                	String dni = scanner.next();
                	System.out.print("Ingrese la fecha checkin (AAAA-MM-DD): ");
                	String checkin = scanner.next();
                	System.out.print("Ingrese la fecha checkout (AAAA-MM-DD): ");
                	String checkout = scanner.next();
                	
                	realizar.crearReserva(habitacion, dni, LocalDate.now(), LocalDate.parse(checkin), LocalDate.parse(checkout));
                	
                    break;
                case 2:
                	System.out.print("Ingrese numero de reserva: ");
                	int reserva = scanner.nextInt();
                	System.out.println("Opciones de Pago: ");
                	System.out.println("1.Transferencia");
                	System.out.println("2.Tarjeta de Debito");
                	System.out.println("3.Tarjeta de Credito ");
                	System.out.println("4.Efectivo ");
                	int mediopago = scanner.nextInt();
                	
                	switch (mediopago) {
                	case 1:
                		System.out.print("Ingrese el CBU: ");
                		String cbu = scanner.next();
                		
                		realizar.confirmarReserva(reserva, new Transferencia(cbu, new AdaptadorMercadoPago()));
                		
                		break;
                	case 2:
                		System.out.print("Ingrese el numero de tarjeta: ");
                		int numero = scanner.nextInt();
                		System.out.print("Ingrese el codigo de tarjeta: ");
                		int codigo = scanner.nextInt();
                		System.out.print("Ingrese el vencimiento de tarjeta: ");
                		String vencimiento = scanner.next();
                		
                		realizar.confirmarReserva(reserva, new TarjetaDeDebito(numero, codigo, vencimiento, new AdaptadorMercadoPago()));
                		
                		break;
                	case 3:		
                		System.out.print("Ingrese el numero de tarjeta: ");
                		int numero3 = scanner.nextInt();
                		System.out.print("Ingrese el codigo de tarjeta: ");
                		int codigo3 = scanner.nextInt();
                		System.out.print("Ingrese el vencimiento de tarjeta: ");
                		String vencimiento3 = scanner.next();
                		
                		realizar.confirmarReserva(reserva, new TarjetaDeCrédito(numero3, codigo3, vencimiento3, new AdaptadorMercadoPago()));
                		break;
                	case 4:
                		
                		realizar.confirmarReserva(reserva, new Efectivo());
                		
                		break;
                	}
                    break;
                case 3:
                	System.out.print("Ingrese numero de reserva: ");
                	int reserva3 = scanner.nextInt();
                	
                	realizar.cancelarReserva(reserva3);
                	
                    break;
                case 4:
                	System.out.print("Ingrese numero de reserva: ");
                	int reserva4 = scanner.nextInt();
                	
                	realizar.validarTiempo(reserva4);
                	
                    break;
                case 5:
                	realizar.mostrarReservas();
                	
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 9);
	}
	
	private void MenuFactura() {
		Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Enviar Factura");
            System.out.println("2. Mostrar Factura");
            System.out.println("9. Volver");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	System.out.print("Ingrese el numero de factura:");
                	int factura = scanner.nextInt();
                	
                	enviarf.enviarFactura(factura);
                	
                case 2:
                    enviarf.mostrarFacturas();
                	
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        } while (opcion != 9);
	}
}
	
	
			
