
package tablademultiplicar;

import java.util.Scanner;

/**
 *
 * @author ism@
 */
public class Tablademultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner Tablademultiplicar = new Scanner(System.in);

        System.out.print(" Escoja la tabla de multiplicar que desee: ");
        int numeroTabla = Tablademultiplicar.nextInt();

        System.out.println("La tabla de multiplicar del numero " + numeroTabla + " es: ");
        for (int i = 1; i <= 10; i++) {
            int resultado = numeroTabla * i;
            System.out.println(numeroTabla + " x " + i + " = " + resultado);
        }

        Tablademultiplicar.close();
    }   
    
    
}
