package introduccionJava.ejercicios;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        //Leemos los datos que ingresa el usuario
        Scanner scanner = new Scanner(System.in);

        //Creamos las variables para alcemar los valores ingresados
        Double base, altura, area;

        System.out.println("Programa para calcular el area de un rectangulo");

        //Pedimos los datos
        System.out.println("Ingrese la base del rectangulo: ");
        base = scanner.nextDouble();

        System.out.println("Ingrese la altura del rectangulo: ");
        altura = scanner.nextDouble();

        //Calculamos el area
        area = base * altura;

        //Imprimimos resultados
        System.out.println("Resultado: ");
        System.out.println("El area del rectangulo es: " + area);
    }
}
