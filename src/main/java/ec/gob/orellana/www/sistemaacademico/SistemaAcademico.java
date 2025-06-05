/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.gob.orellana.www.sistemaacademico;
import ec.gob.orellana.www.sistemaacademico.clases.Persona;
import ec.gob.orellana.www.sistemaacademico.clases.PersonaInstitucional;
import ec.gob.orellana.www.sistemaacademico.clases.empleado;
import ec.gob.orellana.www.sistemaacademico.clases.estudiante;
import ec.gob.orellana.www.sistemaacademico.clases.personaInvitada;
import ec.gob.orellana.www.sistemaacademico.clases.personalServicios;
public class SistemaAcademico {

    public static void main(String[] args) {
        
        System.out.println("Datos de persona");
        Persona persona = new Persona("Ander Tribee Ayovi Medina",3,"ander.ayovi@espoch.edu.ec","2200478341");
        System.out.println("Datos"+persona.toString());
        
        System.out.println("\nDatos de la persona invitada");
        personaInvitada personaInvitada = new personaInvitada("Castillo Juan",3,"Juan@gmail.com","254864563");
        System.out.println("Datos"+personaInvitada.toString());
        
        System.out.println("\nDatos Personal Institucional");
        PersonaInstitucional PersonaInstitucional = new PersonaInstitucional("alexis@espoch.edu.ec","Alexis",5,"alexis@gmail.com","237543678");
        System.out.println("Datos "+PersonaInstitucional.toString());
        
        System.out.println("\nDatos del empleado");
        empleado empleado = new empleado(850,"Ander@espoch.edu.ec","Ander",1,"ander@gmail.com","200476589");
        System.out.println("Datos "+empleado.toString());
        
        System.out.println("\nDatos del estudiante");
        estudiante estudiante = new estudiante(2,"Pedro@espoch.edu.ec","Pedro",6,"pedro@gmail.com","758647687");
        System.out.println("Datos "+estudiante);
        
        System.out.println("Datos del personal de servicio");
        personalServicios personalServicios = new personalServicios("Espoch Sede Orellana",8,"Josue@espoch.edu.ec","Josue",8,"Josue@gmail.com","9845623567");
        System.out.println("Datos "+personalServicios);
    }
}
