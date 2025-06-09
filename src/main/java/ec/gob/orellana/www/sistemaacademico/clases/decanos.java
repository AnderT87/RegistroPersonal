/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.clases;

public class Decanos extends PersonalAcademico {
    private String nivelJerarquico; 

    public Decanos(String nivelJerarquico, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.nivelJerarquico = nivelJerarquico;
    }

    

    public String getNivelJerarquico() {
        return nivelJerarquico;
    }

    public void setNivelJerarquico(String nivelJerarquico) {
        this.nivelJerarquico = nivelJerarquico;
    }
 
    public boolean verificarCedula (){
        return true; 
    }

    @Override
    public String toString() {
        return "Decanos{" + "nivelJerarquico=" + nivelJerarquico + '}';
    }
    
    
}
