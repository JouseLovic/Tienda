
package Modelo;

import SuperClasses.Person;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Proveedores extends Person {
     
     private String empresa;
     private String Articulos;//Los que le trae a la empresa de nosotros
     private List<Proveedores> listaProveedores = new LinkedList<>();
     
     public Proveedores(String nombre, int edad, int cedula, String empresa, String ArticulosQueVende) {
          super(nombre, edad, cedula);
          this.empresa = empresa;
          this.Articulos = ArticulosQueVende;
     }

     @Override
     public int hashCode() {
          int hash = 5;
          hash = 73 * hash + Objects.hashCode(this.empresa);
          return hash;
     }

     @Override
     public boolean equals(Object obj) {
          if (this == obj) {
               return true;
          }
          if (obj == null) {
               return false;
          }
          if (getClass() != obj.getClass()) {
               return false;
          }
          final Proveedores other = (Proveedores) obj;
          return Objects.equals(this.empresa, other.empresa);
     }
     
     public void dameProveedores(List<Proveedores> proveedor) {
          this.listaProveedores = proveedor;
          
          try { 
               ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream(new File("src\\Files\\ListaDeProveedores.dat")));
               objOut.writeObject(listaProveedores);
          }catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Ha ocurrido un error de tipo: "+ex.getMessage().getClass());
          }
     }

     public List<Proveedores> obtenProveedores(){
          return listaProveedores;
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
