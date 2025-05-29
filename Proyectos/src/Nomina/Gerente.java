package Nomina;

/**
 *
 * @author alans
 */

public class Gerente extends Nomina_Empleados
{
    public Gerente(String nombre, int horasTrabajadas, int horasExtra)
    {
        super(nombre, new Categoria("Gerente", "GER", 250, 150), horasTrabajadas, horasExtra);
    }
}