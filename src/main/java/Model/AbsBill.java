package Model;


public abstract class AbsBill {

    protected String NFactura,fecha;
    protected int cantidad;
    protected double precio;

    public AbsBill(String NFactura, String fecha, double precio, int cantidad) {
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
        AbsBill other = (AbsBill) obj;
        if (NFactura == null) {
            if (other.NFactura != null)
                return false;
        } else return NFactura.equals(other.NFactura);
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