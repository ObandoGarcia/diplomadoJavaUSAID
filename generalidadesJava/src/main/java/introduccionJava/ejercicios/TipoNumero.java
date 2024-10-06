package introduccionJava.ejercicios;

import java.util.Scanner;

public class TipoNumero {
    public static void main(String[] args) {
        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaracion de variales
        Double numero;

        System.out.println("Programa que dice si un numero es negativo, neutro o positivo");
        System.out.println("Ingrese un numero: ");
        numero = scanner.nextDouble();

        if(numero < 0){
            System.out.println("El numero ingresado es negativo!");
        } else if (numero == 0) {
            System.out.println("El numero ingresado es neutro!");
        } else if (numero > 0) {
            System.out.println("El numero ingresado es positivo!");
        }else{
            System.out.println("El valor ingresado no es un numero!");
        }
    }
}
