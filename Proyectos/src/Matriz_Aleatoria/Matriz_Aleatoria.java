package Matriz_Aleatoria;

import java.util.Random;
import java.util.Scanner; // Usamos esta libreria para tomar generar números aleartorios

/**
*
* @author alans
*/

public class Matriz_Aleatoria
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int filas, columnas;
        
        System.out.println("\n======================================");
        System.out.println("Matriz cuadrada de números aleatorios");
        System.out.println("=====================================");
        do
        {
            System.out.print("\nIndique la cantidad de filas: ");
            filas = scanner.nextInt();
            
            System.out.print("Indique la cantidad de columnas: ");
            columnas = scanner.nextInt();

            if (filas != columnas)
            {
                System.out.println("Los valores de filas y columnas deben ser iguales. Intente nuevamente.");
            }
            
            System.out.println(""); 

        } 
        
        while (filas != columnas);

        int[][] matriz = new int[filas][columnas];
        Random random = new Random();
        
        for (int i = 0; i < filas; i++)
        {
            for (int j = 0; j < columnas; j++)
            {
                matriz[i][j] = random.nextInt(100) + 1; // Rango del 1 al 100
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n- - - - - - - - - - - - - - -");
        
        for (int i = 0; i < filas; i++)
        {
            int pares = 0, impares = 0;
     
            for (int j = 0; j < columnas; j++)
            {
                if (matriz[i][j] % 2 == 0)
                {
                    pares++;
                } 
                else 
                {
                    impares++;
                }
            }
            System.out.println("Cantidad de pares : " + pares + ", Impares: " + impares + " en la fila " + (i+1));
        }
        
        System.out.println("\n- - - - - - - - - - - - - - -");
        for (int j = 0; j < columnas; j++)
        {
            int pares = 0, impares = 0;
            
            for (int i = 0; i < filas; i++)
            {
                if (matriz[i][j] % 2 == 0)
                {
                    pares++;
                } 
                else 
                {
                    impares++;
                }
            }

            System.out.println("Cantidad de pares : " + pares + ", Impares: " + impares + " en la columna " + (j+1));
        }
        
        int sumaTotal = 0;
        for (int i = 0; i < filas; i++)
        {
            for (int j = 0; j < columnas; j++)
            {
                sumaTotal += matriz[i][j];
            }
        }
        
        System.out.println("\nLa suma total de los valores del vector es: " + sumaTotal);
    }
}
