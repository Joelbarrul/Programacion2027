import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Model.Cliente;
import Model.GeneroPelicula;
import Model.Pelicula;
import Model.VideoDaw;

public class GestionVideoDaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoDaw videoclub = null;
        int opcion = 0;

        do {
            System.out.println("\n===== GESTION VIDEODAW =====");
            System.out.println("1. Crear y registrar VideoClub en la franquicia");
            System.out.println("2. Registrar película en videoclub");
            System.out.println("3.Crear y registrar cliente en videoclub");
            System.out.println("4. Alquilar película");
            System.out.println("5. Devolver pelicula");
            System.out.println("6. Dar de baja cliente");
            System.out.println("7. Dar de baja película");
            System.out.println("8. Salir");
            System.out.println("Elige una opcion: ");

            opcion = Integer.parseInt((sc.nextLine()));

            if (opcion >= 2 && opcion <= 7 && videoclub == null) {
                System.out.println("Error: Primero debes crear un VideoClub (Opcion 1)");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el CIF del videoClub (Ej: B12345678):");
                    String cif = sc.nextLine();
                    while (!validarCIF(cif)) {
                    System.out.println("CIF no valido. Introducelo de nuevo: ");
                    cif = sc.nextLine();
                    }

                    System.out.println("introduce la direccion del VideoClub");
                    String dirVideo = sc.nextLine();

                    videoclub = new VideoDaw(cif, dirVideo);
                    System.out.println("videoClub creado y registrado correctamente");
                    break;

                case 2:
                    System.out.println("Introduce el codigo de la pelicula (ej. 12345678A): ");
                    String codPeli = sc.nextLine();
                    System.out.println("Introduce el titulo: ");
                    String titulo = sc.nextLine();

                    System.out.println("Generos disponibles: ");
                    for (GeneroPelicula g : GeneroPelicula.values()) {
                        System.out.println("- " + g);
                    }
                    System.out.println("Escribe el genero exactamente como aparece arriba: ");
                    GeneroPelicula Genero = GeneroPelicula.valueOf(sc.nextLine().toUpperCase());

                    Pelicula nuevaPeli = new Pelicula(codPeli, titulo, Genero);
                    videoclub.registrarPelicula(nuevaPeli);
                    break;

                case 3:
                    System.out.println("Introduce el DNI del cliente (ej. 12345678A):");
                    String dni = sc.nextLine();
                    while (!validarDNI(dni)) {
                        System.out.println("DNI no valido. Introducelo de nuevo");
                        dni = sc.nextLine();
                    }

                    System.out.print("Introduce el nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Introduce el numero de socio: ");
                    String numSocio = sc.nextLine();
                    System.out.print("Introduce la direccion: ");
                    String dirCliente = sc.nextLine();

                    System.out.print("Introduce la fecha de nacimiento (dd/MM/yyyy): ");
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fechaNac = LocalDate.parse(sc.nextLine(), formato);

                    if (Period.between(fechaNac, LocalDate.now()).getYears() < 18) {
                        System.out.println("Error: el cliente debe ser mayor de edad");
                    } else {
                        Cliente nuevoCliente = new Cliente(dni, nombre, numSocio, dirCliente, fechaNac);
                        videoclub.registrarCliente(nuevoCliente);
                    }
                    break;

                case 4:
                    videoclub.mostrarPeliculasRegistradas();
                    System.out.print("Introduce el código de la pelicula a alquiler: ");
                    Pelicula peliAlquiler = videoclub.buscarPeliculaPorCodigo(sc.nextLine());

                    videoclub.mostrarClientesRegistrados();
                    System.out.print("Introduce el DNI del cliente que alquila: ");
                    Cliente clienteAlquila = videoclub.buscarClientePorDNI(sc.nextLine());

                    videoclub.alquilarPelicula(peliAlquiler, clienteAlquila);
                    break;

                case 5:
                    videoclub.mostrarClientesRegistrados();
                    System.out.print("INtroduce el DNI del cliente que devuelve: ");
                    Cliente clienteDevuelve = videoclub.buscarClientePorDNI(sc.nextLine());

                    if (clienteDevuelve != null) {
                        clienteDevuelve.mostrarPeliculasAlquiladas();
                        System.out.print("Introduce el codigo de la pelicula a devolver: ");
                        Pelicula peliDevolver = videoclub.buscarPeliculaPorCodigo(sc.nextLine());


                        videoclub.devolverPelicula(peliDevolver, clienteDevuelve);
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                    break;


                case 6:
                    videoclub.mostrarClientesRegistrados();
                    System.out.print("Introduce el DNI del cliente a dar de baja: ");
                    Cliente clienteBaja = videoclub.buscarClientePorDNI(sc.nextLine());
                    videoclub.darBajaCliente(clienteBaja);
                    break;

                case 7:
                    videoclub.mostrarPeliculasRegistradas();
                    System.out.print("Introduce el codigo de la pelicula a dar de baja: ");
                    Pelicula peliBaja = videoclub.buscarPeliculaPorCodigo(sc.nextLine());
                    videoclub.darBajapelicula(peliBaja);
                    break;

                case 8:
                    System.out.println("Saliendo del programa. hasta pronto");
                    break;

                default:
                    System.out.println("Opcion no valida. Elige un numero del 1 al 8");
            }
        } while (opcion !=  8);

        sc.close();
    }

    public static boolean validarDNI(String dni) {
        return  dni != null && dni.matches("^[0-9]{8}[A-Za-z]$");
    }

    public static boolean validarCIF(String cif) {
        return cif != null && cif.matches("^[A-Za-z][0-9]{7}[0-9A-Za-z]$");
    }
}
