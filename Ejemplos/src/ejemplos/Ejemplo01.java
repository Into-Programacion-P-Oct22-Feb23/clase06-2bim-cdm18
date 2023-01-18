/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

  import java.security.SecureRandom; 
  //import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int valorA = obtenerNumero(); // 3
        int valorB = obtenerNumero(); // 2
        int suma = obtenerSuma(valorA, valorB);
        System.out.printf("La suma de %d + %d es igual a: %d\n", 
                valorA,
                valorB,
                suma);
    }
    
    public static int obtenerNumero() { //todos son estaticos
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(5); //se pide los 5 primeros
        return valorAleatorio;
    }
    
    public static int obtenerSuma(int a, int b){
        return a + b;
    }
    
}
