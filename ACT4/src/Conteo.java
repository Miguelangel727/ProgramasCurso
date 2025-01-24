import java.util.Scanner;

public class Conteo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la cantidad de números a ingresar
        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = scanner.nextInt();
        
        // Inicializar los contadores
        int mayoresQueCero = 0;
        int menoresQueCero = 0;
        int igualesACero = 0;
        
        // Ciclo para leer los números e incrementar los contadores
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            int numero = scanner.nextInt();
            
            // Verificar el valor del número y actualizar el contador correspondiente
            if (numero > 0) {
                mayoresQueCero++;
            } else if (numero < 0) {
                menoresQueCero++;
            } else {
                igualesACero++;
            }
        }
        
        // Imprimir los resultados
        System.out.println("\nResumen:");
        System.out.println("Números mayores que 0: " + mayoresQueCero);
        System.out.println("Números menores que 0: " + menoresQueCero);
        System.out.println("Números iguales a 0: " + igualesACero);
        
        // Cerrar el scanner
        scanner.close();
    }
}

