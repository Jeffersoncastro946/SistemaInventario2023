package sistemainventario;

public class Ventas {
//atributos

    private String NumeroFactura;
    private int cantidad;
    private int precio;
//contructores

    public Ventas() {
        //que sea por defecto a ver que pasa
    }

    public Ventas(String factura, int cantidad, int precio) {
        this.NumeroFactura = factura;
        this.cantidad = cantidad;
        this.precio = precio;
    }
//getters y setters

    public String getNumeroFactura() {
        return NumeroFactura;
    }

    public void setNumeroFactura(String NumeroFactura) {
        this.NumeroFactura = NumeroFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public double getCostoFactura(){
        return this.cantidad*this.precio;
    }
    @Override
    public String toString() {
        return "Ventas{" + "NumeroFactura=" + NumeroFactura + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
}
