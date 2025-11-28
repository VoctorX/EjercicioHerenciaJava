package ejercicio4;
import java.io.IO;

public class Prueba {
    public static void main(String[] args) {
        Alumno unAlumno = new Alumno ("Victor", "Cordoba Larez", 2007);
        
        unAlumno.ponGrupo("Ingenieria Informatica", 'M');
        
        Profesor miProfesor = new Profesor(
                "Jonathan", "Berthel Castro", 1998, 2021, "Programacion Oriendatada a Objetos");
        
        Bedel elBedel = new Bedel("Pedro", "Ramirez Soto", 
                1975, 2022, "Industrial 205");
        
        IO.println("--- SIAL (Alumno) ---");
        unAlumno.imprime();
        unAlumno.imprimeGrupo();
        unAlumno.interactuarConSIAL();
        
        IO.println("\n\n--- SIAL (Profesor) ---");
        miProfesor.imprime();
        miProfesor.interactuarConSIAL();
        
        IO.println("\n\n--- SIAL (Bedel) ---");
        elBedel.imprime();
        elBedel.interactuarConSIAL();
    }
}