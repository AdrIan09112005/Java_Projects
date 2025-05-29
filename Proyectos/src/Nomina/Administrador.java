package Nomina;

/**
 *
 * @author alans
 */

public class Administrador extends Nomina_Empleados
{
    public Administrador(String nombre, int horasTrabajadas, int horasExtra)
    {
        super(nombre, new Categoria("Administrador", "ADM", 180, 100), horasTrabajadas, horasExtra);
    }
}
