/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gemar
 */
public class Ejercicio1 {
    public static void main (String[]args){
        boolean correcto = false;
        Scanner input = new Scanner(System.in);
        do{
            
            try{
                System.out.println("Introduzca un número decimal por teclado");
                double a = input.nextDouble();
                correcto = true;
            }catch(InputMismatchException e){
                System.out.println("El dato que has introducido no corresponde. Inténtelo de nuevo.");
                input.nextLine();
            }
        }while (!correcto);
        
}
}
