package introduccionJava;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        //Instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaracion de variables
        Double numero1, numero2, suma;

        //Captura de datos
        System.out.println("Escriba el primer numero: ");
        numero1 = scanner.nextDouble();

        System.out.println("Escriba el segundo numero: ");
        numero2 = scanner.nextDouble();

        //Operaciones
        suma =  numero1 + numero2;

        //Mostrar el resultado
        System.out.println(" ");
        System.out.println("La suma de los numeros es: " + suma);
    }
}
