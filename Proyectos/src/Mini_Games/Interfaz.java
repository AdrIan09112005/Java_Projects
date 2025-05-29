package Mini_Games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author alans
 */

public class Interfaz
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Base_Datos_Usuario> historial = new ArrayList<>();
      
        EncuentraCarita encuentra = null;
        GiraCarta girar = null;
        AdivinaNumero adivina = null;
        
        System.out.println("\n***** Bienvenido a Mini Games *****");
        System.out.println("A continuación, por favor ingrese sus datos personales para continuar: ");
        System.out.println("¿Cuál es su nombre?");
        String nombre = br.readLine();
            
        System.out.println("Ingrese su correo electronico: ");
        String correo = br.readLine();
            
        System.out.println("¿Cuál es su numero telefonico?");
        String telefono = br.readLine();

        System.out.println("¿Cuál es su fecha de nacimiento?");
        String fechaNacimiento = br.readLine();

            
        while(true)
        {
            System.out.println("\n***** Bienvenido Usuario *****");
            System.out.println("A continuación, elija uno de los siguientes juegos: ");
       
            System.out.println("\n 1. Adivina el Numero");
            System.out.println(" 2. Encuntra la Carita");
            System.out.println(" 3. Gira alguna Carta");
            System.out.println(" S. Salir");
            
            int opcion = Integer.parseInt(br.readLine());

            
            if(opcion == 4)
            {
                System.out.println("\n---- Gracias Usuario ----");
                System.out.println(" ***** Fin_Del_Programa *****");
                break;
            }
                        
            switch (opcion) 
            {
                case 1:
                    adivina = new AdivinaNumero(nombre, correo, telefono, fechaNacimiento);
                    adivina.jugar();
                    historial.add(adivina);
                    break;
                    
                case 2:
                    encuentra = new EncuentraCarita(nombre, correo, telefono, fechaNacimiento);
                    encuentra.jugar();
                    historial.add(encuentra);
                    break;
                case 3:
                    girar = new GiraCarta(nombre, correo, telefono, fechaNacimiento);
                    girar.jugar();
                    historial.add(girar);
                    break;
                    
                default:
                    System.out.println("Juego invalido. Seleccione de nuevo");
            }
            

        }
        
        System.out.println("------ Historial de Activaciones ------");
        for (Base_Datos_Usuario base_datos_usuario: historial) 
        {
            System.out.println(base_datos_usuario);
        }

    }     
}
