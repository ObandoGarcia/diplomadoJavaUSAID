package controlDeFlujo.ejercicios;

import java.util.Scanner;

public class DescuentoEtiquetaCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double compra, descuento, pagoTotal;
        String etiqueta = "";

        System.out.println("Ingrese el valor de la compra: ");
        compra = scanner.nextDouble();

        System.out.println("Ingrese el color de la etiqueta del producto: ");
        etiqueta = scanner.next();

        switch (etiqueta){
            case "verde":
                descuento = compra * 0.05;
                pagoTotal = compra - descuento;
                System.out.println("El descuento es de: $" + descuento + " y el total a pagar es: $" + pagoTotal);
                break;
            case "roja":
                descuento = compra * 0.1;
                pagoTotal = compra - descuento;
                System.out.println("El descuento es de: $" + descuento + " y el total a pagar es: $" + pagoTotal);
                break;
            case "azul":
                descuento = compra * 0.15;
                pagoTotal = compra - descuento;
                System.out.println("El descuento es de: $" + descuento + " y el total a pagar es: $" + pagoTotal);
                break;
            case "dorada":
                descuento = compra * 0.2;
                pagoTotal = compra - descuento;
                System.out.println("El descuento es de: $" + descuento + " y el total a pagar es: $" + pagoTotal);
                break;
            default:
                System.out.println("Error: la etiqueta no existe!");
        }

    }
}
