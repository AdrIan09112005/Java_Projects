package Coffee_Shop;

public class Shop 
{
    public static void main(String[] args)
    {
        Cafetera cafetera = new Cafetera();
        System.out.println("-----Inicia Programa-----");
        System.out.println("**********************");
        System.out.println(" ---- CAFETERIA ----");
        System.out.println("**********************");
        System.out.println("Se mostrara el proceso de servir 3 tazas de café:");
        
        for (int i = 1; i <= 3; i++)
        {
            // Vaso Grand. con Azúcar
            VasoCafe vaso = new VasoCafe("Grande", true);
            cafetera.servirVaso(vaso);
        }

        System.out.println("\nSe mostrara el proceso de servir 2 tazas de café:");
        for (int i = 1; i <= 2; i++)
        {
            // Vaso Med. sin Azúcar
            VasoCafe vaso = new VasoCafe("Mediano", false);
            cafetera.servirVaso(vaso);
        }

        System.out.println("**********************");
        cafetera.agregarCafe(200);  // 200 Gr Café
        System.out.println("**********************");
        System.out.println("\n");

        System.out.println("**********************");
        cafetera.mostrarInsumosDisponibles(); // Muestra Cantidad Insumos Disponibles
        System.out.println("**********************");

        cafetera.vaciarCafetera(); // Insumos Vaciados Cafetera
        System.out.println("**********************");
        System.out.println("\n");
        
        System.out.println("**********************");
        cafetera.mostrarInsumosDisponibles();   // Mostrar Cantidad Insumos Disponibles (Cafetera Vacia)
        System.out.println("**********************");

        System.out.println("\nReporte:");
        System.out.println("Total de tazas vendidas: " + cafetera.getTazasServidas());  // Reporte Tazas Vendidas
        System.out.println("**********************");

        System.out.println("-----Fin del Programa-----");
    }
}
