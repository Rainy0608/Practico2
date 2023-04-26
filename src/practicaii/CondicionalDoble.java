package practicaii;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class CondicionalDoble {
    
    
    public static  boolean determinarRealizacionDePedido(int cantBodega, int cantMinimaReq){
        
        
        if(cantBodega > cantMinimaReq){
            JOptionPane.showMessageDialog(null, "No es necesario realizar el pedido al proveedor");
          
            return true;
        
           
        }else{
            
            JOptionPane.showMessageDialog(null, "Si es necesario realizar el pedido al proveedor");
            
            return true;        
      
            }
             
 }
    }
    

