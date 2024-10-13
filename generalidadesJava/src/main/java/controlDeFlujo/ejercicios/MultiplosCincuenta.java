package controlDeFlujo.ejercicios;

public class MultiplosCincuenta {
    public static void main(String[] args) {
        int multiplos = 0;

        for(int i = 1; i <= 50 ; i++){
            multiplos += 5;
            System.out.println("Multiplos de 5: [" + i + "] : " + multiplos);
        }
    }
}
