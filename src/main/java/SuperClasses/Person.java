
package SuperClasses;

import java.util.Objects;

public abstract class Person {
     
     protected String nombre;
     protected int edad;
     protected int cedula;

     public Person(String nombre, int edad, int cedula) {
          this.nombre = nombre;
          this.edad = edad;
          this.cedula = cedula;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (!(o instanceof Person)) return false;
          Person person = (Person) o;
          return cedula == person.cedula;
     }

     @Override
     public int hashCode() {
          return Objects.hash(cedula);
     }
}
