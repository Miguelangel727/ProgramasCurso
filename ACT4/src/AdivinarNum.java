import java.util.Scanner;
import java.util.Random;

public class AdivinarNum {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Crear un objeto Random para generar un número aleatorio entre 1 y 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;  // Genera un número entre 1 y 100
        
        // Inicializar las variables
        int intento = 0;
        int contadorIntentos = 0;
        
        // Mostrar un mensaje de bienvenida
        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He generado un número aleatorio entre 1 y 100. ¡Intenta adivinarlo!");
        
        // Usar un ciclo while para seguir pidiendo intentos hasta que el usuario adivine el número
        while (intento != numeroAleatorio) {
            // Solicitar al usuario que ingrese su intento
            System.out.print("Introduce tu suposición: ");
            intento = scanner.nextInt();
            contadorIntentos++;
            
            // Verificar si el intento es demasiado alto, bajo o correcto
            if (intento < numeroAleatorio) {
                System.out.println("Tu suposición es demasiado baja. ¡Intenta nuevamente!");
            } else if (intento > numeroAleatorio) {
                System.out.println("Tu suposición es demasiado alta. ¡Intenta nuevamente!");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + contadorIntentos + " intentos.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
