import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es negativo
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            // Variable para almacenar el resultado
            long factorial = 1;
            
            // Calcular el factorial usando un ciclo for
            for (int i = 1; i <= numero; i++) {
                factorial *= i;  // Multiplicar el valor actual de factorial por i
            }
            
            // Imprimir el resultado
            System.out.println("El factorial de " + numero + " es " + factorial + ".");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}

