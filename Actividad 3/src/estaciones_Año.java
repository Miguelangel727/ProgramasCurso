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
public class estaciones_Año {
    public static void main (String [] args){
        Scanner t= new Scanner (System.in);
        System.out.print("Ingrese el numero del mes: \n");
        int op=t.nextInt();
        switch(op){
            case 1:{
                System.out.print("La Estacion de Enero es: Iniverno\n");
                break;
            }
            case 2:{
                System.out.print("La Estacion de Febrero es: Iniverno\n");
                break;
            }
            case 3:{
                System.out.print("La estacion de Marzo es: Iniverno\n");
                break;
            }
            case 4:{
                System.out.print("La estacion de Abril es: Primavera\n");
                break;
            }
            case 5:{
                System.out.print("La estacion de Mayo es: Primavera\n");
                break;
            }
            case 6:{
                System.out.print("La estacion de Junio es: Primavera\n");
                break;
            }
            case 7:{
                System.out.print("La estacion de Julio es: Verano\n");
                break;
            }
            case 8:{
                System.out.print("La estacion de Agosto es: Verano\n");
                break;
            }
            case 9:{
                System.out.print("La estacion de Septiembre es: Otoño\n");
                break;
            }
            case 10:{
                System.out.print("La estacion de Octubre es: Otoño\n");
                break;
            }
            case 11:{
                System.out.print("La estacion de Noviemnbre es: Otoño\n");
                break;
            }
            case 12:{
                System.out.print("La estacion de Diciembre es: Invierno\n");
                break;
            }
            default :{
                System.out.print("ERROR");
                break;
            }
        }
    }
}
