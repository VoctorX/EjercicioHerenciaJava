package ejercicio4;
import java.io.IO;
public class Alumno extends Persona{
    protected String grupo;
    protected char horario;
    
    public Alumno(){
        this.rol = "Alumno";
    }
    
    public Alumno(String nombre, String apellidos, int añoNacimiento){
        super(nombre,apellidos,añoNacimiento);
        this.rol = "Alumno";
    }
    
    public void interactuarConSIAL() {
        IO.println("[" + nombre + ", " + rol + "]: Accediendo al SIAL...");
        IO.println("-> Funciones permitidas: Ver calificaciones, Cancelar materia, Pagar matricula.");
    }

    public void ponGrupo(String grupo, char horario){
        if (grupo==null || grupo.length()==0){
            IO.println("Grupo no valido");
            return; 
        } 
        if (horario != 'M'){
            IO.println("Horario no valido");
            return;
        }
        this.grupo=grupo;
        this.horario=horario;
    }
    public void imprimeGrupo(){
        IO.println("Grupo "+grupo+" - "+ horario);
    }
}