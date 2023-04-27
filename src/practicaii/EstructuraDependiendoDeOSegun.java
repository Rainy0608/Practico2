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
public class EstructuraDependiendoDeOSegun {
    
    public static void CalcularTotalConDescuento(int DiaSemana, int totalPaga){
        
       double totalConDescuento = 0.0;
        
        switch (DiaSemana){
            
            case 1 : 
                
              totalConDescuento = totalPaga * 0.95;         
                
                break;
                
            case 2: 
              
                totalConDescuento = totalPaga * 0.97;
                
                break;
                
            case 3: 
                
                totalConDescuento = totalPaga * 0.90;
                
                break;
                
            case 4:
                
                totalConDescuento = totalPaga * 0.96;
                
                break;
                
            case 5: 
                
                totalConDescuento = totalPaga * 0.94;
                
                break;
                
            case 6:
                
                totalConDescuento = totalPaga * 0.98;
                
                break;
                
            case 7: 
                
                totalConDescuento = totalPaga * 0.99;
                
                break;
            
        }
    
        JOptionPane.showMessageDialog(null, "Total a pagar con descuento es de: " + totalConDescuento);
        
    }
    
    
    
}
