package introduccionJava;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        //Instacia de Scanner
        Scanner scanner = new Scanner(System.in);
        int numero;

        //Entrada de datos
        System.out.println("Escriba un numero entero: ");
        numero = scanner.nextInt();

        if(numero%2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

    }
}
