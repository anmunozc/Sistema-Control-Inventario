/*
 *================================================
 * Clase que representa un producto del inventario
 *================================================
 */

package modelo;

/**
 * Representa un producto registrado dentro del sistema
 * de control de inventario.
 *
 * <p>La clase almacena la información básica de cada producto,
 * incluyendo su código, nombre, precio y categoría.</p>
 *
 * @author anmunozc
 */
public class Producto {

    /**
     * Código único utilizado para identificar el producto.
     */
    private String codigo;

    /**
     * Nombre comercial del producto.
     */
    private String nombre;

    /**
     * Precio asociado al producto.
     */
    private double precio;

    /**
     * Categoría a la que pertenece el producto.
     */
    private Categoria categoria;

    /**
     * Construye un nuevo producto utilizando la información
     * proporcionada.
     *
     * @param codigo código único que identifica el producto.
     * @param nombre nombre comercial del producto.
     * @param precio valor o precio del producto.
     * @param categoria categoría asignada al producto.
     */
    public Producto(String codigo,
                    String nombre,
                    double precio,
                    Categoria categoria) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;

    }

    /**
     * Retorna la información del producto en formato de texto.
     *
     * @return cadena que contiene el código, nombre, precio
     *         y categoría del producto.
     */
    @Override
    public String toString() {

        return codigo + " - "
                + nombre + " - "
                + precio + " - "
                + categoria;

    }

}