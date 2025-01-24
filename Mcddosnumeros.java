import java.util.Scanner;

public class Mcddosnumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa un numero: ");
             int n1 = sc.nextInt();
             System.out.println("Ingresa otro numero: ");
             int n2 = sc.nextInt();
      System.out.println("El maximno común divisor es:"+mcd(n1, n2));
        
    }
    public static int mcd(int n1,int n2) {
        if (n1%n2==0) {
            return n2;
        }else{
            return mcd(n2,n1%n2);
        }

        
    }

}