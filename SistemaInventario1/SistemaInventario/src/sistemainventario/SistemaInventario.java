/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemainventario;

public class SistemaInventario {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //crear una compra
        Compras c1=new Compras(10150, 12, 10);
        Compras c2= new Compras(10182, (float) 12.5, 25);
        //crear una factura
        Ventas v1=new Ventas("945", 20, 15);
        Ventas v2=new Ventas("946", 20, 15);
        //crear el producto
        Producto p1=new Producto("1", "arroz", c1, v1);
        System.out.println(p1);
        p1.setMisCompras(c2);
        p1.setMisVentas(v2);
        System.out.println(p1);
    }
    
}
