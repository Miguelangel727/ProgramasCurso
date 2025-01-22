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
public class Promedio {
    public static void main (String[] args){
        Scanner entrada= new Scanner (System.in);
    System.out.print("Ingrese las 3 califiaciones:\n");
    int calif1=entrada.nextInt();
    int calif2=entrada.nextInt();
    int calif3=entrada.nextInt();
    int promedio=(calif1+calif2+calif3)/3;
    System.out.print("El promedio de las 3 calificaciones es de: "+promedio+"\n");
}}
