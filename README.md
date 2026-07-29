# Sistema de Control de Inventario

Proyecto desarrollado en Java para gestionar productos dentro de un sistema de inventario.

El sistema permite registrar productos, organizarlos mediante categorías y almacenar su información en un archivo de texto para mantener los datos disponibles después de finalizar la ejecución del programa.

## Tecnologías utilizadas

* Java
* Visual Studio Code
* Git
* GitHub

## Estructura del proyecto

```text
Sistema-Control-Inventario
│
├── src
│   ├── app
│   │   └── Main.java
│   │
│   ├── modelo
│   │   ├── Producto.java
│   │   ├── Categoria.java
│   │   └── Inventario.java
│   │
│   └── persistencia
│       └── ArchivoInventario.java
│
├── inventario.txt
└── README.md
```

## Funcionalidades implementadas

* Organización modular mediante paquetes.
* Registro de productos.
* Clasificación de productos mediante categorías.
* Administración de productos mediante una lista.
* Persistencia de información mediante archivos de texto.
* Recuperación de los productos almacenados.
* Aplicación de buenas prácticas de programación.

## Ejecución

La aplicación se ejecuta desde la clase:

```text
src/app/Main.java
```

Durante la ejecución, el sistema crea productos, los incorpora al inventario, almacena su información en el archivo `inventario.txt` y posteriormente recupera los datos para mostrarlos por consola.

## Autor

anmunozc
