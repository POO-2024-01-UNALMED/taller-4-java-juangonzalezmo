package classroom;

public class Persona {

    long cedula; // se quita el final pa que la cedula pueda ser modificada cambio 6
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3;   cambio 7 para que la cedula no se modifique
    }

    public Persona(long cedula, String nombre) {
        this.cedula = 0;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.cedula = 1;
        totalPersonas++;
    }
    public Persona() {
        //this.nombre = ""; se crea otro constructor sin parametros 
        totalPersonas++;
    }

    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
