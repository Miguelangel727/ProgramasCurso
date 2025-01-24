import java.util.Scanner;

public class ContadorParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int pares = 0, impares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Los Números pares son: " + pares);
        System.out.println("Los Números impares son: " + impares);

        scanner.close();
    }
}
