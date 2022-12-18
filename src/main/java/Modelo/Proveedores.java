
package Modelo;

import java.util.*;
import javax.swing.JOptionPane;

public class Proveedores {
     
     private String nombre;
     private int edad;
     private int cedula;
     private String empresa;
     private String Articulos;
     
     public Proveedores(String nombre, int edad, int cedula, String empresa, String ArticulosQueVende) {
          this.nombre = nombre;
          this.edad = edad;
          this.cedula = cedula;
          this.empresa = empresa;
          this.Articulos = ArticulosQueVende;
     }

     public String getEmpresa() {
          return empresa;
     }

     public String getArticulos() {
          return Articulos;
     }

     public String getNombre() {
          return nombre;
     }

     public int getEdad() {
          return edad;
     }

     public int getCedula() {
          return cedula;
     }
     
     
     
     
}
