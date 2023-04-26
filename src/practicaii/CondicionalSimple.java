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
public  class CondicionalSimple {
    
    
    
    public static  boolean determinarRealizacionDePedido(int cantBodega, int cantMinimaReq){
        
        
        if(cantBodega > cantMinimaReq){
             JOptionPane.showMessageDialog(null, "No es necesario realizar el pedido al proveedor");
           return true;
           
        }
        
        if(cantBodega < cantMinimaReq){
            
            JOptionPane.showMessageDialog(null, "Si es necesario realizar el pedido al proveedor");
           return true;
            
        }
        
        
        return false;
        
    }
    
}
