/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoautomata;

/**
 *
 * @author Angelito
 */
public class ValidarAutoDos {
    
    char estado;
    
    public String ValidarAutoDos(String entrada){
        
        char[ ] letras= entrada.toCharArray();
        estado='A';
        
        for(char letra: letras){
             
             switch(estado){
                 case 'A':
                     
                     switch (letra){
                         case '0':
                             estado='B';
                             break;
                         case '1':
                             estado='D';
                             break;
                         default:
                             estado='F';  
                      }
                     break;
                 
                 case 'B':
                     switch (letra){
                         case '0':
                             estado='A';
                             break;
                         case '1':
                             estado='C';
                             break;
                         default:
                             estado='F';
     
                     }
                    break;
                     
                 case 'C':
                     switch (letra){
                         case '0':
                             estado='A';
                             break;
                         case '1':
                             estado='E';
                             break;
                         default:
                             estado='F';
                     }
                     break;
                     
                 case 'D':
                     switch (letra){
                         case '0':
                             estado='B';
                             break;
                         case '1':
                             estado='E';
                             break;
                         default:
                             estado='F';           
                      }
                    break;
                    
                 case 'E':
                     switch(letra){
                         case '0':
                         case '1':
                              estado='E';
                             break;
                         default:
                             estado='F';  
                      }    
                     break;
                     
                 case 'F':  //Estado fallido
                     break;
                 
                 }
                 
             }
            
            if (estado=='A'||estado=='D'){
                return "cadena valida";
            }else{
                return "cadena no valida";
            }
          
       
    }
    }

