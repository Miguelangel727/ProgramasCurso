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
public class edad_Votar {
    public static void main (String [] args){
        Scanner t= new Scanner (System.in);
        System.out.print("Ingrese la edad\n");
    int edad=t.nextInt();
    if (edad>=18){
        System.out.print("\nEs apto para votar\n");
    } else if (edad<17){
        System.out.print("\nNo es apto para votar\n");
    }
           
    }
}
