package introduccionJava.ejercicios;

import java.util.Scanner;

public class CalcularCompra {
    public static void main(String[] args) {
        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables
        Double compra, descuento, pagoTotal;

        //Leemos el valor de la compra realizada
        System.out.println("Ingrese el valor de la compra realizada: $");
        compra = scanner.nextDouble();

        if(compra < 100){
            System.out.println("Su compra no tiene descuento");
            System.out.println("Debera pagar: $"+ compra);
        } else if (compra > 100 && compra < 300) {
            descuento = compra * 0.1;
            pagoTotal = compra - descuento;

            System.out.println("El descuento por la compra es: $"+ descuento + " el pago total es: $"+ pagoTotal);
        } else if (compra > 300) {
            descuento = compra * 0.15;
            pagoTotal = compra - descuento;

            System.out.println("El descuento por la compra es: $"+ descuento + " el pago total es: $"+ pagoTotal);
        }
    }
}
