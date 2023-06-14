package sistemainventario;

public class Compras {
    //atributos

    private int numeroDeCompra;
    private int cantidad;
    private float costo;

    //contructores
    public Compras() { //para cuando cree el produto pueda tener un stock vacio de compras

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

    public float getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Compras{" + "numeroDeCompra=" + numeroDeCompra + ", cantidad=" + cantidad + ", costo=" + costo + '}';
    }
    
}
