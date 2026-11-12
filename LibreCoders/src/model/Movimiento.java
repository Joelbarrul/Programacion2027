package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

    private int id;
    public String Fecha;
    private String tipo;
    private double cantidad;

    public Movimiento(String tipo, double cantidad, int id){
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.id = id;

        LocalDateTime hoy = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.Fecha = hoy.format(formato);
    }
    public String gettipo() {
        return this.tipo;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public String getFecha() {
        return this.Fecha;
    }

    public int getid() {
        return this.id;
    }
}
