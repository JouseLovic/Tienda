package Modelo;


public abstract class Factura {

    protected String NFactura,fecha;
    protected int cantidad;
    protected double precio;

    public Factura(String NFactura, String fecha, double precio, int cantidad) {
            this.NFactura = NFactura;
            this.fecha = fecha;
            this.precio = precio;
            this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((NFactura == null) ? 0 : NFactura.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Factura other = (Factura) obj;
        if (NFactura == null) {
            if (other.NFactura != null)
                return false;
        } else if (!NFactura.equals(other.NFactura))
            return false;
        return true;
    }

    public String getNFactura() {
        return NFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
   
}