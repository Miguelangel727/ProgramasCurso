import java.util.Scanner;

public class letrasA {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();
        
        // Inicializar el contador de letras 'a'
        int contador = 0;
        
        // Usar un ciclo while para recorrer la palabra
        int i = 0;  // Índice para recorrer la palabra
        while (i < palabra.length()) {
            // Verificar si el carácter en la posición i es la letra 'a' o 'A'
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                contador++;
            }
            i++;  // Incrementar el índice
        }
        
        // Imprimir el resultado
        System.out.println("La letra 'a' aparece " + contador + " veces en la palabra.");
        
        // Cerrar el scanner
        scanner.close();
    }
}
