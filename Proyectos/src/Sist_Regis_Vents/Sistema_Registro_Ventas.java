package Sist_Regis_Vents;

import java.util.ArrayList;
import java.util.Scanner;

/**
*
* @author alans
*/

public class Sistema_Registro_Ventas
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<VentaBoletos> listaVentas = new ArrayList<>();

        System.out.println("--- Sistema de Registro de Ventas ---");
        char opcion;

        do
        {
            System.out.println(" 1. Realizar Venta de Boleto");
            System.out.println(" 2. Mostrar Datos de Lista de Ventas");
            System.out.println(" S. Finalizar Programa");
            opcion = scanner.next().charAt(0);

            switch (opcion)
            {
                case '1':
                    System.out.println("\n-------------------------------------");
                    
                    System.out.print("Ingresar nombre del comprador: ");
                    scanner.nextLine(); // Limpiar el buffer
                    String nombreComprador = scanner.nextLine();
                    
                    System.out.print("Ingresa cantidad de pasajeros adicionales: ");
                    int cantidadPasajerosAdicionales = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    ArrayList<String> pasajerosAdicionales = new
                    ArrayList<>();
                    
                    for (int i = 1; i <= cantidadPasajerosAdicionales; i++) 
                    {
                        System.out.print("Ingresar nombre del pasajero adicional " + i + ": ");
                        pasajerosAdicionales.add(scanner.nextLine());
                    }
                    
                    double importeVenta = 1250.50 * (cantidadPasajerosAdicionales + 1);
                    VentaBoletos venta = new VentaBoletos(nombreComprador, pasajerosAdicionales, importeVenta);
                    listaVentas.add(venta);
                    
                    System.out.println("\n----------- Ticket de Venta --------------");
                    System.out.println("Cantidad de Boletos: " + (cantidadPasajerosAdicionales + 1));
                    System.out.println("Importe de Venta: $" + importeVenta);
                    System.out.println("Nombre del Comprador: " + nombreComprador);
                    System.out.println("Pasajeros Adicionales: " + cantidadPasajerosAdicionales);
                    System.out.println("------------------------------------------\n");
                    
                break;

                case '2':
                    System.out.println("----------- Lista de Pasajeros -----------");
                    
                    for (int i = 0; i < listaVentas.size(); i++)
                    {
                        System.out.println("Pasajero " + (i + 1) + "(comprador): " + listaVentas.get(i).getNombreComprador());
                        
                        for (int j = 0; j < listaVentas.get(i).getPasajerosAdicionales().size(); j++)
                        {
                            System.out.println("Pasajero " + (j + 2) + ":" + listaVentas.get(i).getPasajerosAdicionales().get(j));
                        }
                    }
                    
                    System.out.println("Total de Pasajeros: " + totalPasajeros(listaVentas));
                    System.out.println("Monto Total de las Ventas: $" + montoTotalVentas(listaVentas));
                    System.out.println("------------------------------------------\n");

                break;

                case 'S':
                    System.out.println("----------- Fin del Programa ------------");
                break;
                
                default:
                    System.out.println("OpciÃ³n no vÃ¡lida. Intente de nuevo.");
            }
        }

        while (opcion != 'S');
    }

    private static int totalPasajeros(ArrayList<VentaBoletos> listaVentas)
    {
        int total = 0;
        for (VentaBoletos venta : listaVentas)
        {
            total += venta.getPasajerosAdicionales().size() + 1;
        }
        
        return total;
    }
    
    private static double montoTotalVentas(ArrayList<VentaBoletos> listaVentas)
    {
        double total = 0;
        for (VentaBoletos venta : listaVentas)
        {
            total += venta.getImporteVenta();
        }
        
        return total;
    }
}

class VentaBoletos
{
    private String nombreComprador;
    private ArrayList<String> pasajerosAdicionales;
    private double importeVenta;
    public VentaBoletos(String nombreComprador, ArrayList<String> pasajerosAdicionales, double importeVenta) 
    {
        this.nombreComprador = nombreComprador;
        this.pasajerosAdicionales = pasajerosAdicionales;
        this.importeVenta = importeVenta;
    }
    
    public String getNombreComprador() 
    {
        return nombreComprador;
    }

    public ArrayList<String> getPasajerosAdicionales() 
    {
        return pasajerosAdicionales;
    }

    public double getImporteVenta() 
    {
        return importeVenta;
    }
}