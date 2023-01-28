package Model;

public class EntriesBill extends AbsBill {

    private String descProducto;
    private String idProveedor;

    public EntriesBill(String NFactura, String fecha, double precio, int cantidad, String descProducto, String idProveedor) {
        super(NFactura, fecha, precio, cantidad);
        this.descProducto = descProducto;
        this.idProveedor = idProveedor;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public String getIdProveedor() {
        return idProveedor;
    }


}
