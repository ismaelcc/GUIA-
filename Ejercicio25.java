/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio25;

import java.util.Scanner;
/**
 *
 * @author Ism@
 */

public class Ejercicio25 {

   
    public static void main(String[] args) {
          Scanner Dsemana = new Scanner(System.in);

        System.out.print("Ingresa un numero del 1 al 7: ");
        int numero = Dsemana.nextInt(); 

        String diasdelaSemana;

        switch (numero) {
            case 1:
                diasdelaSemana = "Lunes";
                break;
            case 2:
                diasdelaSemana = "Martes";
                break;
            case 3:
                diasdelaSemana = "Miercoles";
                break;
            case 4:
                diasdelaSemana = "Jueves";
                break;
            case 5:
                diasdelaSemana = "Viernes";
                break;
            case 6:
                diasdelaSemana = "Sabado";
                break;
            case 7:
                diasdelaSemana = "Domingo";
                break;
            default:
                diasdelaSemana = "Numero no valido";
        }

        System.out.println("Hola soy el dia:  " + diasdelaSemana);

       Dsemana.close();
    }
    }
    

