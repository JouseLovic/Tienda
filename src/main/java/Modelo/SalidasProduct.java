package Modelo;

public class SalidasProduct {

    private String numFactura;
    private String codigoProducto;
    private String descripcionProducto;
    private String fecha;
    private Double precio;
    private int cantidad;
    private String idCliente;

    public SalidasProduct(String numFactura, String codigoProducto, String descripcionProducto, String fecha,
        Double precio, int cantidad, String idCliente) {
        this.numFactura = numFactura;
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.fecha = fecha;
        this.precio = precio;
        this.cantidad = cantidad;
        this.idCliente = idCliente;
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

    public int getCantidad() {
        return cantidad;
    }

    public String getIdCliente() {
        return idCliente;
    }

}
