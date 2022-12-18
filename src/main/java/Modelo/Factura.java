package Modelo;

import java.util.Objects;

public class Factura {

    private String NFactura,fecha, hora;
    private String codigoProducto, Descripcion;
    int cantidad;

    public Factura(String NFactura, String fecha, String hora, String codigoProducto, String Descripcion, int cantidad) {
            this.NFactura = NFactura;
            this.fecha = fecha;
            this.hora = hora;
            this.codigoProducto = codigoProducto;
            this.Descripcion = Descripcion;
            this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factura)) return false;
        Factura factura = (Factura) o;
        return NFactura.equals(factura.NFactura) && codigoProducto.equals(factura.codigoProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NFactura, codigoProducto);
    }

    public String getNFactura() {
        return NFactura;
    }

    public void setNFactura(String NFactura) {
        this.NFactura = NFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}


