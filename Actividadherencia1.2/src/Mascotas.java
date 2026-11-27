import java.time.LocalDate;

public abstract class Mascotas {

    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public abstract String muestra();
    public abstract String cumpleaños();
    public abstract String morir();
    public abstract String habla();
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mascotas{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        return sb.toString();
    }

    public Mascotas(String nombre, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = LocalDate.now();





    }
}
