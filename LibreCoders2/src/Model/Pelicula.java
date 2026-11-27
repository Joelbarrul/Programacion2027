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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("identificador='").append(identificador).append("\n");
        sb.append("titulo='").append(titulo).append("\n");
        sb.append("FechaRegistro=").append(FechaRegistro).append("\n");
        sb.append("FechaBaja=").append(FechaBaja).append("\n");
        sb.append("FechaAlquiler=").append(FechaAlquiler).append("\n");
        sb.append("IsAlquilada=").append(IsAlquilada).append("\n");
        sb.append("genero=").append(genero).append("\n");
        return sb.toString();
    }

    public String mostrarInfoPelicula () {

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

         String mostrarinfopelicula = "--- MOSTRAR INFO DE PELICULA--- \n";
         mostrarinfopelicula += "identificador: " + this.identificador + "\n";
         mostrarinfopelicula += "titulo: " + this.titulo + "\n";
         mostrarinfopelicula += "Fecha de registro: " + this.FechaRegistro.format(formatoFecha) + "\n";


        if (this.FechaAlquiler != null) {
            mostrarinfopelicula += "Fecha de alquiler: " + this.FechaAlquiler.format(formatoFechaHora) + "\n";
        }

        if (this.FechaBaja != null) {
            mostrarinfopelicula += "Fecha de baja: " + this.FechaBaja.format(formatoFecha) + "\n";
        }
        mostrarinfopelicula += "----------------";
        return mostrarinfopelicula;
    }


}
