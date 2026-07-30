/*
 *================================================
 * Clase encargada de administrar el inventario
 *================================================
 */

package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Administra la colección de productos registrados
 * dentro del sistema de control de inventario.
 *
 * La clase permite agregar productos y obtener
 * la lista de productos almacenados.
 *
 * @author anmunozc
 */
public class Inventario {

    /**
     * Lista utilizada para almacenar los productos
     * registrados en el inventario.
     */
    private List<Producto> productos;

    /**
     * Construye un inventario vacío e inicializa
     * la lista de productos.
     */
    public Inventario() {

        productos = new ArrayList<>();

    }

    /**
     * Agrega un producto a la lista del inventario.
     *
     * @param producto Producto que será incorporado
     * al inventario.
     */
    public void agregarProducto(Producto producto) {

        productos.add(producto);

    }

    /**
     * Retorna la lista de productos registrados
     * en el inventario.
     *
     * @return Lista de productos almacenados.
     */
    public List<Producto> obtenerProductos() {

        return productos;

    }

}