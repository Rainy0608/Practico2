/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaii;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CondicionalAnidado {
 
    public static boolean DeterminarRealizacionPedido(int cantBodega, int catMinimaReq){
        
        int resta = cantBodega - catMinimaReq;
        
        
        if(cantBodega > catMinimaReq){
            
            JOptionPane.showMessageDialog(null,"No es necesario realizar el pedido al proveedor");
            
            if(resta < 10){
                
            JOptionPane.showMessageDialog(null,"No es necesario realizar el pedido al proveedor" + "Unidades que faltan vender: " + resta+ "Alerta Generada");
           
            }
        }else{
            
            if(cantBodega < catMinimaReq){
                
                 JOptionPane.showMessageDialog(null,"Si necesario realizar el pedido");
                
                  int compracant = Integer.parseInt(JOptionPane.showInputDialog(null, "(Valor de compra: $3350) \n  Ingrese la cantidad de compra deseada:   ")) ;
              
                     int valorCaja = Integer.parseInt(JOptionPane.showInputDialog(null, " Ingrese su valor en caja:   ")) ;
                     
                 int valorCompra = 3350;
                
                 int total = compracant * valorCompra;
                
              if(total < valorCaja){
                     
                     JOptionPane.showMessageDialog(null,"Si es posible realizar el pedido");
                     
                 }else {
                   
                       if(total > valorCompra){
                         
                           JOptionPane.showMessageDialog(null,"No se posible realizar el pedido");
                           
                     }
                     
                 }
                   
            }
            
            
        }
        
        
        return false;
    }
    
    
}
