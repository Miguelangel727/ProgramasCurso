import java.util.Scanner;

public class SecArit {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el primer número, la diferencia y el número máximo
        System.out.print("Ingresa el primer número de la secuencia: ");
        int primerNumero = scanner.nextInt();
        
        System.out.print("Ingresa la diferencia entre los números: ");
        int diferencia = scanner.nextInt();
        
        System.out.print("Ingresa el número máximo de la secuencia: ");
        int maximo = scanner.nextInt();
        
        // Verificar que el número máximo sea mayor o igual al primer número
        if (maximo < primerNumero) {
            System.out.println("El número máximo debe ser mayor o igual al primer número.");
        } else {
            // Usar un ciclo do-while para generar y mostrar la secuencia aritmética
            int numeroActual = primerNumero;
            do {
                System.out.println(numeroActual);  // Mostrar el número actual de la secuencia
                numeroActual += diferencia;  // Sumar la diferencia para obtener el siguiente número
            } while (numeroActual <= maximo);  // Continuar hasta alcanzar el número máximo
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}

