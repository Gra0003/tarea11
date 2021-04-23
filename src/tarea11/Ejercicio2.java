/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea11;

import java.util.Scanner;

/**
 *
 * @author gemar
 */
public class Ejercicio2 {
    public static void main (String[]args){
        int numero = 0;
        int petar = 0;
        numero = (int) (Math.random()*100);
        
        
        try{
            if(numero%2==0){
               System.out.println("El numero "+ numero + " es par."); 
            }else{
                petar = numero/0;
            }
        }catch(ArithmeticException e){
            System.out.println("El numero " + numero + " es impar.");
        }
        
                
}
}