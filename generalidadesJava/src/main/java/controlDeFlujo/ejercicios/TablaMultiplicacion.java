package controlDeFlujo.ejercicios;

import java.util.Scanner;

public class TablaMultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese numero de la tabla de multilplicar para mostrar:");
        numero = scanner.nextInt();

        System.out.println("Tabla de multiplicar del numero: " + numero);

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
