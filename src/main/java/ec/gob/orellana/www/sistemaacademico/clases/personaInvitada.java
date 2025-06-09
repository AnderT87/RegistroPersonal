/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.clases;

public class PersonaInvitada extends Persona {
    
    //Constructor
    public PersonaInvitada(String nombre, int id, String correo, String cedula){
        super(nombre, id, correo, cedula);
    }

    //Metodos
    public String agregarpersonaInvitada() {
        return "";
    }
    
    public boolean verificarCedula (){
        return true; 
    }
    
    @Override
    public String toString() {
        return "Persona Invitada {" + super.toString()+ '}';
    }
    
}
