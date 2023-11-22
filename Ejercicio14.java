
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author ism@
 */
public class Ejercicio14 {

    
    public static void main(String[] args) {
         Scanner ficha = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo--- ");
        String nombreCompleto = ficha.nextLine();

        System.out.print("Ingrese su edad--- ");
        int edad = ficha.nextInt();
        ficha.nextLine(); 

        System.out.print("Ingrese su correo electronico--- ");
        String correoElectronico = ficha.nextLine();

        
        System.out.print("Ingrese su numero de telefono--- ");
        String telefono = ficha.nextLine();

        
      ficha.close();

        
        System.out.println("Ficha de Contacto:");
        System.out.println("Nombre Completo: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Correo Electronico: " + correoElectronico);
        System.out.println("Telefono: " + telefono);
    }
}  
    
    

    

