/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoautomata;

 


import java.util.Scanner;

/**
 *
 * @author Angelito
 */
public class Proyectoautomata {

   
    public static void main(String[] args) {
 
    Scanner leer= new Scanner (System.in);  
    
    System.out.println("Ingrese la cadena:");
    
    String entrada= leer.nextLine();
    
    ValidarAutoDos validar= new ValidarAutoDos();
    System.out.println(validar.ValidarAutoDos(entrada));
        
        
    }
    
}
