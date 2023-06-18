package sistemainventario.costos;

import java.util.List;
import sistemainventario.*;

public class CostoPromedio extends Producto {
    
    
    
    public CostoPromedio()
    {
        
    }
    
    public CostoPromedio(String codigo, String nombre, Compras entrada, Ventas salidad)
    {
        super(codigo, nombre, entrada, salidad);
    }
    
    @Override
    public double costoVenta()
    {
        int salidas=0;
        int entradas=0;
        int existencia=0;
        double promedio=0;
        double debe=0;
        double haber=0;
        double saldo=0;
        double costoventas=0;
        int cantidad_compras=getMisCompras().size();
        int cantidad_ventas=getMisVentas().size();
        int i=0;
        
        while(cantidad_compras>0)
        {
            entradas=getMisCompras().get(i).getCantidad();
            existencia+=entradas;
            debe=getMisCompras().get(i).getcostoTotal();
            
            if(i==0)
            {
                saldo=debe;
            }
            else
            {
                saldo=debe+saldo;
            }
            
            promedio=saldo/existencia;
            
            i++;
            cantidad_compras--;
        }
        
        i=0;
        double costofactura=0;
        double costototal=0;
        double utilidad=0;
        while(cantidad_ventas>0)
        {
            salidas=getMisVentas().get(i).getCantidad();
            existencia-=salidas;
            haber=promedio*salidas;
            costofactura=getMisVentas().get(i).getCostoFactura();
            
            costoventas+=haber;
            saldo=saldo-haber;
            costototal+=costofactura;
            
            
            i++;
            cantidad_ventas--;
        }
        
        utilidad=costototal-costoventas;
        
        return costoventas;
    }
    
    @Override
    public double costoExistencia()
    {
        int salidas=0;
        int entradas=0;
        int existencia=0;
        double promedio=0;
        double debe=0;
        double haber=0;
        double saldo=0;
        double costoventas=0;
        int cantidad_compras=getMisCompras().size();
        int cantidad_ventas=getMisVentas().size();
        int i=0;
        
        while(cantidad_compras>0)
        {
            entradas=getMisCompras().get(i).getCantidad();
            existencia+=entradas;
            debe=getMisCompras().get(i).getcostoTotal();
            
            if(i==0)
            {
                saldo=debe;
            }
            else
            {
                saldo=debe+saldo;
            }
            
            promedio=saldo/existencia;
            
            i++;
            cantidad_compras--;
        }
        
        i=0;
        double costofactura=0;
        double costototal=0;
        double utilidad=0;
        while(cantidad_ventas>0)
        {
            salidas=getMisVentas().get(i).getCantidad();
            existencia-=salidas;
            haber=promedio*salidas;
            costofactura=getMisVentas().get(i).getCostoFactura();
            
            costoventas+=haber;
            saldo=saldo-haber;
            costototal+=costofactura;
            
            
            i++;
            cantidad_ventas--;
        }
        
        utilidad=costototal-costoventas;
        
        return saldo;
    }
    
    @Override
    public double utilidad()
    {
        int salidas=0;
        int entradas=0;
        int existencia=0;
        double promedio=0;
        double debe=0;
        double haber=0;
        double saldo=0;
        double costoventas=0;
        int cantidad_compras=getMisCompras().size();
        int cantidad_ventas=getMisVentas().size();
        int i=0;
        
        while(cantidad_compras>0)
        {
            entradas=getMisCompras().get(i).getCantidad();
            existencia+=entradas;
            debe=getMisCompras().get(i).getcostoTotal();
            
            if(i==0)
            {
                saldo=debe;
            }
            else
            {
                saldo=debe+saldo;
            }
            
            promedio=saldo/existencia;
            
            i++;
            cantidad_compras--;
        }
        
        i=0;
        double costofactura=0;
        double costototal=0;
        double utilidad=0;
        while(cantidad_ventas>0)
        {
            salidas=getMisVentas().get(i).getCantidad();
            existencia-=salidas;
            haber=promedio*salidas;
            costofactura=getMisVentas().get(i).getCostoFactura();
            
            costoventas+=haber;
            saldo=saldo-haber;
            costototal+=costofactura;
            
            
            i++;
            cantidad_ventas--;
        }
        
        utilidad=costototal-costoventas;
        
        return utilidad;
    }
    
    
}
