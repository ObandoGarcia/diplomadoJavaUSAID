package controlDeFlujo.ejercicios;

import java.util.Scanner;

public class NumerosParesDesdeCero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;
        int i = 0;

        System.out.println("Programa que muestra los numeros pares desde el numero 0 hasta el numero ingresado");
        System.out.println("Ingrese el numero: ");
        numero = scanner.nextInt();

        while(i <= numero){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
