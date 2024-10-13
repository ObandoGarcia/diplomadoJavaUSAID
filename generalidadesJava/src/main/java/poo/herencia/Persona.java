package poo.herencia;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String genero;
    protected String direccion;
    protected String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String genero, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String Saludo(){
        return "Texto desde la clase persona";
    }
}

