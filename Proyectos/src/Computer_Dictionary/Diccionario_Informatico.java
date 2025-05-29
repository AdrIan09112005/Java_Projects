package Computer_Dictionary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
*
* @author alans
*/

public class Diccionario_Informatico
{
    private static final int TAMAÑO_DICCIONARIO = 16;
    private static String[] palabra = new String[TAMAÑO_DICCIONARIO];
    private static String[] significado = new String[TAMAÑO_DICCIONARIO];
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---¡Bienvenido al Diccionario Informatico!---");
        inicializarDiccionario();
        
        char option;
        do
        {
            mostrarMenu();
            option = Character.toUpperCase(br.readLine().charAt(0));
            
            switch(option)
            {
                case '1':
                    listadoPalabras();
                    break;
                    
                case '2':
                    palabraBuscada(br);
                break;

                case '3':
                    detalleDiccionario();
                break;

                case 'S':
                    System.out.println("\n---Finalizando el programa.¡Hasta Pronto!---");
                break;

                default:
                   System.out.println("\n****¡EROR! Vuelva a intentarlo!****");
            }
        } 
        
        while (option != 'S');
    }
    
    public static void mostrarMenu()
    {
        System.out.println("\nHola de nuevo usuraio\nPor favor, seleccione una de las siguientes opciones\n");
        System.out.println("1. Listado De Palabras en el Diccionario");
        System.out.println("2. Busqueda de Plabras en el Diccionario");
        System.out.println("3. Detalle de las Palabras en el Diccionario");
        System.out.println("S. Salir del Software\n");
    }
    
    public static void inicializarDiccionario()
    {
        palabra[0] = "Sintaxis";
        palabra[1] = "Unidimensional";
        palabra[2] = "Buffer";
        palabra[3] = "Pruebas Secuenciales";
        palabra[4] = "Algoritmo";
        palabra[5] = "Arbol";
        palabra[6] = "Base de Datos";
        palabra[7] = "Encoder";
        palabra[8] = "Encriptar";
        palabra[9] = "Gusano";
        palabra[10] = "Jitter";
        palabra[11] = "Kernel";
        palabra[12] = "LTP";
        palabra[13] = "Password";
        palabra[14] = "Player";
        palabra[15] = "Red";
        
        significado[0] = "conjunto de reglas que establece el orden y la relación de los elementos que componen un lenguaje de programación.";
        significado[1] = "Un tipo de arreglo con una sola dimensión.";
        significado[2] = "El área de almacenamiento temporal en la memoria.";
        significado[3] = "Pruebas en las que dos o mas variantes de un sistema son ejecutados con las mismas entradas.";
        significado[4] = "Conjunto de reglas definidas para la resolución de un problema.";
        significado[5] = "Estructura de datos, almacenando los registros de manera jerárquica.";
        significado[6] = "Conjunto de datos organizados, facilitando el acceso a ellos";
        significado[7] = "Programa especialmente para convertir archivos wave en un archivo MP.";
        significado[8] = "Proteger archivos expresando su contenido en un lenguaje cifrado.";
        significado[9] = "Programa que se copia a sí mismo hasta ocupar toda la memoria\\Siendo un virus que suele llegar por correo electrónico como archivo adjuntado.";
        significado[10] = "Variación en la cantidad de latencia entre paquetes de datos recibidos.";
        significado[11] = "Es el núcleo esencial de un sistema operativo.";
        significado[12] = "Conexión entre una computadora personal y un dispositivo.";
        significado[13] = "Contraseña.";
        significado[14] = "Programa que permite escuchar archivos de sonido.";

        significado[15] = "Conjunto de dos o más computadoras interconectadas.";
    }

    public static void listadoPalabras()
    {
        System.out.println("Palabras en el diccionario: ");

        for (String palabras : palabra)
        {
            System.out.println("- " + palabras);
        }

        System.out.println();
    }

    private static void palabraBuscada(BufferedReader br) throws IOException
    {
        System.out.print("Por favor, ingrese la palabra que desea buscar: ");
        String palabraBuscada = br.readLine();
        
        int indice = buscaPalabraIndice(palabraBuscada);
        if(indice != -1)
        {
            System.out.println("\nSignificado de la palabra: \" " + palabraBuscada + "\" " + significado[indice]);
        }
        else
        {
            System.out.println("\nLa palabra \" " + palabraBuscada + "\" no se encuentra en el diccionario.");
        }
    }
    
    private static int buscaPalabraIndice(String palabraBuscada)
    {
        for (int i = 0; i < palabra.length; i++)
        {
            if (palabra[i].equalsIgnoreCase(palabraBuscada))
            {
                return i;
            }
        }
        return -1;
    }
    
    private static void detalleDiccionario()
    {
        System.out.println("\nDetalle del diccionario: ");
        System.out.println("\nCantidad de palabras en el diccionario:" + palabra.length);
        
        for (int i = 0; i < palabra.length; i++)
        {
            System.out.println("\n Palabra: " + palabra[i] + " \n Cantidad de palabras: " + palabra[i].length() + " \n Significado: " + significado[i] + " \n Cantidad de palabras del significado: " + significado[i].length());
        }
    }
}
