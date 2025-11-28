package ejercicio4;
import java.io.IO;
public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int añoNacimiento;
    protected String rol = "Visitante";
    
    public Persona(){
        
    }
    public Persona (String nombre, String apellidos, int añoNacimiento){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.añoNacimiento=añoNacimiento;
    }
    
    public void interactuarConSIAL() {
        IO.println("[" + rol + "]: Acceso denegado. Solo puede consultar la página principal.");
    }
    
    public void imprime(){
        IO.println("Datos Personales: "+ nombre+
                " "+apellidos+" ("
                +añoNacimiento+ ")");
        IO.println("Rol en la Universidad: " + rol);
    }    
}