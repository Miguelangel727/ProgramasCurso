import java.util.Scanner;

public class MayoryMenor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int mayor, menor;

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese un número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        mayor = menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
