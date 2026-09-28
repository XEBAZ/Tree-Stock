/**
 * Clase ArbolInventario (Lógica de la Estructura de Datos).
 * Implementa un Árbol Binario de Búsqueda (BST) ordenado por el ID del producto.
 */
public class ArbolInventario {
 private Producto raiz;
 public ArbolInventario() {
 this.raiz = null;
 }
 /**
 * Método público para insertar un nuevo producto.
 * Evita la duplicación de IDs.
 */
 public boolean insertar(int id, String nombre) {
 if (buscar(id) != null) {
 return false; // ID duplicado
 }
 this.raiz = insertarRecursivo(this.raiz, id, nombre);
 return true;
 }
 /**
 * Método privado RECURSIVO para ubicar productos por ID.
 */
 private Producto insertarRecursivo(Producto actual, int id, String nombre) {
 // Caso base: se encontró la posición nula para insertar
 if (actual == null) {
 return new Producto(id, nombre);
 }
 // Criterio de ordenación de Árbol Binario de Búsqueda
 if (id < actual.getId()) {
 actual.setIzquierdo(insertarRecursivo(actual.getIzquierdo(), id, nombre));
 } else if (id > actual.getId()) {
 actual.setDerecho(insertarRecursivo(actual.getDerecho(), id, nombre));
 }
 return actual;
 }
 /**
 * Método público para ejecutar el Recorrido Inorden.
 */
 public void recorridoInorden() {
 if (this.raiz == null) {
 System.out.println("⚠️ El inventario está vacío.");
 return;
 }
 System.out.println("\n==================================================");
 System.out.println(" LISTADO DE INVENTARIO (RECORRIDO INORDEN POR ID) ");
 System.out.println("==================================================");
 recorridoInordenRecursivo(this.raiz);
 System.out.println("--------------------------------------------------");
 }
 
 /**
  * Método privado RECURSIVO: Izquierda -> Raíz -> Derecha.
  * Garantiza listar los elementos de forma ascendente por ID.
  */
 private void recorridoInordenRecursivo(Producto nodo) {
     if (nodo != null) {
         recorridoInordenRecursivo(nodo.getIzquierdo());
         System.out.println(nodo);
         recorridoInordenRecursivo(nodo.getDerecho());
     }
 }

 /**
  * Método público para buscar un producto por ID.
  */
 public Producto buscar(int id) {
     return buscarRecursivo(this.raiz, id);
 }

 /**
  * Método privado RECURSIVO para buscar un ID en el árbol.
  */
 private Producto buscarRecursivo(Producto actual, int id) {
     // Casos base: árbol/rama vacía o elemento encontrado
     if (actual == null || actual.getId() == id) {
         return actual;
     }
     // Búsqueda binaria
     if (id < actual.getId()) {
         return buscarRecursivo(actual.getIzquierdo(), id);
     } else {
         return buscarRecursivo(actual.getDerecho(), id);
     }
 }
}