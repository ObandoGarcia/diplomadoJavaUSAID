package introduccionJava.ejercicios;

import java.util.Scanner;

public class CalcularHipotenusa {
    public static void main(String[] args) {
        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaracion de variables
        Double cateto1, cateto2, hipotenusa;

        System.out.println("Programa que calcula la hipotenusa");
        System.out.println("Ingrese el valor del cateto 1:");
        cateto1 = scanner.nextDouble();

        System.out.println("Ingrese el valor del cateto 2:");
        cateto2 = scanner.nextDouble();

        hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
}
