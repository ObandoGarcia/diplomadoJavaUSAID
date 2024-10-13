package poo.encapsulamiento;

public class EjemploEncapsulamiento {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jose");
        persona.setApellido("Obando");
        persona.setEdad(26);
        persona.setGenero("Masculino");
        persona.setPeso(70);
        persona.setTalla(1.70);

        System.out.println(persona.getNombre() + persona.getApellido());
    }
}
