import java.util.Scanner;
/**
 *
 * @author otaku
 */
public class Calificaciones {
    public static void main (String [] args){
        Scanner T = new Scanner (System.in);
        System.out.print("Ingrese la cslificacion de los parciales\n");
        float parciales=T.nextFloat();
        System.out.print("\nIngrese la calificacion del proyecto\n");
        float proyecto=T.nextFloat();
        System.out.print("\nIngrese la califiacion del examen\n");
        float examen=T.nextFloat();
        
        float Pparcia=(parciales*40)/100;
        float Pproyecto=(proyecto*30)/100;
        float Pexamen=(examen*30)/100;
        float Promedio=Pparcia+Pproyecto+Pexamen;
        System.out.print("\nEl promedio de las calificaciones ingresadas es de: "+Promedio);
    }
}