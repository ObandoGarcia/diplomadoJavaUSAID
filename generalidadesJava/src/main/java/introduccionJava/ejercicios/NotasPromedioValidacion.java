package introduccionJava.ejercicios;

import java.util.Scanner;

public class NotasPromedioValidacion {
    public static void main(String[] args) {
        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaracion de variables
        Double nota1, nota2, nota3, promedio;

        System.out.println("Programa que calcula el promedio de notas");
        while(true){
            System.out.println("Ingrese el valor de la nota 1:");
            nota1 = scanner.nextDouble();

            if(nota1 < 0 || nota1 > 10){
                System.out.println("El valor de la notas debe estar entre 0 y 10");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Ingrese el valor de la nota 2:");
            nota2 = scanner.nextDouble();

            if(nota2 < 0 || nota2 > 10){
                System.out.println("El valor de la notas debe estar entre 0 y 10");
            }else{
                break;
            }
        }

        while(true){
            System.out.println("Ingrese el valor de la nota 3:");
            nota3 = scanner.nextDouble();

            if(nota3 < 0 || nota3 > 10){
                System.out.println("El valor de la notas debe estar entre 0 y 10");
            }else{
                break;
            }
        }

        promedio = (nota1 + nota2 + nota3)/3;
        System.out.println("El promedio del estudiante es: " + promedio);

        if(promedio > 5){
            System.out.println("Estudiante aprobado!");
        }else{
            System.out.println("Estudiante reprobado!");
        }
    }
}
