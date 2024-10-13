package controlDeFlujo.ejercicios;

import java.util.Scanner;

public class SumaRepetitiva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Variable para controlar el bucle
        boolean detener = false;

        //Respuesta por parte del usuario
        String respuesta = "";

        int numero1, numero2, suma;

        System.out.println("Programa que suma dos numeros continuamente");

        while(!detener){
            System.out.println("Ingrese el primer numero a sumar:");
            numero1 = scanner.nextInt();

            System.out.println("Ingrese el segundo numero a sumar:");
            numero2 = scanner.nextInt();

            suma = numero1 + numero2;
            System.out.println("La suma de los numeros es: " + suma);

            System.out.println("Deseas detener el programa? si - no");
            respuesta = scanner.next();

            //Verificar la respuesta del usuario
            if(respuesta.equalsIgnoreCase("si")){
                detener = true;
            }else if(respuesta.equalsIgnoreCase("no")){
                detener =false;
            }
        }
    }
}
