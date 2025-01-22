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
public class IMC {
    public static void main (String[] args){
        Scanner entrada= new Scanner (System.in);
        System.out.print("Ingrese su peso\n");
        int peso=entrada.nextInt();
        System.out.print("Ingrese su altura en CM sin decimal\n");
        int altura=entrada.nextInt();
        int imc=(peso*peso)/altura;
        System.out.print("Tu Indice de Masa Corporal es de: "+imc+"\n");
    }
}
