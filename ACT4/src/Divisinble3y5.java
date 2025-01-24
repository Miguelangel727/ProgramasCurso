public class Divisinble3y5 {
    public static void main(String[] args) {
        // Inicializar el número que se va a evaluar
        int numero = 1;
        
        // Usar un ciclo while para recorrer los números entre 1 y 100
        while (numero <= 100) {
            // Verificar si el número es divisible tanto por 3 como por 5
            if (numero % 3 == 0 && numero % 5 == 0) {
                // Imprimir el número si cumple la condición
                System.out.println(numero);
            }
            numero++;  // Incrementar el número para la siguiente iteración
        }
    }
}
