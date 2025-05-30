package Control_Compra_Venta_Cajas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*
* @author alans
*/

public class Control_Compra_Venta_Cajas
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String usuario, contraseña;
        do
        {
            System.out.print("Inicio de Sesión\n");
            System.out.print("\nIngrese el usuario: ");
            usuario = br.readLine();
            System.out.print("Ingrese la contraseña: ");
            contraseña = br.readLine();
        }
        while (!usuario.equals("usuario") || !contraseña.equals("123"));
        
        int totalOperaciones = 0;
        int totalVentas = 0;
        int totalCompras = 0;
        double montoCaja = 0;
        double ingresosVentas = 0;
        double egresosCompras = 0;
        char opcion;
        
        do
        {
            mostrarMenu();
            opcion = Character.toUpperCase(br.readLine().charAt(0));
            
            switch (opcion)
            {
                case '1':
                    comprarCajas(br);
                    totalOperaciones++;
                    totalCompras++;
                break;

                case '2':
                    venderCajas(br);
                    totalOperaciones++;
                    totalVentas++;
                break;
                
                case '3':
                    mostrarReporte(totalVentas, totalCompras, ingresosVentas, egresosCompras, montoCaja);
                break;
                
                case 'S':
                    System.out.println("Finalizando el programa. ¡Hasta pronto!");
                break;
                
                default:
                    System.out.println("Error. Intente de nuevo.");
            }
        }
        
        while (opcion != 'S');
        
        mostrarResumen(totalOperaciones, totalVentas, totalCompras, montoCaja, ingresosVentas, egresosCompras);
    }
    
    private static void mostrarMenu()
    {
        System.out.print("\n¡Bienvenido al control de compra y venta de cajas de papel!\n");
        System.out.print("Hola de vuelta usuario\nMenu:");
        System.out.println("\n1. Comprar cajas de papel");
        System.out.println("2. Vender cajas de papel");
        System.out.println("3. Mostrar reporte");
        System.out.println("S. Salir del programa\n");
    }
    
    private static void comprarCajas(BufferedReader br) throws IOException
    {
        System.out.println("Comprar cajas de papel");
        System.out.print("\nNúmero de cajas a comprar: ");
        int cantidad = Integer.parseInt(br.readLine());
        
        System.out.print("\nCosto de cajas a comprar: ");
        double costo = Double.parseDouble(br.readLine());
        
        double monto = cantidad * costo;
        
        System.out.println("\nEl total de compra realizada por " + cantidad + " cajas al costo " + costo + " es igual a " + monto);
    }
    
    private static void venderCajas(BufferedReader br) throws IOException
    {
        System.out.println("Vender cajas de papel");
        System.out.print("Número de cajas a vender: ");
        int cantidad = Integer.parseInt(br.readLine());

        System.out.print("Número de precio de cajas a vender: ");
        double precio = Double.parseDouble(br.readLine());
        
        double monto = cantidad * precio;
        
        System.out.println("\nGanancia de venta realizada por " + cantidad + " cajas al precio de " + precio + " es igual a " + monto);
    }
    
    private static void mostrarReporte(int totalVentas, int totalCompras, double ingresosVentas, double egresosCompras, double montoCaja)
    {
        System.out.println("\nReporte:");
        System.out.println("\nCantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("Monto en la caja: " + montoCaja);
    }
    
    private static void mostrarResumen(int totalOperaciones, int totalVentas, int totalCompras, double montoCaja, double ingresosVentas, double egresosCompras)
    {
        System.out.println("Resumen Final:");
        System.out.println("\nCantidad total de operaciones realizadas: " + totalOperaciones);
        System.out.println("Cantidad total de ventas: " + totalVentas);
        System.out.println("Cantidad total de compras: " + totalCompras);
        System.out.println("Monto en la caja: " + montoCaja);
        System.out.println("Ingresos generados por ventas: " + ingresosVentas);
        System.out.println("Egresos generados por compras: " + egresosCompras);
        System.out.println("\n¡Gracias por utilizar nuestro software, te esperamos pronto!");
    }
}