package Modelo;

public class Producto  {

     private String tamaño;
     private String marca;
     private int cantidad;
     private double precio;
     private int id;
     private String desc;
     private String edadDirigida;
     private String tipo;
     private String sexo;

    public Producto(int id, String desc, String tamaño, String marca, String tipo, double precio, String edadDirigida, int cantidad, String sexo) {
          this.id = id;
          this.tamaño = tamaño;
          this.marca = marca;
          this.cantidad = cantidad;
          this.desc = desc;
          this.precio = precio;
          this.tipo = tipo;
          this.edadDirigida = edadDirigida;
          this.sexo = sexo;
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

     public int getId() {
          return id;
     }

     public String getDesc() {
          return desc;
     }


     public String getEdadDirigida() {
          return edadDirigida;
     }

     public String getTipo() {
          return tipo;
     }

     @Override
     public int hashCode() {
          final int prime = 31;
          int result = 1;
          result = prime * result + ((tamaño == null) ? 0 : tamaño.hashCode());
          result = prime * result + id;
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
          if (tamaño == null) {
               if (other.tamaño != null)
                    return false;
          } else if (!tamaño.equals(other.tamaño))
               return false;
          if (id != other.id)
               return false;
          return true;
     }

     

    
    
}
