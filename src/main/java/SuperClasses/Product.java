package SuperClasses;

import java.util.*;
import java.io.*;

public abstract class Product  {

      protected String tamaño;
      protected String marca;
      protected int cantidad;
      protected double precio;
      protected String id;
      protected String desc;
      protected String edadDirigida;
      protected String tipo;
      protected String sexo;

     public Product(String id, String desc, String tamaño, String marca, String tipo, double precio, String edadDirigida, int cantidad, String sexo) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product product = (Product) obj;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
