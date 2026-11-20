import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Solutions {
    public static void main(String[] args) {
        Map<String, Double> productos = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        Scanner sc = new Scanner(System.in);

        productos.put("pan", 1.20);
        productos.put("leche", 0.95);
        productos.put("huevos", 2.50);
        productos.put("café", 3.80);
        productos.put("galletas", 4.50);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        double total = 0;
        while (true) {

            LocalDateTime ahora = LocalDateTime.now();
            String ticket = ahora.format(formato);

            System.out.println("¿Que productos desea buscar? (Escribe 'salir' para cerrar)");
            String producto = sc.nextLine().toLowerCase().trim();

            System.out.println("has buscado: " + producto);

            if (producto.equalsIgnoreCase("Salir")) {
                System.out.println("\n====================");
                System.out.println("TOTAL A PAGAR:" + total + "€");
                System.out.println("Gracia por su compra. Cerrando Caja...");
                break;
            }

            if (producto.isEmpty()) {
                System.out.println("Error: No esta eligiendo ningun producto.");
            } else if (productos.containsKey(producto)) {
                double precio = productos.get(producto);

                total += precio;

                System.out.println("--- TICKET DE CONSULTA ---");
                System.out.println("Fecha: " + ticket);
                System.out.println("Producto: " + producto);
                System.out.println("Precio: " + precio + "€");
                System.out.println("Subtotal acumulado: " + total + "€");
            } else {
                System.out.println("Lo sentimos, no tenemos este producto, Escoja otro");
            }
        }
    }
}

