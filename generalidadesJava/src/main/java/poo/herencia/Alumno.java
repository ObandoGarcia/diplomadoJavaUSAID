package poo.herencia;

public class Alumno extends Persona{
    private String seccion;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, String genero, String direccion, String telefono, String seccion, String carrera) {
        super(nombre, apellido, edad, genero, direccion, telefono);
        this.seccion = seccion;
        this.carrera = carrera;
    }

    public String saludoAlumno(){
        return "Este texto viene desde alumno";
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "seccion='" + seccion + '\'' +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
