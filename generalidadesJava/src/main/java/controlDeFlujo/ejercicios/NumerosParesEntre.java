package controlDeFlujo.ejercicios;

import java.util.Scanner;

public class NumerosParesEntre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, numeroMayor, numeroMenor, i;

        System.out.println("Escriba el primer numero:");
        numero1 = scanner.nextInt();

        System.out.println("Escriba el segundo numero:");
        numero2 = scanner.nextInt();

        //Verificar el numero mayor
        if(numero1 > numero2){
            numeroMayor = numero1;
            numeroMenor = numero2;
        }else{
            numeroMayor = numero2;
            numeroMenor = numero1;
        }

        i = numeroMenor;

        //Crear el ciclo while y mostrar los numeros pares
        while(i <= numeroMayor){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
