/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaii;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class EstructuraCiclica {
    
    public static void CalcularTotalPagar (int tipoProducto){
        
        int []  tipoProductos = new int [tipoProducto];
     
        List<Integer> lista = new ArrayList<>();
                List<Double> listaTotal = new ArrayList<>();
       
          for(int i = 0; i < tipoProductos.length; i++){
            
               int cantProductos;
              
              
            cantProductos  =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos del tipo de producto "+(i+1)+":")); 
            
      lista.add(cantProductos);
       
}
          
        for(int j = 0; j < lista.size(); j++){
            
         
            
            do {
    double valor;
    switch (j) {
        case 0:
            valor = 2.450;
            break;
        case 1:
            valor = 6.540;
            break;
        case 2:
            valor = 1.050;
            break;
        case 3:
            valor = 3.400;
            break;
        case 4:
            valor = 2.680;
            break;
        default:
            valor = 0;
            break;
    }
    
    double valorTotal = lista.get(j)* valor;
    listaTotal.add(valorTotal);

    j++;

} while (j < tipoProductos.length);
            
        }
        
        double suma = 0;
    
        for (double valor : listaTotal) {
        
            suma += valor;
    }
        
        DecimalFormat formatoPesos = new DecimalFormat("$ #,##0.000");

        String sumaFormateada = formatoPesos.format(suma);
    JOptionPane.showMessageDialog(null, "El valor total es de: " + sumaFormateada);
    
  
    if(suma > 100.000){
      
        
        double TotalConDescuento = suma * 0.1;
        double sumaConDescuento = TotalConDescuento - suma;
        
        String sumaFormateada2 = formatoPesos.format(sumaConDescuento);
       JOptionPane.showMessageDialog(null, "Su compra es superior a 100.000 pesos: "+"Se realizo un 10 % de descuento"
                  +"\n su total es de: "+ sumaFormateada2);
        
    }
    
    } }
