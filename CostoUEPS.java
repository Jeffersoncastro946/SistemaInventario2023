/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemainventario.costos;

/**
 *
 * @author sanch
 */
import java.util.Collections;
import sistemainventario.*;
public class CostoUEPS extends Producto {
    double costoUEPS = 0;

    public CostoUEPS() {
    }

    public CostoUEPS(String codigo, String nombre, Compras entrada, Ventas salidad) {
        super(codigo, nombre, entrada, salidad);
    }
    @Override
    public double costoVenta() {
        Collections.reverse(getMisCompras());
        int factura = getMisVentas().size(); //tiene la cantida de facturas
        int cantFactura = 0;
        int cantidaStok = 0;
        
        int i = 0;//ementos de la factura
        int j = 0; //elementos para la entrada stok
        int k = 0;
        while (factura > 0) { //ire disminuyendo la facturas
            cantFactura = getMisVentas().get(i).getCantidad();//de la factura 1 tengo x productos a vender
            cantidaStok = getMisCompras().get(j).getCantidad();//dispongo de x produto a vender

            while (cantFactura > 0) { //a modo de ir disminuyendo las ventas de la factura
                if (cantFactura > cantidaStok) {
                    //codigo para restar al stock y pasar al siguiente 
                    int t = cantFactura - cantidaStok; //nueva facctura
                    costoUEPS += getMisCompras().get(k).getcostoTotal(); //calculo peps de ese reglon
                    getMisCompras().get(k).setCantidad(0);

                    cantFactura = t; //si tengo una factura de 20 y en stock 8 la proxima factura sera de 12
                    k++;
                    cantidaStok = getMisCompras().get(k).getCantidad();//dispongo de x produto a vender
                }
                if (cantidaStok >= cantFactura) {  //20>2
                    int t = cantidaStok - cantFactura; //18 guardados solo ocupo 2
                    costoUEPS += getMisCompras().get(k).getcostoTotal(t);
                    cantFactura = 0;
                    j = k;
                }

            }
            factura--;
        }
        return costoUEPS;
    }

    @Override
    public double costoExistencia() {
        double costoExist=0;
        int n = getMisCompras().size()-1 ; //variable de control
        
        
        while(n>0){//el ciclo recorre todas las compras (incluso las vacías) o podriamos declarar k afuera del método CostoPEPS
            costoExist += getMisCompras().get(n).getcostoTotal() ;
            n--;
        }
        return costoExist;
    }

    @Override
    public double utilidad() {
        Double utilidad=0.00;
        int n = 0;
        double venta=0;
        while(n<getMisVentas().size()){
            venta+= getMisVentas().get(n).getCantidad() * getMisVentas().get(n).getPrecio();
            n++;
        }
        utilidad = venta - costoUEPS;
        return utilidad;
    }
    
    
}
