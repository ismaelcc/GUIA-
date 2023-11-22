/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Ism@
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner   areacirculo = new Scanner (System.in);
      double radio;
      double area;
      double pi;
      
      pi = 3.1416;
      
        System.out.println("Dame el radio del circulo: ");
        radio = areacirculo.nextDouble();
        
        area = pi * (radio * radio);
        System.out.println("El area del circulo es: " + area);
    }
    
}