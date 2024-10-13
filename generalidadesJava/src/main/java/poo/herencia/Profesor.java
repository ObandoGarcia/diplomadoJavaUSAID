package poo.herencia;

public class Profesor extends Persona {
    private double sueldo;
    private String dui;
    private String nit;
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int edad, String genero, String direccion, String telefono, double sueldo, String dui, String nit, String especialidad) {
        super(nombre, apellido, edad, genero, direccion, telefono);
        this.sueldo = sueldo;
        this.dui = dui;
        this.nit = nit;
        this.especialidad = especialidad;
    }

    public String saludoProfesor(){
        return "Este saludo viene desde la clase Profesor";
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "sueldo=" + sueldo +
                ", dui='" + dui + '\'' +
                ", nit='" + nit + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
