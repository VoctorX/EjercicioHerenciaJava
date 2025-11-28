package ejercicio4;
import java.io.IO;
import java.util.Calendar;

public class Empleado extends Persona {
    protected int añoIngreso;

    public Empleado() {
        super();
        this.rol = "Empleado General";
    }
    
    public Empleado(String nombre, String apellidos, int añoNacimiento, int añoIngreso) {
        super(nombre, apellidos, añoNacimiento);
        this.añoIngreso = añoIngreso;
        this.rol = "Empleado General";
    }
    
    public int calcularAntiguedad() {
        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
        return añoActual - this.añoIngreso;
    }

    public void interactuarConSIAL() {
        IO.println("[" + nombre + ", " + rol + "]: Accediendo al SIAL...");
        IO.println("> Funciones permitidas: Marcar asistencia, Solicitar vacaciones, Ver nómina.");
    }

    public void imprime() {
        super.imprime();
        IO.println("Año de Ingreso: " + añoIngreso);
        IO.println("Antiguedad: " + calcularAntiguedad() + " años");
    }
}