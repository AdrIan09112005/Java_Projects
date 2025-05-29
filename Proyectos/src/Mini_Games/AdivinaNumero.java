package Mini_Games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alans
 */

public class AdivinaNumero extends Base_Datos_Usuario
{
    public AdivinaNumero(String nombre, String correo, String telefono, String fechaNacimiento) 
    {
        super(nombre, correo, telefono, fechaNacimiento, "Adivina el número", false);
    }

    
    public void jugar() throws IOException
    {
        int numeroAleatorio = (int) (Math.random() * 10) + 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n****************************************");
        System.out.println("Bienvenido a Adivina el número, " + nombre + "!");
        System.out.println("****************************************");

        for (int intentos = 0; intentos < 3; intentos++) 
        {
            System.out.print("Intento " + (intentos + 1) + ": Ingresa un número del 1 al 10: ");
            int numero = Integer.parseInt(br.readLine());
            System.out.println("\n"); 
            
            if (numero == numeroAleatorio)
            {
                ganado = true;
                System.out.println("¡Felicidades, has ganado!");
                return;
            }
                else 
                {
                    System.out.println("¡Incorrecto! Intenta de nuevo.");
                }
        }
        
        System.out.println("Lo siento, has agotado tus intentos. Sigue participando.");
    }
}