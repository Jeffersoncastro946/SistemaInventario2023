package sistemainventario;

import javax.swing.JTextField;

public class Compras {
    //atributos

    private int numeroDeCompra;
    private int cantidad;
    private double costo;

    //contructores
    public Compras() { //para cuando cree el produto pueda tener un stock vacio de compras

    }
    public Compras(JTextField Ncompra, JTextField cantidad, JTextField costo) { //
        this.numeroDeCompra=Integer.parseInt(Ncompra.getText());
        this.cantidad=Integer.parseInt(cantidad.getText());
        this.costo=Double.parseDouble(costo.getText());
    }

    public Compras(int nCompras, float costo, int cantidad) { //para cuando cree el produto pueda tener un stock 
        this.numeroDeCompra = nCompras;
        this.costo = costo;
        this.cantidad = cantidad;
    }
    //forma de interactuar con otras clases mediantes metodos setter y getters

    public int getNumeroDeCompra() {
        return numeroDeCompra;
    }

    public void setNumeroDeCompra(int numeroDeCompra) {
        this.numeroDeCompra = numeroDeCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(int costo) {                                  
        this.costo = costo;
    }
    public double getcostoTotal(){
        return this.cantidad*this.costo;
    }
    public double getcostoTotal(int cantsale){
        //25-15=10
        int cant=this.cantidad-cantsale;
        this.cantidad-=cant;
        return cant*this.costo;
    }
    
    @Override
    public String toString() {
        return "Compras{" + "numeroDeCompra=" + numeroDeCompra + ", cantidad=" + cantidad + ", costo=" + costo + '}';
    }
    
}
  