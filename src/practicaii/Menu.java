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
            
              int cantidadBodega3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad que hay en bodega: "));
          
           int cantMinimaReq3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad minima requerida: "));
            
           CondicionalMultiple.DeterminarRealizacionPedido(cantidadBodega3, cantMinimaReq3);
            
            
            break;
            
        case "Condcional Anidado":
            
             int cantidadBodega4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad que hay en bodega: "));
          
           int cantMinimaReq4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad minima requerida: "));
            
           CondicionalAnidado.DeterminarRealizacionPedido(cantidadBodega4, cantMinimaReq4);
            
            
            break;
            
        case "Estructura dependiendo de o segun":
            
             int DiaSemana = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia de la semana (1-7):  "));
               int TotalPaga = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el total a pagar: "));
               
               EstructuraDependiendoDeOSegun.CalcularTotalConDescuento(DiaSemana, TotalPaga);
             
            break;
            
        case "Estructura ciclica":
            
            int tipoProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de tipos de productos:  "));
            
            EstructuraCiclica.CalcularTotalPagar(tipoProductos);
            
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
        


    

