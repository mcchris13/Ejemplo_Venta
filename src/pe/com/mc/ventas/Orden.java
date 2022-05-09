package pe.com.mc.ventas;

public class Orden {

    private int idOrden;
    private static int contadorOrden;
    private Producto producto[];
    private final static int MAX_PRODUCTOS = 5;
    private int contadorProducto;

    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        this.producto = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProducto < Orden.MAX_PRODUCTOS) {
            this.producto[contadorProducto++] = producto;

        }else {
            System.out.println("Superaste el máximo de productos por orden de " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProducto; i++) {
            total += this.producto[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Orden N°: " + this.idOrden);
        System.out.println("Productos: ");
        for (int i = 0; i < this.producto.length; i++) {
            System.out.println(this.producto[i]);
        }
    }
}
