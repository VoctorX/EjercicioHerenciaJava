package ejercicio4;

import java.io.IO;

public class Profesor extends Empleado {
    protected String asignatura;

    public Profesor() {
        super();
        this.rol = "Profesor";
    }
    
    public Profesor(String nombre, String apellidos, int añoNacimiento, int añoIngreso, String asignatura) {
        super(nombre, apellidos, añoNacimiento, añoIngreso);
        this.asignatura = asignatura;
        this.rol = "Profesor";
    }
    
    public void interactuarConSIAL() {
        IO.println("[" + nombre + ", " + rol + "]: Accediendo al SIAL...");
        IO.println("-> Funciones permitidas: Subir calificaciones, Modificar datos del curso de " + asignatura + ".");
    }
    
    public void imprime() {
        super.imprime();
        IO.println("Asignatura: " + asignatura);
    }
}