package controlDeFlujo;

import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String dia = "";

        System.out.println("Escriba un numero entre 1 y 7");
        numero = scanner.nextInt();

        switch (numero){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miercoles";
                break;
            case 5:
                dia = "Jueves";
                break;
            case 6:
                dia = "Viernes";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                System.out.println("Error: numero no permitido!");
        }

        if(!dia.equals("")){
            System.out.println("El dia de la semana que corresponde es:" + dia);
        }
    }
}
