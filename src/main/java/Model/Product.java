package Model;

import java.util.Objects;

public class Product {

     private String talla;
     private String marca;
     private int cantidad;
     private double precio;
     private String id;
     private String desc;
     private String edadDirigida;
     private String seccion;
     private String sexo;
     private String idProveedor;
     private String vendido;

    public Product(String id, String desc, String talla, String marca, String seccion, double precio, String edadDirigida, int cantidad, String sexo, String idProveedor, String vendido) {
          this.id = id;
          this.talla = talla;
          this.marca = marca;
          this.cantidad = cantidad;
          this.desc = desc;
          this.precio = precio;
          this.seccion = seccion;
          this.edadDirigida = edadDirigida;
          this.sexo = sexo;
          this.idProveedor = idProveedor;
          this.vendido = vendido;
    }

    public String getVendido() {
     return vendido;
     }
    
     public String getSexo() {
          return sexo;
     }

     public String getTamaño() {
          return talla;
     }

     public String getMarca() {
          return marca;
     }

     public int getCantidad() {
          return cantidad;
     }

     public double getPrecio() {
          return precio;
     }

     public String getId() {
          return id;
     }

     public String getDesc() {
          return desc;
     }


     public String getEdadDirigida() {
          return edadDirigida;
     }

     public String getSeccion() {
          return seccion;
     }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product product)) {
            return false;
        }
        return getId().equals(product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getIdProveedor() {
          return idProveedor;
     }

    
}
