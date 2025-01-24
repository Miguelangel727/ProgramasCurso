import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        boolean continuar = true;
        
        // Ciclo principal que se ejecuta mientras el usuario quiera continuar
        while (continuar) {
            // Mostrar el menú
            System.out.println("Calculadora Básica");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            
            // Si el usuario elige salir, termina el programa
            if (opcion == 5) {
                System.out.println("¡Gracias por usar la calculadora! Adiós.");
                break;
            }
            
            // Solicitar los números para la operación
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            // Variable para almacenar el resultado
            double resultado;
            
            // Realizar la operación según la opción seleccionada
            switch (opcion) {
                case 1: // Sumar
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case 2: // Restar
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case 3: // Multiplicar
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case 4: // Dividir
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            
            // Preguntar si el usuario desea continuar
            System.out.print("¿Deseas realizar otra operación? (sí/no): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
                System.out.println("¡Gracias por usar la calculadora! Adiós.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
