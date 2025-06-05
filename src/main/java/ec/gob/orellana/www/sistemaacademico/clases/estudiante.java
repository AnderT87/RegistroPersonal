/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.clases;


public class estudiante extends PersonaInstitucional{
    //Atributos
    private int codigo;

    public estudiante(int codigo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.codigo = codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String agregarEmpleado(){
        return "";
    }

    @Override
    public String toString() {
        return "estudiante{" + "codigo=" + codigo + super.toString()+ '}';
    }
    
    
    
}
