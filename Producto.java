/**
 * Clase Producto (Nodo del Árbol Binario de Búsqueda).
 * Almacena los datos del producto y los punteros a los nodos hijo.
 */
public class Producto {
 private int id;
 private String nombre;
 private Producto izquierdo;
 private Producto derecho;
 // Constructor
 public Producto(int id, String nombre) {
 this.id = id;
 this.nombre = nombre;
 this.izquierdo = null;
 this.derecho = null;
 }
 // Getters y Setters
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public String getNombre() {
 return nombre;
 }
 public void setNombre(String nombre) {
 this.nombre = nombre;
 }
 public Producto getIzquierdo() {
 return izquierdo;
 }
 public void setIzquierdo(Producto izquierdo) {
 this.izquierdo = izquierdo;
 }
 public Producto getDerecho() {
 return derecho;
 }
 public void setDerecho(Producto derecho) {
 this.derecho = derecho;
 }
 @Override
 public String toString() {
 return String.format("ID: %-5d | Nombre: %s", id, nombre);
 }
}