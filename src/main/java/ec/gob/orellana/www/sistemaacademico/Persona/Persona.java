
package ec.gob.orellana.www.sistemaacademico.Persona;

public abstract class Persona {
 private String nombre;
 private int id;
 private String correo;
 private String cedula;

 //Constructor

    public Persona(String nombre, int id, String correo, String cedula) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.cedula = cedula;
    }
 
// Getters and Setters

    abstract boolean verificarCedula (); 

    //Metodo

    @Override
    public String toString() {
        return "Persona {" + "nombre=" + nombre + ", id=" + id + ", correo=" + correo + ", cedula=" + cedula + '}';
    }
    

}
