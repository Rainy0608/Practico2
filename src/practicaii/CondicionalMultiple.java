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
public class CondicionalMultiple {
 
    public static boolean DeterminarRealizacionPedido(int cantBodega, int catMinimaReq){
        
        int resta = cantBodega - catMinimaReq;
        
           if(cantBodega > catMinimaReq &&  resta < 10){
            
             JOptionPane.showMessageDialog(null, "No es necesario realizar el pedido al proveedor" + " Unidades que hacen falta vender:" + resta
             + " Alerta Generada");
            return true;
        
           }else if(cantBodega > catMinimaReq){
            
            JOptionPane.showMessageDialog(null, "No es necesario realizar el pedido al proveedor");
            return true;
        
           }else if(cantBodega < catMinimaReq){
            
              JOptionPane.showMessageDialog(null, "Si es necesario realizar el pedido al proveedor");
            return true;
        }
               
        return false;
        
    } 
    
}
