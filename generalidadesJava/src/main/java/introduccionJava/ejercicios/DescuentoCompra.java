package introduccionJava.ejercicios;

import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables
        Double compra, descuento, pagoTotal;

        //Leemos el valor de la compra realizada
        System.out.println("Ingrese el valor de la compra realizada: $");
        compra = scanner.nextDouble();

        descuento = compra * 0.4;
        pagoTotal = compra - descuento;

        System.out.println("El descuento por la compra es: $"+ descuento + " el pago total es: $"+ pagoTotal);
    }
}
