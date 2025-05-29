package Nomina;

/**
 *
 * @author alans
 */

public class Nomina_Empleados 
{
    static void add(Nomina_Empleados nomina_empleados)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public String nombre;
    public Categoria categoria;
    public int horasTrabajadas;
    public int horasExtra;

    public Nomina_Empleados(String nombre, Categoria categoria, int horasTrabajadas, int horasExtra)
    {
        this.nombre = nombre;
        this.categoria = categoria;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int calcularSueldoNormal() {
        return horasTrabajadas * categoria.sueldoBase;
    }

    public int calcularSueldoExtra() {
        return horasExtra * categoria.pagoHoraExtra;
    }

    public int calcularSueldoTotal() {
        return calcularSueldoNormal() + calcularSueldoExtra();
    }

    public int obtenerHorasLaboradas() {
        return horasTrabajadas + horasExtra;
    }

    void mostrarDetalles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
