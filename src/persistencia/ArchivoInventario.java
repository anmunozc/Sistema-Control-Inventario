/*
*================================================
 * Clase que representa la persistencia de datos
 * ===============================================
 */

package persistencia;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ArchivoInventario {

    private String nombreArchivo;

    public ArchivoInventario(String nombreArchivo) {

        this.nombreArchivo = nombreArchivo;

    }

    // Guarda información en el archivo
    public void guardarProducto(String informacion) {

        try (FileWriter escritor = new FileWriter(nombreArchivo, true)) {

            escritor.write(informacion + "\n");

        } catch (IOException e) {

            System.out.println("Error al guardar el archivo.");

        }

    }

    // Lee el contenido del archivo
    public void leerProductos() {

        try (BufferedReader lector =
                new BufferedReader(new FileReader(nombreArchivo))) {

            String linea;

            while ((linea = lector.readLine()) != null) {

                System.out.println(linea);

            }

        } catch (IOException e) {

            System.out.println("Error al leer el archivo.");

        }

    }

}