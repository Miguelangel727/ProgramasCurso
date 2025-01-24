import java.util.Scanner;

public class InvertirNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese un número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int[] invertidos = new int[6];
        for (int i = 0, j = numeros.length - 1; i < numeros.length; i++, j--) {
            invertidos[i] = numeros[j];
        }

        System.out.print("Numeros invertidos: ");
        for (int numero : invertidos) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
