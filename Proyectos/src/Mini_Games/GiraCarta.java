package Mini_Games;

import java.io.*;
import java.util.Random;

public class GiraCarta extends Base_Datos_Usuario
{
    public GiraCarta(String nombre, String correo, 
                      String telefono, String fechaNacimiento) 
    {
        super(nombre, correo, telefono, fechaNacimiento, "GiraCarta", false);
    }
    
    public void jugar() throws IOException 
    {
        char[] carta = {'X', 'X', 'X', 'X', 'X'};  // todas X al inicio
        Random rand = new Random();
        int posicionReal = rand.nextInt(5);  // número entre 0 y 4
        carta[posicionReal] = '\u2666';      // colocar el diamante aleatoriamente

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n***********************************");
        System.out.println("Bienvenido a Gira una carta, " + nombre + "!");
        System.out.println("***********************************");
        System.out.println("Carta: " + new String(carta));  // Muestra la carta (antes de seleccionar)

        System.out.print("\nIngresa la posición donde crees que está el símbolo de diamante (1-5): ");
        int posicion = Integer.parseInt(br.readLine()) - 1;

        if (posicion == posicionReal)
        {
            ganado = true;
            System.out.println("¡Felicidades, has ganado!"); 
        } 
        else 
        {
            System.out.println("Lo siento, sigue participando.");
        }

        System.out.println("\nLa carta correcta estaba en la posición: " + (posicionReal + 1));
        System.out.println("Carta final: " + new String(carta));
        System.out.println("************************************************************************");
    }
}
