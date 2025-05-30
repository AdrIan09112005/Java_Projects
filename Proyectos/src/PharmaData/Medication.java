package PharmaData;

class Medicamento
{
    /**
     * @param args the command line arguments
     */
    
        public String nombreQuimico; 
        public String nombreGenerico;
        public String nombreRegistrado; 
        public float precioPublico; 
        public float precioVenta;
        public int formaFarmaceutica;
        public String tipoPresentacion; 
        
        /*
        formaFarmaceutica
        Si selecciona 1 entonces la forma es sólida
        Si selecciona 2 entonces la forma es semisólida
        Si selecciona 3 entonces la forma es liquida
        */
        
        
    /*Constructor*/
    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, float precioPublico,
                       float precioVenta, int formaFarmaceutica, String tipoPresentacion)
    {
        this.nombreQuimico = nombreQuimico;
        this .nombreGenerico = nombreGenerico;
        this.nombreRegistrado = nombreRegistrado; 
        this.precioPublico = precioPublico; 
        this.precioVenta = precioVenta;
        this.formaFarmaceutica = formaFarmaceutica;
        this.tipoPresentacion = tipoPresentacion; 
        
        calcularPrecioVenta();
    }

    public String getNombreQuimico() {
        return nombreQuimico;
    }
    
    public String getTipoPresentacion(String tipoPresentacion) {
        return tipoPresentacion;
    }
    
    public void setTipoPresentacion(String tipoPresentacion) {
        this.tipoPresentacion = tipoPresentacion; 
    }

    public void setNombreQuimico(String nombreQuimico) {
        this.nombreQuimico = nombreQuimico;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public String getNombreRegistrado() {
        return nombreRegistrado;
    }

    public void setNombreRegistrado(String nombreRegistrado) {
        this.nombreRegistrado = nombreRegistrado;
    }

    public float getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(float precioPublico) {
        this.precioPublico = precioPublico;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(int formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }
    
    private void calcularPrecioVenta()
    {
        switch(tipoPresentacion)
        {
            case "Solido":
                precioVenta = precioPublico * 1.09f;
                break;
                
            case "Semisolido":
                precioVenta = precioPublico * 1.12f;
                break;
                
            case "Liquido":
                precioVenta = precioPublico * 1.13f;
                break;
                
            default:
                System.out.println("El tipo de presentacion no es válido.");
        
        }
    }
    
    @Override
    public String toString() 
    {
        return "--- Medicamentos ---\n" +
            "Nombre Químico     : " + nombreQuimico + "\n" +
            "Nombre Genérico    : " + nombreGenerico + "\n" +
            "Nombre Registrado  : " + nombreRegistrado + "\n" +
            "Precio Público     : $" + precioPublico + "\n" +
            "Precio de Venta    : $" + precioVenta + "\n" +
            "Tipo Presentación  : " + tipoPresentacion + "\n" +
            "-------------------------------\n";
    }

}



