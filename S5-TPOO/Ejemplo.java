import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo {

    static ArrayList<String> productos = new ArrayList<>();

    public static void agregarProducto(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        productos.add(nombre);
    }

    public static void agregarProducto(String nombre, int cantidad) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero");
        }

        for (int i = 0; i < cantidad; i++) {
            productos.add(nombre);
        }
    }

    public static void mostrarProductos() {
        System.out.println("\nLista de productos:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la cantidad: ");
            int cantidad = sc.nextInt();

            agregarProducto(nombre, cantidad);

            mostrarProductos();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: debe ingresar una cantidad válida.");
        }
    }
}