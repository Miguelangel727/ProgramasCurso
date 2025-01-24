

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        String palabra, invertida="", opcion;
        Scanner teclado = new Scanner (System.in);
        do { 
            
        System.out.println("Ingresa una frase: ");
        palabra = teclado.nextLine();
        if(palabra.contains(" ")){
            palabra = palabra.replaceAll(" ", "").trim();
            invertir(palabra,invertida);
        }else{
            invertir(palabra,invertida);
           
        }
        System.out.println("quieres continuar?");
        opcion=teclado.nextLine();
    }while(opcion.toLowerCase().equals("si"));

    }

    public static void invertir(String a, String b){
        for (int i = a.length()-1; i >=0; i--) {
            b = b+a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println("Es palindromo");
        }else{
            System.out.println("No es palindromo");
        }
    }

}
