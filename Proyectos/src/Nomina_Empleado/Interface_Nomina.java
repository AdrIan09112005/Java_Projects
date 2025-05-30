package Nomina_Empleado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; 

/**
 *
 * @author alans
 */

public class Interface_Nomina 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        System.out.println("******Bienvenido al Reporte de Nomida******");
        System.out.print("\nA continuación, ingrese la cantidad de empelados: ");
        int numEmpleados = Integer.parseInt(br.readLine());
        
        ArrayList<Nomina_Empleados> empleados = new ArrayList<>();
               
            for (int i = 0; i < numEmpleados; i++) 
            {
                System.out.println("\n----Gereneración de Datos del Empleado" + (i + 1) + "----");
                System.out.println("A continuación, deberas ingresar todos los datos de los Empleados");
                System.out.print("\nIngrese el nombre completo del Empleado: ");
                String nombre = br.readLine();
                
                System.out.print("\nIngrese el puesto de trabajo del Empleado(Gerente/Administrador/Ventas): ");
                String categoria = br.readLine();
                
                System.out.print("\nIngrese el total de horas trabajadas: ");
                int horasTrabajadas = Integer.parseInt(br.readLine());
                
                System.out.print("\nIngrese el total de horas extras que trabajo el empleado : ");
                int horasExtra = Integer.parseInt(br.readLine());
                

            Nomina_Empleados nomina_empleados;
            switch (categoria.toLowerCase()) 
            {
                case "gerente":
                    nomina_empleados = new Gerente(nombre, horasTrabajadas, horasExtra);
                    break;

                case "administrador":
                    nomina_empleados = new Administrador(nombre, horasTrabajadas, horasExtra);
                    break;

                case "ventas":
                    nomina_empleados = new Ventas(nombre, horasTrabajadas, horasExtra);
                    break;
                
                    default:
                    System.out.println("Categoría no válida. Se asignará por defecto la categoría 'Ventas'.");
                    nomina_empleados = new Ventas(nombre, horasTrabajadas, horasExtra);
                    break;
            }

            empleados.add(nomina_empleados);
        }
        
        calcularNominas(empleados);
    }

    public static void calcularNominas(ArrayList<Nomina_Empleados> empleados)
    {
        int pagoTotalNomina = 0;
        int pagoTotalHorasTrabajadas = 0;
        int pagoTotalHorasExtras = 0;
        int totalHorasLaboradas = 0;
        int totalConHorasExtras = 0;
        int totalSinHorasExtras = 0;

        for (Nomina_Empleados empleado : empleados) 
        {
            int sueldoNormal = (int) empleado.calcularSueldoNormal();
            int sueldoExtra = (int) empleado.calcularSueldoExtra();

            pagoTotalHorasTrabajadas += sueldoNormal;
            pagoTotalHorasExtras += sueldoExtra;
            totalHorasLaboradas += empleado.obtenerHorasLaboradas();
            pagoTotalNomina += empleado.calcularSueldoTotal();

            if (empleado.horasExtra > 0)
            {
                totalConHorasExtras++;
            } 
            else 
            {
                totalSinHorasExtras++;
            }
        }
        
        System.out.println("\n**** REPORTE DE NÓMINA ****");

        System.out.println("\nPago total nómina: $" + pagoTotalNomina);
        System.out.println("Pago total horas trabajadas: $" + pagoTotalHorasTrabajadas);
        System.out.println("Pago total horas extras: $" + pagoTotalHorasExtras);
        System.out.println("Total de horas laboradas: " + totalHorasLaboradas + " horas");
        System.out.println("Total de empleados con horas extras: " + totalConHorasExtras);
        System.out.println("Total de empleados sin horas extras: " + totalSinHorasExtras);

        System.out.println("\n**** PROGRAMA FINALIZADO / GRACIAS ****");
    }
}
