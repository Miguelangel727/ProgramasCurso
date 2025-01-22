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
public class salario_Bruto {
    public static void main (String [] args){
        Scanner entrada= new Scanner (System.in);
        System.out.print("Ingresa tu Salario Bruto Mensual\n");
        int sbm= entrada.nextInt();
        System.out.print("Ingresa tu porcentaje de Impuestos\n");
        int porcentajeimpuestos=entrada.nextInt();
        System.out.print("Ingresa tus deducciones adicionales\n");
        int deducciones=entrada.nextInt();
        float impuesto=(sbm*porcentajeimpuestos)/100;
        float salarioN=sbm-porcentajeimpuestos-deducciones;
        System.out.print("\n El salario neto del trabajador es de:\n"+salarioN+"\n");
       
    }
}
