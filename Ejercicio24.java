
package ejercicio24;

/**
 *
 * @author Ism@
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Numeros primos que hay entre el 2 y el 500: ");
        for (int i = 2; i <= 500; i++) {
            int Num = 1;
            int Cont = 0;
            while (Num <= i){
                if (i % Num == 0){
                    Cont = Cont + 1;
                }
                Num = Num + 1;
            }
            if (Cont == 2){
                System.out.println(i);
            }
                }
            
        }
    }
    
    

