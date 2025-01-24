import java.util.Scanner;

public class SumaDeElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            suma += numero;
        }

        System.out.println("La suma de los numeros es: " + suma);
    }
}
