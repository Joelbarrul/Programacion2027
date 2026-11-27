package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente {

    //Atributos

    private String dni;
    public String nombre;
    public String NumSocio;
    public String direccion;
    private LocalDate fechaNacimiento;
    public LocalDate Fechabaja;
    private Pelicula[] PeliculasAlquiladas;


    public Cliente(String dni, String nombre, String numSocio, String direccion, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.NumSocio = numSocio;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.Fechabaja = null;
        this.PeliculasAlquiladas = new Pelicula[10];
    }


    // Getters Y Setters

    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumSocio() {
        return this.NumSocio;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public LocalDate getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public LocalDate getFechabaja() {
        return this.Fechabaja;
    }

    public Pelicula[] getPeliculasAlquiladas() {
        return this.PeliculasAlquiladas;
    }


    public String mostrarinfoCliente() {

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String mostrarinfocliente = "---MOSTRAR INFORMACION DEL CLIENTE--- \n";
        mostrarinfocliente += "DNI: " + this.dni + "\n";
        mostrarinfocliente += "nombre:  " + this.nombre + "\n";
        mostrarinfocliente += "NumSocio: " + this.NumSocio + "\n";
        mostrarinfocliente += "Direccion: " + this.direccion + "\n";
        mostrarinfocliente += "Fecha de nacimiento: " + this.fechaNacimiento + "\n";


        if (this.Fechabaja != null) {
            mostrarinfocliente += "Fecha de baja: " + this.Fechabaja.format(formatoFecha) + "\n";
        }
        return mostrarinfocliente;
    }

    public void mostrarPeliculasAlquiladas() {
        System.out.println("--- PELICULAS ALQUILADAS POR " + this.nombre.toUpperCase() + "----");

        boolean tienePeliculas = false;

        for (int i = 0; i < this.PeliculasAlquiladas.length; i++) {
            if (this.PeliculasAlquiladas[i] != null) {
                this.PeliculasAlquiladas[i].mostrarInfoPelicula();
                tienePeliculas = true;
            }
        }

        if (!tienePeliculas) {
            System.out.println("No tiene peliculas alquiladas");
        }
    }
}
