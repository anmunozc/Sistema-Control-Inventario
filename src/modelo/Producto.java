/*
 *================================================
 * Clase que representa un producto del inventario
 *================================================
 */

package modelo;


/**
 * Representa un producto registrado dentro del sistema
 * de control de inventario.
 */
public class Producto {


    private String codigo;
    private String nombre;
    private double precio;
    private Categoria categoria;


    /**
     * Constructor de la clase Producto.
     *
     * @param codigo Identificador del producto.
     * @param nombre Nombre comercial del producto.
     * @param precio Valor del producto.
     * @param categoria Categoría asociada al producto.
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
     * Retorna la información del producto en formato texto.
     *
     * @return Datos del producto.
     */
    @Override
    public String toString() {


        return codigo + " - "
                + nombre + " - "
                + precio + " - "
                + categoria;


    }

}