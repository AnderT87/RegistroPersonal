
package ec.gob.orellana.www.sistemaacademico.clases;


public class Profesores extends PersonalAcademico{
    private Escalafon escalafon; 

    public Profesores(Escalafon escalafon, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.escalafon = escalafon;
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }
    public Escalafon getEscalafon() {
        return escalafon;
    }
    
    public String agregarProfesor (){
        return "";
    }
    public boolean verificarCedula (){
        return true; 
    }

    @Override
    public String toString() {
        return "Profesores{" + "escalafon=" + escalafon + '}';
    }
    
}
