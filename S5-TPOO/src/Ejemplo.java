import java.util.ArrayList;

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
        System.out.println("Lista de productos:");
        for (String producto : productos) {
            System.out.println("- " + producto);
        }
    }

    public static void main(String[] args) {
        try {
            agregarProducto("Arroz");
            agregarProducto("Leche", 2);
            mostrarProductos();

            agregarProducto("", 3);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}