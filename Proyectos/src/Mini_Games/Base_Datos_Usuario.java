package Mini_Games;

import java.io.*;

/**
 *
 * @author alans
 */
public abstract class Base_Datos_Usuario
{  
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String nombre; 
    public String correo; 
    public String telefono;
    public String fechaNacimiento;
    public String partida;
    public boolean ganado; 

    public Base_Datos_Usuario (String nombre, String correo, String telefono, 
                                String fechaNacimiento, String partida, boolean ganado)
    {
        this.nombre = nombre;
        this.correo = correo; 
        this.telefono = telefono; 
        this.fechaNacimiento = fechaNacimiento; 
        this.partida = partida;
        this.ganado = ganado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}