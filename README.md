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

<img width="2559" height="1439" alt="MENU PRINCIPAL" src="https://github.com/user-attachments/assets/8c1a5313-64f3-40d7-862e-7b3308ae539e" />

2. Registro de Productos (Inserción en Árbol)
Ejemplo de registro e inserción recursiva de productos por su ID.

<img width="2558" height="1439" alt="REGISTRO PRODUCTO" src="https://github.com/user-attachments/assets/083f7738-bb41-4ceb-b5ae-f71c4e93a4ee" />


3. Mostrar Inventario (Recorrido Inorden)
Listado del inventario ordenado de menor a mayor según el ID del producto.

<img width="2559" height="1439" alt="MOSTRAR INVENTARIO" src="https://github.com/user-attachments/assets/86a7f960-3d11-4c74-b666-ebf4dd72114a" />


4. Búsqueda de Producto por ID
Demostración de búsqueda exitosa y de producto no existente.

<img width="2559" height="1439" alt="BUSQUEDA DE PRODUCTO" src="https://github.com/user-attachments/assets/8e2fbc7c-fc51-4f33-a6e5-031c8780247d" />

