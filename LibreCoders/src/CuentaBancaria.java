import model.Movimiento;

import java.lang.ref.PhantomReference;

public class CuentaBancaria {


    // 1. CONSTANTES ( IGUAL PARA TODAS LAS CUENTAS SIN CAMBIAR)
    public static final double LIMITE_NEGATIVO = -50.0;
    public static final double LIMITE_HACIENCA = 3000.0;

    //Atributos de la clase

    public String iban;
    private String titular;
    private double saldo = 0.0;


    // Atributos con un maximo historico para simplificar
    private Movimiento[] movimientos;
    private int nMovimientosActuales;
    private final int movimientosIniciales = 100;


    // Constructor
    public CuentaBancaria(String iban, String titular, double saldo){
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;

        this.movimientos = new Movimiento[this.movimientosIniciales];
        this.nMovimientosActuales = 0;
    }
    // Ingresar Dinero
    public void ingresar(double cantidad) {
        if (cantidad > 0) {

            if (cantidad > 3000) {
                System.out.println("Aviso : Notificar a hacienda");
            }

            this.saldo += cantidad;
            int nuevoId = this.nMovimientosActuales + 1;
            this.movimientos[this.nMovimientosActuales] = new Movimiento( "Ingreso", cantidad, nuevoId);
            this.nMovimientosActuales++;

        } else {
            System.out.println("Error: El ingreso debe ser superior a cero.");
        }
    }

    // retirar Dinero

        public void retirar(double cantidad) {

        if (cantidad > 0) {

            if (this.saldo - cantidad >= -50) {

            }
            if (cantidad > 3000) {
                System.out.println("Aviso: Notificar a Hacienda");
            }

            this.saldo -= cantidad;

            int nuevoID = this.nMovimientosActuales + 1;
            this.movimientos[this.nMovimientosActuales] = new Movimiento( "Retirada", cantidad, nuevoID);
            this.nMovimientosActuales++;

            if (this.saldo < 0) {
                System.out.println("Aviso: Saldo negativo");
            }
        } else {
            System.out.println("Error : operacion denegada. El saldo no se puede retirar");
            }
        }

        public void mostrarMovimientos() {
            if (this.nMovimientosActuales == 0) {
                System.out.println("No se ha realizado ningun movimiento en esta cuenta todavia");
                return;
            }

            System.out.println("\n--- HISTORIAL DE MOVIMIENTOS ---");
            for (int i = 0; i < this.nMovimientosActuales; i++) {
                Movimiento m = this.movimientos[i];
                System.out.println("ID: " + m.getid() + " fecha: " + m.getFecha() + " tipo: " + m.gettipo() + " Cantidad: " + m.getCantidad() + "€");
            }
            System.out.println("---------------------------\n");
        }

        public static boolean validarlongitudIBAN (String iban) {

        if (iban == null) {
            System.out.println("Por favor, su IBAN tiene que tener exactamente 22 caracteres");
            return false;
        }

            String ibanLimpio = iban.replace(" ", "");


            return ibanLimpio.length() == 22;
        }

        // Getters y Setters de nuestros atributos

        public String getiban() {
        return this.iban;
        }

        public String getTitular() {
        return this.titular;
        }

        public double getSaldo() {
        return this.saldo;
        }

    }

