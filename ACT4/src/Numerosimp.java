import java.util.Scanner;

public class Numerosimp {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero positivo
        System.out.print("Ingresa un número entero positivo: ");
        int numero = scanner.nextInt();

        // Verificar que el número sea positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingresa un número entero positivo.");
        } else {
            // Usar un ciclo do-while para imprimir los números impares
            int i = 1;
            do {
                // Verificar si el número es impar
                if (i % 2 != 0) {
                    System.out.println(i); // Imprimir el número impar
                }
                i++; // Incrementar el contador
            } while (i <= numero); // Continuar hasta el número ingresado
        }

        // Cerrar el scanner
        scanner.close();
    }
}
