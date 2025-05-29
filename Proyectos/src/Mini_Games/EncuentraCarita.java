package Mini_Games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class EncuentraCarita extends Base_Datos_Usuario
{
    public EncuentraCarita(String nombre, String correo, 
                           String telefono, String fechaNacimiento)
    {
        super(nombre, correo, telefono, fechaNacimiento, "Encuentra la carita", false);
    }
    
    public void jugar() throws IOException 
    {
        char[][] tabla = 
        {
            {'X', 'X', 'X'},
            {'X', 'X', 'X'},
            {'X', 'X', 'X'}
        };

        // Generar una posición aleatoria para la carita
        Random random = new Random();
        int filaCarita = random.nextInt(3);    // 0 a 2
        int colCarita = random.nextInt(3);     // 0 a 2

        tabla[filaCarita][colCarita] = '\u263A';  // ☺

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n****************************************");
        System.out.println("Bienvenido a Encuentra la carita, " + nombre + "!");
        System.out.println("\n****************************************");
        System.out.println("Tabla:");

        for (char[] fila : tabla) 
        {
            for (char c : fila) 
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.print("Ingresa la fila (1-3): ");
        int fila = Integer.parseInt(br.readLine()) - 1;
        System.out.print("Ingresa la columna (1-3): ");
        int columna = Integer.parseInt(br.readLine()) - 1;

        if (tabla[fila][columna] == '\u263A') 
        {
            ganado = true;
            System.out.println("\n¡Felicidades, has ganado!");
        } 
        else 
        {
            System.out.println("\nLo siento, sigue participando.");
        }
    }
}
