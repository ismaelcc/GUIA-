
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Ism@
 */
public class Ejercicio23 {

    
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        int numero = scanner.nextInt();
        
        if (numero <0) {
            System.out.println("El numero es negativo");
        } else if (numero >0){
            System.out.println("El numero es positivo");
        }
    }
    }
    

