/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemainventario;

import java.util.ArrayList;
import java.util.List;
import sistemainventario.costos.CostoPEPS;

public class SistemaInventario {

    public static void main(String[] args) {
        Compras c1 = new Compras(10150, 12.0f, 10);
        Compras c2 = new Compras(10182, 12.5f, 25);
        Compras c3 = new Compras(10190, 12.75f, 20);
        Compras c4 = new Compras(10201, 13.5f, 15);
        Compras c5 = new Compras(10220, 15.00f, 10);
        
        Ventas v1 = new Ventas("945", 20, 15);
        Ventas v2 = new Ventas("946", 20, 15);
        Ventas v3 = new Ventas("947", 20, 16);
        
        CostoPEPS P1 = new CostoPEPS("01", "SAL", c1, v1);
        P1.setMisCompras(c2);
        P1.setMisCompras(c3);
        P1.setMisCompras(c4);
        P1.setMisCompras(c5);
        P1.setMisVentas(v2);
        P1.setMisVentas(v3);
        
        Double cv = P1.costoVenta();
        System.out.println(cv);
    }

}
