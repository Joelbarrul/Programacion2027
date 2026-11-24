public abstract class Producto {

    //PRIMERO: UNA CLASE ABSTRACTA NO PUEDE INSTANCIARSE (NO SE USA CONSTRUCTOR)
    // SEGUNDO: PODEMOS DEFINIR METODOS ABSTRACTOS Y METODOS NORMALES

    protected String codigo;
    protected String nombre;
    protected String descripcion;
    protected double precio;


    // no se usa en otras clases, solo para llamarlo como super()
    public Producto(String codigo, String nombre, String descripcion, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }
        public String getCodigo() {
        return this.codigo;
        }

        public String getDescripcion() {
        return this.descripcion;
        }

        public double getPrecio() {
        return this.precio;
        }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double obtenerDescuento();

    public abstract String obtenerCalificacion();


    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder();
        sb.append("Codigo: ").append(this.codigo).append("\n");
        sb.append("Nombre: ").append(this.nombre).append("\n");
        sb.append("Descripcion: ").append(this.descripcion).append("\n");
        sb.append("Precio: ").append(this.precio).append("\n");
        return sb.toString();
    }


}
