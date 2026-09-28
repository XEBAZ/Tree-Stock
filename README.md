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

1. Menú Principal
Muestra la interfaz inicial interactiva del sistema.

<img width="2559" height="1439" alt="image" src="https://github.com/user-attachments/assets/72c77e20-30a8-4158-8f0c-841d6ae30dd7" />

2. Registro de Productos (Inserción en Árbol)
Ejemplo de registro e inserción recursiva de productos por su ID.

<img width="2558" height="1439" alt="image" src="https://github.com/user-attachments/assets/e07c63f8-c5c2-4ab1-b8e7-25c05f37f11c" />


3. Mostrar Inventario (Recorrido Inorden)
Listado del inventario ordenado de menor a mayor según el ID del producto.

<img width="2559" height="1439" alt="image" src="https://github.com/user-attachments/assets/37f27b93-0251-44af-a510-c50e5c30242b" />


4. Búsqueda de Producto por ID
Demostración de búsqueda exitosa y de producto no existente.

<img width="2559" height="1439" alt="image" src="https://github.com/user-attachments/assets/b3edc468-5433-49e8-b410-566a89c165cf" />

