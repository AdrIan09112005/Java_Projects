package Coffee_Shop;

public class VasoCafe 
{
    private String tamaño;
    private boolean azucar;
    private double precio;
    
    public VasoCafe(String tamaño, boolean azucar)
    {
        this.tamaño = tamaño;
        this.azucar = azucar;

        calcularPrecio();
    }

    private void calcularPrecio()
    {
        if (tamaño.equals("Pequeño"))
        {
            precio = azucar ? 14.50 : 10.50;
        }
        else if (tamaño.equals("Mediano"))
        {
            precio = azucar ? 24.50 : 34.50;
        }
        else if (tamaño.equals("Grande"))
        {
            precio = azucar ? 34.50 : 39.50;
        }
    }
    
    public double getPrecio()
    {
        return precio;
    }

    @Override
    public String toString()
    {
        return "Vaso de café " + tamaño + (azucar ? " con azúcar" : " sin azúcar") + ": $" + precio;
    }    
}
