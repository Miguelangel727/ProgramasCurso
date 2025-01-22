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
public class notas_Calificacion {
    public static void main (String [] args){
        Scanner t= new Scanner (System.in);
        System.out.print("Ingrese la calificaion de 0 alo 100\n");
        int calif=t.nextInt();
        if (calif >=90){
            System.out.print("\nA\n");
        }else if(calif>=80 && calif<=89){
            System.out.print("\nB\n");
        }else if(calif>=70 && calif<=79){
            System.out.print("\nC\n");
        }else if(calif>=60 && calif<=69){
            System.out.print("\nD\n");
        }else if(calif>=60){
            System.out.print("\nF\n");
        }
        
    } 
}
