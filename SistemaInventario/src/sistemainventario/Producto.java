package sistemainventario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public abstract class Producto {
//atributos

    private String codigoArticulo;
    private String nombreArticulo;
    //agregar una lista de compras
    private List<Compras> misCompras = new ArrayList<>();
    //agregar una lista de ventas
    private List<Ventas> misVentas = new ArrayList<>();
   
    //contructores para inicializar los atributos
    public Producto() {
    }

    public Producto(String codigo, String nombre, Compras entrada, Ventas salidad) {
        /*Este contructor recibira dos objectos ya armados para agregarlos a una lista de compra y venta
        el armado puede ser desde los txt el apartado para registrar la compra y venta*/
        this.codigoArticulo = codigo;
        this.nombreArticulo = nombre;
        this.misCompras.add(entrada);
        this.misVentas.add(salidad);

    }
  
      public Producto(String codigo, String nombre, Compras entrada) {
        /*Este contructor recibira dos objectos ya armados para agregarlos a una lista de compra y venta
        el armado puede ser desde los txt el apartado para registrar la compra y venta*/
        this.codigoArticulo = codigo;
        this.nombreArticulo = nombre;
        this.misCompras.add(entrada);
       // this.misVentas.add(salidad);

    }
      public Producto(JTextField codigo, JTextField nombre, Compras entrada, Ventas salidad) {
        /*Este contructor recibira dos objectos ya armados para agregarlos a una lista de compra y venta
        el armado puede ser desde los txt el apartado para registrar la compra y venta*/
        this.codigoArticulo = codigo.getText();
        this.nombreArticulo = nombre.getText();
        this.misCompras.add(entrada);
        this.misVentas.add(salidad);

    }
       public Producto(JTextField codigo, JTextField nombre, Compras entrada) {
        /*Este contructor recibira dos objectos ya armados para agregarlos a una lista de compra y venta
        el armado puede ser desde los txt el apartado para registrar la compra y venta*/
        this.codigoArticulo = codigo.getText();
        this.nombreArticulo = nombre.getText();
        this.misCompras.add(entrada);
       // this.misVentas.add(salidad);

    }
    //bloque de metodos
    //calcular costo de venta eso sera implementado dependiendo el tipo de costeo
    public abstract double costoVenta();
    public abstract double costoExistencia();
    public abstract  double utilidad(); 
     

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public List<Compras> getMisCompras() { //devuelve una lista de compras
        return misCompras;
    }
   
        
    public void setMisCompras(Compras entrada) {//recibe un objecto de compra y almacena en la lista
        this.misCompras.add(entrada);
    }

    public List<Ventas> getMisVentas() {
        return misVentas;
    }
   

    public void setMisVentas(Ventas salida) {
        this.misVentas.add(salida);
    }

    @Override
    public String toString() {
        return "Producto{" + "codigoArticulo=" + codigoArticulo + ", nombreArticulo=" + nombreArticulo + ", misCompras=" + misCompras + ", misVentas=" + misVentas + '}';
    }
    
}
