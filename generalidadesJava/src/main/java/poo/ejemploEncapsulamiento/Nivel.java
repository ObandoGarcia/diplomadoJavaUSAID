package poo.ejemploEncapsulamiento;

import java.util.Scanner;

public class Nivel {
    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner entrada;

    public Nivel(){
        puntaje = 0;
        entrada = new Scanner(System.in);
        animales = new String[2];
        animales[0] = "perro";
        animales[1] = "gato";
    }

    private void puntajePerro(){
        if(respuesta.equals(animales[0])){
            System.out.println("Correcto, haz ganado 10 puntos");
            puntaje+=10;
        }else{
            System.out.println("Incorrecto! La respuesta es: " + animales[0]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;
        }
    }

    private void puntajeGato(){
        if(respuesta.equals(animales[1])){
            System.out.println("Correcto, haz ganado 10 puntos");
            puntaje+=10;
        }else{
            System.out.println("Incorrecto! La respuesta es: " + animales[1]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;
        }
    }

    public void imprimeRespuestas(){
        System.out.println("Es un animal que ladra y come croquetas?");
        respuesta = entrada.next();
        puntajePerro();

        System.out.println("Es un animal que maulla y toma leche?");
        respuesta = entrada.next();
        puntajeGato();
    }
}
