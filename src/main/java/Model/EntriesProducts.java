package Model;

public class EntriesProducts {

    String numFactura;
    String codigoProducto;
    String descripcionProducto;
    String fecha;
    Double precio;
    int cantidad;
    String seccion;
    String marca;
    String idProveedor;
    
    public EntriesProducts(String numFactura, String codigoProducto, String descripcionProducto, String fecha,
                           Double precio, int cantidad, String seccion, String marca, String idProveedor) {
         this.numFactura = numFactura;
         this.codigoProducto = codigoProducto;
         this.descripcionProducto = descripcionProducto;
         this.fecha = fecha;
         this.precio = precio;
         this.seccion = seccion;
         this.marca = marca;
         this.cantidad = cantidad;
         this.idProveedor = idProveedor;
    }

    public String getNumFactura() {
        return numFactura;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public String getFecha() {
        return fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getSeccion() {
        return seccion;
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getIdProveedor() {
        return idProveedor;
    }


    
}
