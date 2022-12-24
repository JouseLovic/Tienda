package Modelo;

public class Producto  {

     private String tamaño;
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

    public Producto(String id, String desc, String tamaño, String marca, String seccion, double precio, String edadDirigida, int cantidad, String sexo, String idProveedor, String vendido) {
          this.id = id;
          this.tamaño = tamaño;
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
          return tamaño;
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
     public int hashCode() {
          final int prime = 31;
          int result = 1;
          result = prime * result + ((id == null) ? 0 : id.hashCode());
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
          Producto other = (Producto) obj;
          if (id == null) {
               if (other.id != null)
                    return false;
          } else if (!id.equals(other.id))
               return false;
          return true;
     }

     public String getIdProveedor() {
          return idProveedor;
     }

    
}
