package Modelo;

public class Producto  {

     private String tamaño;
     private String marca;
     private int cantidad;
     private double precio;
     private String id;
     private String desc;
     private String edadDirigida;
     private String tipo;
     private String sexo;

    public Producto(String id, String desc, String tamaño, String marca, String tipo, double precio, String edadDirigida, int cantidad, String sexo) {
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

     public String getId() {
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


    
    
}
