package introduccionJava.ejercicios;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaracion de variables
        Double numero1, numero2, numero3;

        System.out.println("Ingrese el numero 1:");
        numero1 = scanner.nextDouble();

        System.out.println("Ingrese el numero 2:");
        numero2 = scanner.nextDouble();

        System.out.println("Ingrese el numero 3:");
        numero3 = scanner.nextDouble();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El numero: " + numero1 + "es mayor!");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero: " + numero2 + "es mayor!");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El numero: " + numero3 + "es mayor!");
        }
    }
}
