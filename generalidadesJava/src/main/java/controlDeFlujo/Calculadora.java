package controlDeFlujo;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double numero1, numero2, resultado = 0.0;
        boolean error = false;
        char operacion;

        System.out.println("Ingrese el primer numero:");
        numero1 = scanner.nextDouble();

        System.out.println("Ingrese el siguiente numero:");
        numero2 = scanner.nextDouble();

        System.out.println("Ingrese el signo de la operacion:");
        operacion = scanner.next().charAt(0);

        switch (operacion){
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            default:
                error = true;
                System.out.println("Error: operacion invalida!");
        }

        if(!error){
            System.out.println("El resultado de la operacion es: " + resultado);
        }
    }
}
