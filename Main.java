import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Main (Interfaz de Usuario en Consola).
 * Gestiona la interacción con el usuario a través de un menú interactivo.
 */
public class Main {
    public static void main(String[] args) {
        ArbolInventario inventario = new ArbolInventario();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        System.out.println("==================================================");
        System.out.println(" SISTEMA DE GESTIÓN DE INVENTARIO TREE-STOCK ");
        System.out.println("==================================================");
        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero(scanner, "Seleccione una opción: ");
            switch (opcion) {
                case 1:
                    registrarProducto(inventario, scanner);
                    break;
                case 2:
                    inventario.recorridoInorden();
                    break;
                case 3:
                    buscarProducto(inventario, scanner);
                    break;
                case 0:
                case 4: // Acepta tanto 0 como 4 para salir
                    salir = true;
                    System.out.println("\nSaliendo del sistema Tree-Stock. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("\n❌ Opción no válida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

 private static void mostrarMenu() {
 System.out.println("\n----------------- MENÚ PRINCIPAL -----------------");
 System.out.println("1. Registrar Producto");
 System.out.println("2. Mostrar Inventario (Recorrido Inorden)");
 System.out.println("3. Buscar Producto por ID");
 System.out.println("0. Salir");
 System.out.println("--------------------------------------------------");
 }

 private static void registrarProducto(ArbolInventario inventario, Scanner scanner) {
 System.out.println("\n--- REGISTRAR NUEVO PRODUCTO ---");
 int id = leerEntero(scanner, "Ingrese el ID del producto (entero positivo): ");
 if (id <= 0) {
 System.out.println("❌ Error: El ID debe ser un número entero positivo mayor a 0.");
 return;
 }
 System.out.print("Ingrese el nombre del producto: ");
 String nombre = scanner.nextLine().trim();
 if (nombre.isEmpty()) {
     System.out.println("❌ Error: El nombre no puede estar vacío.");
     return;
 }
 boolean exito = inventario.insertar(id, nombre);
 if (exito) {
     System.out.println("✅ Producto '" + nombre + "' registrado exitosamente.");
 } else {
     System.out.println("❌ Error: Ya existe un producto con el ID " + id + ".");
 }
}

private static void buscarProducto(ArbolInventario inventario, Scanner scanner) {
 System.out.println("\n--- BUSCAR PRODUCTO POR ID ---");
 int id = leerEntero(scanner, "Ingrese el ID del producto a buscar: ");
 Producto producto = inventario.buscar(id);
 if (producto != null) {
     System.out.println("✅ Producto encontrado:");
     System.out.println(" -> " + producto);
 } else {
     System.out.println("❌ El producto con ID " + id + " NO existe en el inventario.");
 }
}

private static int leerEntero(Scanner scanner, String mensaje) {
 int numero = -1;
 boolean valido = false;
 while (!valido) {
     System.out.print(mensaje);
     try {
         numero = scanner.nextInt();
         scanner.nextLine(); // Limpiar el búfer del scanner
         valido = true;
     } catch (InputMismatchException e) {
         System.out.println("❌ Entrada no válida. Por favor, ingrese un número entero.");
         scanner.nextLine(); // Limpiar entrada errónea
     }
 }
 return numero;
}
}