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
public class EstructuraCondicionalesYCiclicas {

    public static void CalcularTotalPagar(int cantClientes) {

        int[] ArrClientes = new int[cantClientes];
        List<Integer> lista = new ArrayList<>();
        int cantTipoProductos;

        for (int i = 0; i < ArrClientes.length; i++) {

            cantTipoProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "Cliente: " + (i + 1) + " Ingrese la cantidad de tipo de productos: "));

            if (cantTipoProductos == 0) {

            } else {

                for (int j = 0; j < cantTipoProductos; j++) {

                    int cantProductos;

                    cantProductos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de productos de tipo de producto " + (i + 1) + ":"));
                    int valorUnitario = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del producto " + (i + 1) + ":"));

                    int valorProducto = cantProductos * valorUnitario;

                    lista.add(valorProducto);
                }
                
            double suma = 0;

        for (double valor : lista) {

            suma += valor;
        }

        DecimalFormat formatoPesos = new DecimalFormat("$ #,##0.000");

        String sumaFormateada = formatoPesos.format(suma);
        JOptionPane.showMessageDialog(null, "El valor total es de: " + sumaFormateada);
        
        
        if(suma > 10000){
            
           double  descuento= suma * 0.1;
            double valorConDescuento = suma - descuento;
            
                  JOptionPane.showMessageDialog(null, "Su compra fue mayor a 100.000 pesos, se aplicara un 10% de descuento");
             JOptionPane.showMessageDialog(null, "El valor total con descuento es de de: " + valorConDescuento);
            
        }

            
            }

        }

        
    }

}
