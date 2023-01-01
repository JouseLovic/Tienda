
package Modelo;

public class Clientes {

    private String nombre;
    private String fechaNacimiento;
    private String cedula;
    
    public Clientes(String nombre, String fechaNacimiento, String cedula) {
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
