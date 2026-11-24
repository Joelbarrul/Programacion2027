import java.time.LocalDate;
import java.time.LocalDateTime;

public class Libro extends Producto{

    private String ISBN;
    private String Autor;
    private String editorial;
    private LocalDate fechaPublicacion;
    private int nPaginas;

    public Libro(String codigo, String nombre, String descripcion, double precio, String ISBN, String autor, String editorial,
                 LocalDate fechaPublicacion, int nPaginas) {
        super(codigo, nombre, descripcion, precio);
        this.ISBN = ISBN;
        Autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.nPaginas = nPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    @Override
    public double obtenerDescuento() {
        return 20;
    }

    @Override
    public String obtenerCalificacion() {
        return "";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Libro{");

        sb.append("ISBN='").append(ISBN).append("\n");
        sb.append("Autor='").append(Autor).append("\n");
        sb.append("editorial='").append(editorial).append("\n");
        sb.append("fechaPublicacion=").append(fechaPublicacion).append("\n");
        sb.append("nPaginas=").append(nPaginas).append("\n");

        return sb.toString();
    }
}
