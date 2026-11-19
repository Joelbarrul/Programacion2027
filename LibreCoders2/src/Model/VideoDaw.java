package Model;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class VideoDaw {
    // Atributos
    private String cif;
    public  String direccion;
    public LocalDate FechaAlta;
    public Pelicula[] PeliculasRegistradas;
    private Cliente[] ClientesRegistrados;


    public VideoDaw (String cif, String direccion) {
        this.cif = cif;
        this.direccion = direccion;
        this.FechaAlta = LocalDate.now();
        this.PeliculasRegistradas = new Pelicula[10];
        this.ClientesRegistrados = new Cliente[10];
    }

    //Getters y setters

    public String getCif() {
        return this.cif;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaAlta() {
        return this.FechaAlta;
    }

    public Pelicula[] getPeliculasRegistradas() {
        return this.PeliculasRegistradas;
    }

    public Cliente[] getClientesRegistrados() {
        return this.ClientesRegistrados;
    }


    public void mostrarinfoVideoCLub() {

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("--- INFORMACION DEL VIDEOCLUB ---");
        System.out.println("cif: " + this.cif);
        System.out.println("direccion: " + this.direccion);
        System.out.println("FechaAlta: " + this.FechaAlta.format(formatoFecha));
        System.out.println("Peliculas Registradas: " + this.PeliculasRegistradas);
        System.out.println("Clientes Registrados: " + this.ClientesRegistrados);
    }

    public void mostrarPeliculasRegistradas() {
        System.out.println("--- PELICULAS REGISTRADAS POR" + this.cif.toUpperCase() + "----");

        boolean PeliculasRegistradas = false;

        for (int i = 0; i < this.PeliculasRegistradas.length; i++) {
            if (this.PeliculasRegistradas[i] != null) {
                this.PeliculasRegistradas[i].mostrarInfoPelicula();
                PeliculasRegistradas = true;
            }
        }

        if (!PeliculasRegistradas) {
            System.out.println("No Hay peliculas registradas");
        }
    }

    public void mostrarClientesRegistrados() {
        System.out.println("--- CLIENTES REGISTRADOS POR" + this.cif.toUpperCase() + "----");

        boolean ClientesRegistrados = false;

        for (int i = 0; i < this.ClientesRegistrados.length; i++) {
            if (this.ClientesRegistrados[i] != null) {
                this.ClientesRegistrados[i].mostrarinfoCliente();
                ClientesRegistrados = true;
            }
        }

        if (!ClientesRegistrados) {
            System.out.println("No hay Clientes registrados");
        }
    }

    public boolean alquilarPelicula(Pelicula p, Cliente c) {

        if (p == null || c == null) {
            System.out.println("Error: La pelicula o el cliente no existen");
            return false;
        }

        if (p.IsAlquilada) {
            System.out.println("Error: La pelicula ya esta alquilada");
            return false;
        }

        Pelicula[] pelisCliente = c.getPeliculasAlquiladas();
        for (int i = 0; i < pelisCliente.length; i++) {
            if (pelisCliente[i] == null) {
                pelisCliente[i] = p;
                p.IsAlquilada = true;
                p.FechaAlquiler = LocalDateTime.now();
                System.out.println("Pelicula alquilada correctamente");
                return true;
            }
        }
        System.out.println("El cliente no tiene espacio para alquilar mas peliculas");
        return false;
    }

    public boolean devolverPelicula(Pelicula p, Cliente c) {

        if (p == null || c == null) {
            System.out.println("Error: La pelicula o el cliente no existen");
            return false;
        }

        if (p.IsAlquilada) {
            System.out.println("Error: La pelicula ya esta alquilada");
            return false;
        }
        Pelicula[] pelisCliente = c.getPeliculasAlquiladas();
        for (int i = 0; i < pelisCliente.length; i++) {
            if (pelisCliente[i] != null && pelisCliente[i].equals(p)) {

                long horasTranscurridas = ChronoUnit.HOURS.between(p.FechaAlquiler, LocalDateTime.now());
                if (horasTranscurridas > 48) {
                    System.out.println("ADVERTENCIA: Se ha excedido el tiempo maximo de 48 horas (" + horasTranscurridas + "horas).");
                }

                pelisCliente[i] = null;

                p.IsAlquilada = false;
                p.FechaAlquiler = null;

                System.out.println("Pelicula devuelta correctamente.");
                return true;
            }
        }

        System.out.println("Error: este cliente no tiene alquilada esa pelicula");
        return false;
    }

    public  boolean darBajaCliente(Cliente c) {

        if (c == null) {
            System.out.println("Error: El cliente no existe.");
            return false;
        }

        if (c.getFechabaja() != null) {
            System.out.println("Este cliente ya estaba dado de baja desde el " + c.getFechabaja());
            return false;
        }

        Pelicula[] pelisCliente = c.getPeliculasAlquiladas();
        for (int i = 0; i < pelisCliente.length; i++) {
            if (pelisCliente[i] != null) {
                System.out.println("Error: No se puede dar de baja al cliente porque tiene peliculas sin devolver");
                return false;
            }
        }

        for (int i = 0; i < this.ClientesRegistrados.length; i++) {
            if (this.ClientesRegistrados[i] != null && this.ClientesRegistrados[i].equals(c)) {
                c.Fechabaja = LocalDate.now();
                System.out.println("Cliente " + c.getNombre() + "dado de baja correctamente");
                return true;
            }
        }

        System.out.println("Error: El cliente no esta registrado en este videoclub.");
        return false;
    }

    public boolean darBajapelicula(Pelicula p) {
        if (p == null) {
            System.out.println("Error: La pelicula no existe.");
            return false;
        }

        if (p.IsAlquilada) {
            System.out.println("error: No se puede dar de baja una pelicula que esta alquilada");
            return false;
        }

        if (p.getFechaBaja() != null) {
            System.out.println("Error: Esta pelicula ya estaba dada de baja. ");
            return false;
        }

        for (int i = 0; i < this.PeliculasRegistradas.length; i++) {
            if (this.PeliculasRegistradas[i] != null && this.PeliculasRegistradas[i].equals(p)) {
                p.FechaBaja = LocalDate.now();
                System.out.println("Pelicula dada de baja correctamente.");
                return true;
            }
        }
        System.out.println("Error: la pelicula no esta registrada en este videoclub");
        return false;
    }


    public boolean registrarCliente(Cliente c) {

        if (c == null) {
            System.out.println("Error: El cliente no es valido");
            return false;
        }

        for (int i = 0; i < this.ClientesRegistrados.length; i++) {
            if (this.ClientesRegistrados[i] != null) {
                if (this.ClientesRegistrados[i].getDni().equalsIgnoreCase(c.getDni())) {
                    System.out.println("Error: Ya existe un cliente registrado con el DNI " + c.getDni());
                    return true;
                }
            }
        }

        System.out.println("Error: No queda espacio para registrar mas clientes en el videoclub");
        return false;
    }

    public boolean registrarPelicula(Pelicula p) {
        if (p == null) {
            return false;
        }

        for (int i = 0; i < this.PeliculasRegistradas.length; i++) {
            if (this.PeliculasRegistradas[i] != null && this.PeliculasRegistradas[i].getIdentificador().equalsIgnoreCase(p.getIdentificador())) {
                System.out.println("Error: Ya existe una pelicula con ese codigo");
                return false;
            }
        }

        for (int i = 0; i < this.PeliculasRegistradas.length; i++) {
            if (this.PeliculasRegistradas[i] == null) {
                this.PeliculasRegistradas[i] = p;
                System.out.println("Pelicula registrada correctamente");
                return true;
            }
        }
        // Ampliamos el Array de las peliculas Sumandole 10 pero quitando las otras
        int posicionNueva = this.PeliculasRegistradas.length;
        this.PeliculasRegistradas = Arrays.copyOf(this.PeliculasRegistradas, this.PeliculasRegistradas.length + 10);
        this.PeliculasRegistradas[posicionNueva] = p;

        System.out.println("Capacidad ampliada (+10). Pelicula registrada correctamente");
        return true;

    }
    public Pelicula buscarPeliculaPorCodigo(String cod) {
        for (int i = 0; i < this.PeliculasRegistradas.length; i++) {
            if (this.PeliculasRegistradas[i] != null && this.PeliculasRegistradas[i].getIdentificador().equalsIgnoreCase(cod)) {
                return this.PeliculasRegistradas[i];
            }
        }
        return null;
    }

    public Cliente buscarClientePorDNI(String dni) {
        for (int i = 0; i < this.ClientesRegistrados.length; i++) {
            if (this.ClientesRegistrados[i] != null && this.ClientesRegistrados[i].getDni().equalsIgnoreCase(dni)) {
                return this.ClientesRegistrados[i];
            }
        }
        return null;
    }




}
