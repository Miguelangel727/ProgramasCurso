import java.util.Scanner;

public class Medio {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Inicializar variables para la suma de los números y el contador
        int suma = 0;
        int contador = 0;
        int numero;
        
        // Solicitar al usuario que ingrese números
        System.out.println("Ingresa números positivos. El programa terminará cuando ingreses un número negativo.");
        
        // Ciclo while para seguir solicitando números hasta que se ingrese un número negativo
        while (true) {
            // Pedir al usuario que ingrese un número
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();
            
            // Verificar si el número es negativo
            if (numero < 0) {
                break;  // Salir del ciclo si el número es negativo
            }
            
            // Sumar el número y aumentar el contador
            suma += numero;
            contador++;
        }
        
        // Verificar si se ingresaron números positivos
        if (contador > 0) {
            // Calcular la media
            double media = (double) suma / contador;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
