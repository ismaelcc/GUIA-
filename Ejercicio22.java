
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author ism@
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Factorial = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        
        int numero = Factorial.nextInt();
        Factorial.close();
        
        long factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *=i;
            
        }
        System.out.println("El factorial del numero " + numero + " es =  " + factorial);
    }
    }
    

