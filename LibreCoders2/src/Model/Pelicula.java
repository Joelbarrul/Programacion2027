package Model;
import org.w3c.dom.ls.LSException;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Pelicula {

    //atributos
    private String identificador;
    private String titulo;
    public LocalDate FechaRegistro;
    public LocalDate FechaBaja;
    public LocalDateTime FechaAlquiler;
    public boolean IsAlquilada;
    private GeneroPelicula genero;

    // Constructor
    public Pelicula(String identificador, String titulo, GeneroPelicula genero) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.genero = genero;
        this.FechaRegistro = LocalDate.now();
        this.IsAlquilada = false;
        this.FechaBaja = LocalDate.now();
        this.FechaAlquiler = LocalDateTime.now();

        this.FechaRegistro = LocalDate.now();
        this.FechaAlquiler = null;
        this.FechaBaja = null;

    }

    // Getters y Setters

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public LocalDate getFechaRegistro() {
        return this.FechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return  this.FechaBaja;
    }

    public LocalDateTime getFechaAlquiler() {
        return this.FechaAlquiler;
    }

    public void mostrarInfoPelicula () {

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("--- INFORMACION DE LA PELICULA ---");
        System.out.println("identificador: " + this.identificador);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Genero: " + this.genero);
        System.out.println("¿Esta aqluilada?: " + (this.IsAlquilada ? "Si" : "No"));


        System.out.println("Fecha de registro " + this.FechaRegistro.format(formatoFecha));

        if (this.FechaAlquiler != null) {
            System.out.println("Fecha de alquiler: " + this.FechaBaja.format(formatoFechaHora));
        }

        if (this.FechaBaja != null) {
            System.out.println("Fecha de baja: " + this.FechaBaja.format(formatoFecha));
        }
        System.out.println("----------------");
    }


}
