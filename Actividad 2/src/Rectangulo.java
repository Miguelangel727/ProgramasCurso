
import java.util.Scanner;
/**
 *
 * @author otaku
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectangulo\n");
        int base = entrada.nextInt();
       System.out.print("Ingrese la altura del rectangulo\n");
        int altura = entrada.nextInt();
        int area=base*altura;
        System.out.println("El area del rectangulo es de: "+area);
    }
    
}