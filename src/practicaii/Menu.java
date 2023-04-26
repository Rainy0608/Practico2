/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaii;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Menu {

  public static void main(String [] Args){
        
         String []  opciones = {"Condicional simple", "Condicional doble", "Condicional multiple", "Condcional Anidado", "Estructura dependiendo de o segun", "Estructura ciclica", "Integración estructuras condicionales y cíclicas" };

         boolean salir = false;
         
         while(!salir){
             
             
  String seleccion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Título", 
    JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
 
  if(seleccion != null){
      
  switch (seleccion){
          
      
      
      case "Condicional simple":
            
          int cantidadBodega = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad que hay en bodega: "));
          
           int cantMinimaReq = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad minima requerida: "));
    
  
           CondicionalSimple.determinarRealizacionDePedido(cantidadBodega, cantMinimaReq); 
        
            break;
            
            
        case "Condicional doble" :
            
           int cantidadBodega2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad que hay en bodega: "));
          
           int cantMinimaReq2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad minima requerida: "));
            
           CondicionalDoble.determinarRealizacionDePedido(cantidadBodega2, cantMinimaReq2);
            
            break;
            
        
        case "Condicional multiple":
            
            break;
            
        case "Condcional Anidado":
            
            break;
            
        case "Estructura dependiendo de o segun":
            
            break;
            
        case "Estructura ciclica":
            
            break;
            
        case "Integración estructuras condicionales y cíclicas": 
            
            break;
          
        default :
            
            break;

    }
      }
  else{
            salir = true;
            }
  
   }    }  }
        


    

