package Modelo;

public class FacturaSalida extends Factura{

    private String cedulaCliente;
    private String idProductos;

    public FacturaSalida(String NFactura, String fecha, double precio, int cantidad, String idProductos, String cedulaCliente) {
        super(NFactura, fecha, precio, cantidad);
        this.cedulaCliente = cedulaCliente;
        this.idProductos = idProductos;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public String getIdProductos() {
        return idProductos;
    }

}
