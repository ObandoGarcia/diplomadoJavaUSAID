package controlDeFlujo;

import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;
        double promedio;

        for(int i = 1; i <= 10; i++){
            System.out.println("Escriba el numero [" + i + "]");
            numero = scanner.nextInt();
            suma += numero;
        }

        promedio = suma / 10;
        System.out.println("El promedio es: " + promedio);
    }
}
