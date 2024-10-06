package introduccionJava.ejercicios;

import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        //Instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables a usar
        Double area, radio;

        System.out.println("Programa para calcular el area de una circunferencia");
        System.out.println("Ingrese el valor del radio de la circunferencia: ");
        radio = scanner.nextDouble();

        //Calculamos el area
        area = Math.PI * (Math.pow(radio, 2));

        System.out.println("Resultado: ");
        System.out.println("El area de la circunferencia es: " + area);

    }
}
