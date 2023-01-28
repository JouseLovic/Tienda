
package Model;

public class Vendor {
     
     private String id;
     private String nombre;
     private String fechaNacimiento;
     private String cedula;
     private String email;
     private String empresa;
     private String Articulos;

     public Vendor(String id, String nombre, String fechaNacimiento, String cedula, String email, String empresa, String Articulos) {
          this.id = id;
          this.nombre = nombre;
          this.fechaNacimiento = fechaNacimiento;
          this.cedula = cedula;
          this.email = email;
          this.empresa = empresa;
          this.Articulos = Articulos;
          
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

     public String getFechaNacimiento() {
          return fechaNacimiento;
     }

     public String getCedula() {
          return cedula;
     }

     public String getEmail() {
          return email;
     }

     public String getIdProveedor() {
          return id;
     }
     
     
     
     
}
