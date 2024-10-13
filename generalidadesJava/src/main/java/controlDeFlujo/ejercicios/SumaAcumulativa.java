package controlDeFlujo.ejercicios;

import java.util.Scanner;

public class SumaAcumulativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, numero, suma = 0;

        while(true){
            System.out.println("Ingrese un numero para sumar:");
            numero = scanner.nextInt();
            suma = suma+=numero;

            System.out.println("Desea terminar el suma? si - no");
            String respuesta = scanner.next();

            if(respuesta.equalsIgnoreCase("si")){
                System.out.println("La suma acumulada de los numeros es: " + suma);
                break;
            }
        }

    }
}
