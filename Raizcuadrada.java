import java.util.Scanner;

public class Raizcuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número:");
        double numero = scanner.nextDouble();

        double raizCuadrada = Math.sqrt(numero);

        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);

    }
}
