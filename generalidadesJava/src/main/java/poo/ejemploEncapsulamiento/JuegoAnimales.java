package poo.ejemploEncapsulamiento;

public class JuegoAnimales {
    public static void main(String[] args) {
        Nivel nivel = new Nivel();
        nivel.imprimeRespuestas();

        System.out.println("*********** Marcador ***********");
        System.out.println("Nivel 1");
        System.out.println("Tu puntaje es: " + nivel.puntaje);
    }
}
