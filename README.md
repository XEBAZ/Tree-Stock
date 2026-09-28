# 📦 Sistema de Inventario "Tree-Stock"
Este proyecto es una aplicación de consola desarrollada en **Java** para la asignatura de **Estructura de Datos**. Su objetivo principal es
---
## 🎯 Objetivo del Proyecto
Implementar una estructura de datos jerárquica (Árbol Binario de Búsqueda) dividida estrictamente en tres capas/clases operativas para gara
1. **Representación de datos (Nodo)**.
2. **Lógica de la estructura de datos (Árbol y recursividad)**.
3. **Interfaz de usuario en consola (Menú interactivo)**.
---
## 🛠️ Herramientas y Requisitos
- **Entorno de Desarrollo (IDE):** [Visual Studio Code (VS Code)](https://code.visualstudio.com/)
- **Extensión requerida:** Extension Pack for Java (Microsoft)
- **Kit de Desarrollo de Java (JDK):** [Eclipse Temurin JDK](https://adoptium.net/) (Versión 17 o superior recomendada)
---
## 📁 Estructura del Código
El proyecto está dividido estrictamente en tres clases dentro del paquete por defecto:
```text
Tree-Stock/
├── src/
│ ├── Producto.java # El Nodo: Almacena id, nombre y punteros (izquierdo, derecho)
│ ├── ArbolInventario.java # La Lógica: Operaciones recursivas (Insertar, Inorden, Buscar)
│ └── Main.java # La Interfaz: Menú interactivo en consola (switch-case)
└── README.md # Documentación del proyecto
🚀 Instrucciones de Ejecución
Opción 1: Desde Visual Studio Code
Opción 2: Desde la Terminal / Consola
cd ruta/de/tu/proyecto/Tree-Stock
javac Producto.java ArbolInventario.java Main.java
java Main
� Capturas de Pantalla de la Ejecución
(Reemplaza las rutas de las imágenes con tus capturas reales guardadas en el proyecto)
1. Menú Principal
Muestra la interfaz inicial interactiva del sistema.
2. Registro de Productos (Inserción en Árbol)
Ejemplo de registro e inserción recursiva de productos por su ID.
3. Mostrar Inventario (Recorrido Inorden)
Listado del inventario ordenado de menor a mayor según el ID del producto.
4. Búsqueda de Producto por ID
Demostración de búsqueda exitosa y de producto no existente.
