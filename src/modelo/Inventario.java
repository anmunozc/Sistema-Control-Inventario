/*
 *================================================
 * Clase encargada de administrar el inventario
 *================================================
 */

package modelo;


import java.util.ArrayList;
import java.util.List;


public class Inventario {


    private List<Producto> productos;


    public Inventario() {

        productos = new ArrayList<>();

    }


    public void agregarProducto(Producto producto) {

        productos.add(producto);

    }


    public List<Producto> obtenerProductos() {

        return productos;

    }

}