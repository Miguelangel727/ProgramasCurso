import java.util.Scanner;

public class cuantosDigit {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        // Convertir el número en valor absoluto para manejar números negativos
        numero = Math.abs(numero);
        
        // Inicializar el contador de dígitos
        int contador = 0;
        
        // Usar un ciclo for para contar los dígitos
        for (int temp = numero; temp > 0; temp /= 10) {
            contador++;
        }
        
        // Si el número es 0, el contador debe ser 1, ya que tiene un solo dígito
        if (numero == 0) {
            contador = 1;
        }
        
        // Imprimir el número de dígitos
        System.out.println("El número tiene " + contador + " dígitos.");
        
        // Cerrar el scanner
        scanner.close();
    }
}
