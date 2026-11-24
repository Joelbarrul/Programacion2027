public class Pelicula extends Producto {

    private String genero;
    private int duracion;
    private String ISAN;
    private String Director;
    private String calificacionEdad;


    public Pelicula(String genero, int duracion, String ISAN, String director, String calificacionEdad, String formato, String codigo,
                    String nombre, String descripcion, double precio, double producto) {
        super(codigo, nombre, descripcion, precio);

        this.genero = genero;
        this.duracion = duracion;
        this.ISAN = ISAN;
        Director = director;
        this.calificacionEdad = calificacionEdad;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getISAN() {
        return ISAN;
    }

    public String getDirector() {
        return Director;
    }

    public String getCalificacionEdad() {
        return calificacionEdad;
    }


    public void setCalificacionEdad(String calificacionEdad) {
        this.calificacionEdad = calificacionEdad;
    }

    @Override
    public double obtenerDescuento() {
        return 10;
    }

    @Override
    public String obtenerCalificacion() {
        return this.calificacionEdad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("genero='").append(genero).append("\n");
        sb.append("duracion=").append(duracion).append("\n");
        sb.append("ISAN='").append(ISAN).append("\n");
        sb.append("Director='").append(Director).append("\n");
        sb.append("calificacionEdad='").append(calificacionEdad).append("\n");
        return sb.toString();
    }
}
