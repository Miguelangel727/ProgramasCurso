import java.util.Scanner;

public class CambioDeCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena,resultado;
        char nuevo,viejo;

        System.out.println("Introduce una cadena de texto:");
         cadena = scanner.nextLine();

        System.out.println("Introduce el carácter que deseas cambiar:");
         viejo = scanner.nextLine().charAt(0); 

        System.out.println("Introduce el nuevo carácter:");
         nuevo = scanner.nextLine().charAt(0); 

        resultado = cadena.replace(viejo, nuevo);

        System.out.println("El resultado es: " + resultado);
    }
}
