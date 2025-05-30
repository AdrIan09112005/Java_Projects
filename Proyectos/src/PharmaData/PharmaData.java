package PharmaData;

import java.io.*;
import java.text.*;
import java.util.*;

/**
 *
 * @author alans
 */

public class PharmaData
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a nuestra empresa Farmaceutica");
        System.out.println("\n-----Inicializando Programa----\n");

        String usuario, contraseña;
        
        do
        {   
            System.out.println("   ***Inicio de Sesion***\n");
            System.out.print("\nIngrese el usuario: ");
            usuario = br.readLine();
            System.out.print("Ingrese la contrasena: ");
            contraseña = br.readLine();
        }   
        
        while (!usuario.equals("usuario") || !contraseña.equals("123"));
            
        /* Nuestra lista para poder almacenar los medicamentos*/
        ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
            
        /* Con esto registraremos los mediacamentos*/
        System.out.println("\nRegistro de Medicamentos (Ingrese 'salir' para finalizar):");
            
        while (true)
        {
            System.out.print("\nPor favor, ingresar Nombre Quimico: ");
            String nombreQuimico = br.readLine();
               
            if (nombreQuimico.equalsIgnoreCase("salir"))
            {
                break;
            }
                
            System.out.print("Nombre generico: ");
            String nombreGenerico = br.readLine();
                
            System.out.print("Nombre al publico: ");
            String nombreRegistrado = br.readLine();
                
            System.out.print("Precio al publico: ");
            float precioPublico = Float.parseFloat(br.readLine());
                
            System.out.print("Forma farmaceutica (1. Solido / 2. Semisolido / 3.Liquido): ");
            int formaFarmaceutica = Integer.parseInt(br.readLine());
               
            String tipoPresentacion;
            switch (formaFarmaceutica)
            {
                case 1:
                    tipoPresentacion = "solido";
                    break; 
                    
                case 2:
                    tipoPresentacion = "semisolido";
                        break;
                        
                case 3:
                    tipoPresentacion = "liquido";
                    break;
                        
                default:
                    tipoPresentacion = "desconocido";
                    break;
            }
                
            Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado,
            precioPublico, 0, formaFarmaceutica, tipoPresentacion);
                
            listaMedicamentos.add(medicamento);
        }
            
        /* Aquí es donde el programa generará un reporte*/
        generarReporte(usuario, listaMedicamentos);
    }
        
    private static void generarReporte(String usuario, ArrayList<Medicamento> listaMedicamentos)
    {
        System.out.println("\n----Reporte de Medicamentos----");
        System.out.println("Usuario: " + usuario);
        System.out.println("Fecha de generacion: " + obtenerFechaActual());
        System.out.println("Cantidad de productos generados en la lista: " + listaMedicamentos.size());
        System.out.println("\nDesglose de Medicamentos: ");
            
        for (Medicamento medicamento: listaMedicamentos)
        {
            System.out.println(medicamento);
        }
    }
        
    /* Uso de fecha actual en formato dd/MM/yyyy*/
    private static String obtenerFechaActual()
    {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fecha = new Date();
        return formatoFecha.format(fecha);
     }
}