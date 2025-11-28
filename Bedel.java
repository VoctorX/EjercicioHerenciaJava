package ejercicio4;

import java.io.IO;

public class Bedel extends Empleado {
    protected String areaSupervisada;

    public Bedel() {
        super();
        this.rol = "Bedel";
    }
    
    public Bedel(String nombre, String apellidos, int añoNacimiento, int añoIngreso, String area) {
        super(nombre, apellidos, añoNacimiento, añoIngreso);
        this.areaSupervisada = area;
        this.rol = "Bedel";
    }
    
    public void interactuarConSIAL() {
        IO.println("[" + nombre + ", " + rol + "]: Accediendo al SIAL...");
        IO.println("-> Funciones permitidas: Gestionar accesos al salon '" + areaSupervisada + "', Registrar inventario.");
    }
    
    public void imprime() {
        super.imprime();
        IO.println("Area Supervisada: " + areaSupervisada);
    }
}