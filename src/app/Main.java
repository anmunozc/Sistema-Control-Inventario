/*
 *================================================
 * Clase Principal del programa
 *================================================
 */

package app;

import modelo.Producto;
import modelo.Categoria;
import modelo.Inventario;
import persistencia.ArchivoInventario;

public class Main {

    public static void main(String[] args) {

        // Crear un inventario
        Inventario inventario = new Inventario();

        // Crear productos
        Producto producto1 =
                new Producto(
                        "P001",
                        "Notebook Lenovo",
                        899990,
                        Categoria.COMPUTADOR);

        Producto producto2 =
                new Producto(
                        "P002",
                        "Samsung Galaxy S24",
                        799990,
                        Categoria.TELEFONO);

        Producto producto3 =
                new Producto(
                        "P003",
                        "Mouse Logitech",
                        24990,
                        Categoria.ACCESORIO);

        // Agregar productos al inventario
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);

        // Crear el archivo de persistencia
        ArchivoInventario archivo =
                new ArchivoInventario("inventario.txt");

        // Guardar los productos en el archivo
       for (Producto producto : inventario.obtenerProductos()) {
        archivo.guardarProducto(producto.toString());
}

        System.out.println("=== PRODUCTOS GUARDADOS EN EL ARCHIVO ===");

        // Leer los productos almacenados
        archivo.leerProductos();

    }

}