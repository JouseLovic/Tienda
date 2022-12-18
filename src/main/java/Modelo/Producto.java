package Modelo;

import SuperClasses.Product;

public class Producto extends Product {


    public Producto(String id, String desc, String tamaño, String marca, String tipo, double precio, String edadDirigida, int cantidad, String sexo) {
        super(id, desc, tamaño, marca, tipo, precio, edadDirigida, cantidad, sexo);
    }

     public String getSexo() {
          return sexo;
     }

     public void setSexo(String sexo) {
          this.sexo = sexo;
     }

    
     public String getTamaño() {
          return tamaño;
     }

     public void setTamaño(String tamaño) {
          this.tamaño = tamaño;
     }

     public String getMarca() {
          return marca;
     }

     public void setMarca(String marca) {
          this.marca = marca;
     }

     public int getCantidad() {
          return cantidad;
     }

     public void setCantidad(int cantidad) {
          this.cantidad = cantidad;
     }

     public double getPrecio() {
          return precio;
     }

     public void setPrecio(double precio) {
          this.precio = precio;
     }

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public String getDesc() {
          return desc;
     }

     public void setDesc(String desc) {
          this.desc = desc;
     }

     public String getEdadDirigida() {
          return edadDirigida;
     }

     public void setEdadDirigida(String edadDirigida) {
          this.edadDirigida = edadDirigida;
     }

     public String getTipo() {
          return tipo;
     }

     public void setTipo(String tipo) {
          this.tipo = tipo;
     }
   
    
    
}
