package Nomina;

/**
 *
 * @author alans
 */

public class Categoria
{
    public String clave; 
    public String nombre;
    public int sueldoBase;
    public int pagoHoraExtra;

    public Categoria(String nombre, String clave, int sueldoBase, int pagoHoraExtra) 
    {
        this.nombre = nombre;
        this.clave = clave;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
    }
}