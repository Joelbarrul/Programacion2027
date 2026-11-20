import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solutions2 {
    public static void main(String[] args) {
        Map<String, Double> productos = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        Scanner sc = new Scanner(System.in);

        productos.put("Pan", 1.20);
        productos.put("Leche", 1.20);
        productos.put("Huevos", 1.20);
        productos.put("Café", 1.20);

        double total = 0;
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("\n--- MENÚ DE LA TIENDA ---");
            System.out.println("1. Ver todos los productos");
            System.out.println("2. Comprar un producto");
            System.out.println("3. Ver el total acumulado");
            System.out.println("4. Pagar y salir");
            System.out.println("Elige una opción 1-4 :");

            String opcion = sc.nextLine().trim();

            switch (opcion) {

                case "1":
                    System.out.println("\n--- CATALOGO ---");
                    for (String nombre : productos.keySet()) {
                        System.out.println("- " + nombre + productos.get(nombre) + "€");
                    } break;

                case "2":
                    System.out.println("¿Que producto va a comprar?: ");
                    String producto = sc.nextLine().trim();

                    if (productos.containsKey(producto)) {
                        double precio = productos.get(producto);
                        total += precio;
                        System.out.println("Añadido: " + producto + "(" + precio + "€");
                    } else {
                        System.out.println("Lo sentimos, no tenemos este producto");
                    }
                    break;

                    
            }
        }
    }
}
