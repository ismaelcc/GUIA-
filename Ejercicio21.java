
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author ism@
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner taqueria = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido");
            System.out.println("Elija su orden ");
            System.out.println("1. Tacos de pastor");
            System.out.println("2. Tacos de bistec");
            System.out.println("3. Tacos campechanos");
            System.out.println("4. Tacos de suadero");
            System.out.println("6. Salir");
            
            
            opcion = taqueria.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Esta lista su orden de tacos al pastor ");
                    break;
                case 2:
                    System.out.println("Esta lista su orden de tacos de bistec");
                    break;
                case 3:
                    System.out.println("Esta lista su orden de tacos campechanos");
                    break;
                case 4:
                    System.out.println("Esta lista su orden de tacos de suadero");
                    break;
                case 5:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elige una opcion valida.");
                    break;
            }
        } while (opcion != 5);

        taqueria.close();
    }
}
    
    
    
    
