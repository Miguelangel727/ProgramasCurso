import java.util.Scanner;

public class Mayusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabras;

        System.out.println("Introduce las palabras (Ingresa un espacio en blanco para terminar):");

        while (true) {
            palabras = scanner.nextLine();

            if (palabras.contains(" ")) {
                break;
            }

            System.out.println(palabras.toUpperCase());
        }
        
    }
}
