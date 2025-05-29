package Nomina;

/**
 *
 * @author alans
 */

public class Ventas extends Nomina_Empleados
{
    public Ventas(String nombre, int horasTrabajadas, int horasExtra)
    {
        super(nombre, new Categoria("Empleado Ventas", "EV", 100, 50), horasTrabajadas, horasExtra);
    }
}
