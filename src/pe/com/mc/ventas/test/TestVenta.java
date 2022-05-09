
package pe.com.mc.ventas.test;

import pe.com.mc.ventas.*;

public class TestVenta {
    public static void main(String[] args) {
        Producto pro1 = new Producto("Edition XS", 440);
        Producto pro2 = new Producto("HD600", 300);
        Producto pro3 = new Producto("Deva PRO", 330);
        Producto pro4 = new Producto("Oracle", 500);
        Producto pro5 = new Producto("HD800", 1500);
        Producto pro6 = new Producto("Arya", 1000);
        
        Orden ord1 = new Orden();
        
        ord1.agregarProducto(pro1);
        ord1.agregarProducto(pro2);
        ord1.agregarProducto(pro3);
        ord1.agregarProducto(pro4);
        ord1.agregarProducto(pro5);
        ord1.mostrarOrden();
        
        Orden ord2 = new Orden();
        ord2.agregarProducto(pro1);
        ord2.agregarProducto(pro2);
        ord2.agregarProducto(pro3);
        ord2.agregarProducto(pro4);
        ord2.agregarProducto(pro5);
        ord2.agregarProducto(pro6);
        ord2.mostrarOrden();
    }
}
