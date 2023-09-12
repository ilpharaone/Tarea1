
package tarea.pkg1;

import java.util.Scanner;

/**
 *
 * @author emanu
 */
public class Tarea1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor_uno;
        double valor_dos;
        double valor_tres;
        double n;
        System.out.println("Bienvenidos al inversor de orden de numeros");
        System.out.println("Digite el primer numero");
        valor_uno = entrada.nextDouble();
        System.out.println("Digite el segundo numero");
        valor_dos = entrada.nextDouble();
        System.out.println("Digite el tercer numero");
        valor_tres = entrada.nextDouble();
        n = valor_tres;
        valor_tres = valor_uno;
        valor_uno = n;
        System.out.println("El orden de los numeros es: "+(valor_uno)+", "+(valor_dos)+", "+(valor_tres));
    }
    
}
