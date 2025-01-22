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
public class convertor_Monedas {
    public static void main (String [] args){
        Scanner t= new Scanner (System.in); 
        System.out.print("Ingrese los Pesos Mexicanos a Conevrtir\n");
        float mex=t.nextFloat();
        System.out.print("Elija la moneda a convertir: ");
        System.out.print("\n\n(1) Dolar\n");
        System.out.print("\n(2) Euro\n");
        System.out.print("\n(3) Bath\n");
        System.out.print("\n(4) Yen\n");
        System.out.print("\n(5) Won\n");
        System.out.print("\n(6) Dolar Aust\n");
        System.out.print("\n(7) Sol\n");
        System.out.print("\n(8) Dolar Canadiense\n");
        System.out.print("\n(9) Bolivar\n");
        System.out.print("\n(10) Peso Argentino\n");
        
        int op= t.nextInt();
        switch (op){
            case 1:{
                float dolar=mex/21;
                System.out.print("Los pesos mexicanos a Dolares son: "+dolar+"\n");
                break;
            }
            case 2:{
                float euro=(float) (mex/21.45);
                System.out.print("Los pesos mexicanos a Euro son: "+euro+"\n");
                break;
            }
            case 3:{
                float bath=(float) (mex/0.61);
                System.out.print("Los pesos mexicanos a Bath son: "+bath+"\n");
                break;
            }
            case 4:{
                float yen=(float) (mex/0.13);
                System.out.print("Los pesos mexicanos a Yenes son: "+yen+"\n");
                break;
            }
            case 5:{
                float won=(float) (mex/0.014);
                System.out.print("Los pesos mexicanos a Wones son: "+won+"\n");
                break;
            }
            case 6:{
                float dolarA=(float) (mex/12.94);
                System.out.print("Los pesos mexicanos a Dolares Autralinos son: "+dolarA+"\n");
                break;
            }
            case 7:{
                float sol=(float) (mex/5.54);
                System.out.print("Los pesos mexicanos a Soles son: "+sol+"\n");
                break;
            }
            case 8:{
                float dolarC=(float) (mex/14.48);
                System.out.print("Los pesos mexicanos a Dolares Canadiense son: "+dolarC+"\n");
                break;
            }
            case 9:{
                float bolivar=(float) (mex/0.3919);
                System.out.print("Los pesos mexicanos a Bolivares son: "+bolivar+"\n");
                break;
            }
            case 10:{
                float pAr=(float) (mex/0.020);
                System.out.print("Los pesos mexicanos a Soles son: "+pAr+"\n");
                break;
            }
            default :{
                System.out.print("ERROR");
                break;
            }
        }
    }
}
