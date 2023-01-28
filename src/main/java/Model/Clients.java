
package Model;

public class Clients {

    private String nombre;
    private String fechaNacimiento;
    private String cedula;
    
    public Clients(String nombre, String fechaNacimiento, String cedula) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
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

    
    
}
