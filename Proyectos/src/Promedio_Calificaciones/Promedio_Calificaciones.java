package Promedio_Calificaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Promedio_Calificaciones 
{
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException 
    {
        System.out.println("¡Bienvenido al Promedio de Calificaciones!");

        System.out.print("\n¿Cuántas calificaciones deseas ingresar?: ");
        int cantidad = Integer.parseInt(entrada.readLine());

        int calificacion;
        int suma = 0;

        for (int i = 0; i < cantidad; i++) 
        {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificacion = Integer.parseInt(entrada.readLine());
            suma += calificacion;
        }

        double promedio = (double) suma / cantidad;
        System.out.println("\nEl promedio de sus calificaciones es: " + promedio);
    }
}