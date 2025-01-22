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
public class temperatura {
    public static void main (String []args){
        Scanner t= new Scanner (System.in);
        System.out.print("Ingresa la temperatura en °C\n");
        float C=t.nextFloat();
        System.out.print("\nElija la conversion deseada: \n");
        System.out.print("\n(1) Farenheit\n");
        System.out.print("\n(2) Kelvin\n");
        int op= t.nextInt();
        switch (op){
            case 1:{
                float f=((C*9)/5)+32;
                System.out.print("\n Los °C a °F son: "+f+"\n");
                break;
            }
            case 2:{
                float k=C+273;
                System.out.print("\n Los °C a °K son: "+k+"\n");
                break;
            }
            default :{
                System.out.print("ERROR");
                break;
            }
        }
        
    }
}
