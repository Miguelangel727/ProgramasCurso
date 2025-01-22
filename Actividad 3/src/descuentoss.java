/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author otaku
 */
public class descuentoss {
    public static void main (String [] args){
        Scanner t= new Scanner (System.in);
        System.out.print("Ingrese el Precio Original\n");
        int precio=t.nextInt();
        if (precio>100 && precio<200){
            float d=(precio*10)/100;
            float T= precio-d;
            System.out.print("\n El precio con el 10% de descuento es de: "+T+"\n");
        }else if(precio>200 && precio<=500){
            float d=(precio*20)/100;
            float T= precio-d;
            System.out.print("\n El precio con el 20% de descuento es de: "+T+"\n");
        }else if(precio>500){
            float d=(precio*25)/100;
            float T= precio-d;
            System.out.print("\n El precio con el 25% de descuento es de: "+T+"\n");
        }
    }
}
