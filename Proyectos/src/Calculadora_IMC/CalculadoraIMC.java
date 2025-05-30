package Calculadora_IMC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*
* @author alans
*/

public class CalculadoraIMC
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char opcion;
        do
        {
            mostrarMenu();
            opcion = br.readLine().toUpperCase().charAt(0);
            switch (opcion)
            {
                case '1':
                    IndiceMasaCorporal(br);
                    break;
                
                case '2':
                    IndiceMasaCorporalMagra(br);
                    break;
                
                case '3':
                    MetabolismoBasal(br);
                    break;
                
                case 'S':
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
            
        while (opcion != 'S');
    }
    
    private static void mostrarMenu()
    {
        System.out.println("\n¡Bienvenido a la calculadora nutritiva!");
        
        System.out.println("\nPor favor, seleccione uno de los incisos que aparecen en la pantalla:");
        System.out.println("1. Calculo de masa corporal (IMC)");
        System.out.println("2. Calculo de masa corporal magra");
        System.out.println("3. Calculo de metabolismo basal");
        System.out.println("S. Salir");
    }
    
    private static void IndiceMasaCorporal(BufferedReader br) throws IOException
    {
        System.out.println("\nA continuacion calcularemos su IMC (Indice de Masa Corporal)");
        System.out.print("Por favor, proporcione su peso en kg: ");
        double peso = Double.parseDouble(br.readLine());
        
        System.out.print("Por favor, proporcione su estatura en cm:");
        double estatura = Double.parseDouble(br.readLine()) / 100; // Convertir a metros
        
        double imc = peso / (estatura * estatura);
        
        System.out.println("Su Indice de Masa Corporal es de: " + imc);
        
        if (imc < 18.50)
        {
            System.out.println("\nTipo de Peso: Bajo"); 
            System.out.println("Menor a 18.9  se considera como Peso Bajo\n");
        }
        else
            if (imc >= 18.50 && imc <= 24.99)
            {
                System.out.println("\nTipo de Peso: Normal"); 
                System.out.println("De 18.50 a 24.99 se considera como Peso Normal\n");
            }
            else
                if (imc >= 25.00 && imc <= 29.99)
                {
                    System.out.println("\nTipo de Peso: Sobrepeso"); 
                    System.out.println("De 25.00 a 29.99 se considera Sobrepeso\n");
                }
                else
                    if (imc >= 30.00 && imc <= 34.99)
                    {
                        System.out.println("\nTipo de Peso: Obesidad Leve"); 
                        System.out.println("De 30.00 a 34.99 se considera como Obesidad Leve\n");
                    }
                    else
                        if (imc >= 35.00 && imc <= 39.99)
                        {
                            System.out.println("\nTipo de Peso: Obsesidad Media"); 
                            System.out.println("De 35.00 a 39.99 se considera como Obesidad Media\n");
                        }
                        else
                            if (imc>40)
                            {
                                System.out.println("\nTipo de Peso: Obesidad Morbida"); 
                                System.out.println("Pasando los 40.00 se considera como Obesidad Morbida\n");
                            }  
    }
    
    private static void IndiceMasaCorporalMagra(BufferedReader br) throws IOException
    {
        double masaCorporalMagra;
        
        System.out.println("\nA continuacion calcularemos su MCM (Indice de Masa Magra)");
        System.out.print("Por favor, proporcione su peso en kg: ");
        double peso = Double.parseDouble(br.readLine());
        
        System.out.print("Por favor, proporcione su estatura en cm:");
        double estatura = Double.parseDouble(br.readLine());
        
        System.out.print("Por favor proporcione su tipo de sexo (M/F):");
        char sexo = br.readLine().toUpperCase().charAt(0);
        
        if (sexo == 'F')
        {
            masaCorporalMagra = (1.07 * peso) - 148 * Math.pow((peso * peso) / (estatura * estatura), 2);
        }
        else
        {
            masaCorporalMagra = (1.10 * peso) - 128 * Math.pow((peso * peso) / (estatura * estatura), 2);
        }
        
        System.out.println("\nMasa Corporal Magra Calculada: " + masaCorporalMagra + "\n");
    }

    private static void MetabolismoBasal(BufferedReader br) throws IOException
    {
        double metabolismoBasal;
        
        System.out.println("\nA continuacion calcularemos su Metabolismo Basal: ");
        
        System.out.print("Por favor, proporcione su peso en kg: ");
        double peso = Double.parseDouble(br.readLine());
        
        System.out.print("Por favor, ingrese su estatura en cm: ");
        double estatura = Double.parseDouble(br.readLine());

        System.out.print("Por favor, proporcione su edad: ");
        int edad = Integer.parseInt(br.readLine());

        System.out.print("Por favor, proporcione su tipo de sexo (M/F): ");
        char sexo = br.readLine().toUpperCase().charAt(0);
        
        if (sexo == 'F')
        {
            metabolismoBasal = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
        }
        else
        {
            metabolismoBasal = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
        }
        
        System.out.println("\nMetabolismo Basal Calculado: " + metabolismoBasal + "\n");
    }
}