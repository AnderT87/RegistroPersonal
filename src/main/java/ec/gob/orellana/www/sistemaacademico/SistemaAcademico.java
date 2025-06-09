/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.gob.orellana.www.sistemaacademico;
import ec.gob.orellana.www.sistemaacademico.clases.Decanos;
import ec.gob.orellana.www.sistemaacademico.clases.Persona;
import ec.gob.orellana.www.sistemaacademico.clases.PersonaInstitucional;
import ec.gob.orellana.www.sistemaacademico.clases.Empleado;
import ec.gob.orellana.www.sistemaacademico.clases.Estudiante;
import ec.gob.orellana.www.sistemaacademico.clases.PersonaInvitada;
import ec.gob.orellana.www.sistemaacademico.clases.PersonalServicios;
public class SistemaAcademico {

    public static void main(String[] args) {
        
    
        
        System.out.println("\nDatos de la persona invitada");
        PersonaInvitada personaInvitada = new PersonaInvitada("Castillo Juan",3,"Juan@gmail.com","254864563");
        System.out.println("Datos"+personaInvitada.toString());
        
    
        System.out.println("\nDatos del estudiante");
        Estudiante estudiante = new Estudiante(2,"Pedro@espoch.edu.ec","Pedro",6,"pedro@gmail.com","758647687");
        System.out.println("Datos "+estudiante.toString());
        
        System.out.println("\nDatos del personal de servicio");
        PersonalServicios personalServicios = new PersonalServicios("Espoch Sede Orellana",8,"Josue@espoch.edu.ec","Josue",8,"Josue@gmail.com","9845623567");
        System.out.println("Datos "+personalServicios.toString());
        
        System.out.println("\n Datos del Decano");
        Decanos decanos = new Decanos ("01", 3000, "xaviertoala@espoch.edu.ec", "Xavier", 10, "xaviertoala10@gmail", "225002588");
        System.out.println("Datos: "+decanos.toString());
    }
}
