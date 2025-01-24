import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Mensaje inicial
        System.out.println("Ingresa letras para saber si son vocales o consonantes.");
        System.out.println("El programa terminará cuando ingreses un espacio.");
        
        // Inicializar la variable para la letra ingresada
        char letra;
        
        // Usar un ciclo while para seguir pidiendo letras hasta que el usuario ingrese un espacio
        while (true) {
            // Solicitar al usuario que ingrese una letra
            System.out.print("Ingresa una letra: ");
            letra = scanner.next().charAt(0);  // Leemos el primer carácter de la cadena ingresada
            
            // Verificar si se ingresó un espacio para terminar el programa
            if (letra == ' ') {
                System.out.println("Programa terminado.");
                break;
            }
            
            // Verificar si la letra es una vocal o una consonante
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("La letra '" + letra + "' es una vocal.");
            } else if (Character.isLetter(letra)) {
                System.out.println("La letra '" + letra + "' es una consonante.");
            } else {
                System.out.println("No es una letra válida.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
