/*
 *================================================
 * Clase encargada de administrar el inventario
 *================================================
 */

package modelo;


import java.util.ArrayList;
import java.util.List;

//Lista que almacena los productos del inventario
public class Inventario {


    private List<Producto> productos;

// Inicializar la lista vacia de productos
    public Inventario() {

        productos = new ArrayList<>();

    }

// Agregar un producto al inventario
    public void agregarProducto(Producto producto) {

        productos.add(producto);

    }

// Obtener la lista de productos del inventario
    public List<Producto> obtenerProductos() {

        return productos;

    }

}