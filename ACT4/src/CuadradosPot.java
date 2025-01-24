import java.util.Scanner;

public class CuadradosPot {
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
            // Usar un ciclo do-while para calcular y mostrar los cuadrados
            int i = 1;
            do {
                int cuadrado = i * i;  // Calcular el cuadrado de i
                System.out.println("El cuadrado de " + i + " es: " + cuadrado);
                i++;  // Incrementar el contador
            } while (i <= numero);  // Continuar hasta el número ingresado
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
