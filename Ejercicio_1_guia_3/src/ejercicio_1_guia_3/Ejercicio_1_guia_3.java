/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_guia_3;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_1_guia_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        
        if(num%2 == 0){
        System.out.println("El numero ingresado es par");
        }else{
        System.out.println("El numero ingresado es impar");
        }  
    }
    
}
