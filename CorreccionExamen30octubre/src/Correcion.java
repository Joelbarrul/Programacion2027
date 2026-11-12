import java.util.Scanner;

public class Correcion {

        public static void main(String[] args) { // Nota: Ajustado a la firma estándar de Java

            Scanner sc = new Scanner(System.in);

            // 1. PEDIR TAMAÑO AL INICIAR (Como pedía el enunciado)
            System.out.print("Introduce la cantidad total de números a almacenar: ");
            int tamano = sc.nextInt();
            int[] numero = new int[tamano]; // Creamos el array con ese tamaño. Empezará lleno de 0.

            // Usaremos el -1 para simular una posición vacía, ya que son ints primitivos
            for(int i = 0; i < numero.length; i++) {
                numero[i] = -1;
            }

            String opcion = "0";

            do {
                // Mostramos el menú tal y como pedía el examen
                System.out.println("\n--- MENÚ COLECCIÓN ---");
                System.out.println("1. Insertar número");
                System.out.println("2. Borrar número de posición específica");
                System.out.println("3. Modificar número de posición específica");
                System.out.println("4. Estadísticas (Media, Suma, Max, Min)");
                System.out.println("5. Ampliar la colección");
                System.out.println("6. Salir");
                System.out.print("Elija una opción: ");

                opcion = sc.next(); // Leemos la opción

                switch (opcion) {
                    case "1": // INSERTAR
                        System.out.print("¿Qué número quieres insertar?: ");
                        int numInsertar = sc.nextInt();
                        // Buscamos el primer hueco libre (que tenga un -1)
                        boolean insertado = false;
                        for (int i = 0; i < numero.length; i++) {
                            if (numero[i] == -1) {
                                numero[i] = numInsertar;
                                System.out.println("Número guardado en la posición " + i);
                                insertado = true;
                                break; // Frenamos el for para no rellenar todo el array con el mismo número
                            }
                        }
                        if (!insertado) {
                            System.out.println("¡Colección llena! Tienes que ampliarla primero.");
                        }
                        break; // ¡Importante para no saltar al caso 2!

                    case "2": // BORRAR POSICIÓN
                        System.out.print("¿De qué posición quieres borrar el número? (0 a " + (numero.length-1) + "): ");
                        int posBorrar = sc.nextInt();
                        if (posBorrar >= 0 && posBorrar < numero.length) {
                            numero[posBorrar] = -1; // Lo volvemos a dejar "vacío"
                            System.out.println("Posición borrada.");
                        } else {
                            System.out.println("Posición no válida.");
                        }
                        break;

                    case "3": // MODIFICAR POSICIÓN
                        System.out.print("¿Qué posición deseas modificar?: ");
                        int posMod = sc.nextInt();
                        if (posMod >= 0 && posMod < numero.length) {
                            System.out.print("Introduce el nuevo valor: ");
                            numero[posMod] = sc.nextInt();
                            System.out.println("Posición modificada con éxito.");
                        } else {
                            System.out.println("Posición fuera de rango.");
                        }
                        break;

                    case "4": // ESTADÍSTICAS (Agrupadas para cumplir el enunciado)
                        int suma = 0;
                        int contadorNoNulos = 0;
                        int maximo = Integer.MIN_VALUE; // Empezamos con el número más bajo posible
                        int minimo = Integer.MAX_VALUE; // Empezamos con el número más alto posible

                        for (int i = 0; i < numero.length; i++) {
                            if (numero[i] != -1) { // Solo contamos los valores "no nulos" (diferentes de -1)
                                suma = suma + numero[i];
                                contadorNoNulos++;

                                // Lógica real de Máximo y Mínimo
                                if (numero[i] > maximo) { maximo = numero[i]; }
                                if (numero[i] < minimo) { minimo = numero[i]; }
                            }
                        }

                        if (contadorNoNulos > 0) {
                            double media = (double) suma / contadorNoNulos;
                            System.out.println("-> Media de valores no nulos: " + media);
                            System.out.println("-> Suma de todos los valores: " + suma);
                            System.out.println("-> Máximo de la colección: " + maximo);
                            System.out.println("-> Mínimo de la colección: " + minimo);
                        } else {
                            System.out.println("La colección está vacía. No hay estadísticas.");
                        }
                        break;

                    case "5": // AMPLIAR LA COLECCIÓN
                        System.out.print("¿Cuántas posiciones quieres añadir a la colección?: ");
                        int ampliacion = sc.nextInt();

                        // Creamos el array nuevo más grande
                        int[] nuevoArray = new int[numero.length + ampliacion];

                        // Pasamos los datos del viejo al nuevo usando tu lógica de bucle clásico
                        for (int i = 0; i < numero.length; i++) {
                            nuevoArray[i] = numero[i];
                        }
                        // Rellenamos los nuevos huecos con -1
                        for (int i = numero.length; i < nuevoArray.length; i++) {
                            nuevoArray[i] = -1;
                        }

                        numero = nuevoArray; // Ahora "numero" es el array grande
                        System.out.println("Colección ampliada. Nuevo tamaño total: " + numero.length);
                        break;

                    case "6":
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } while (!opcion.equals("6"));
        }
    }

