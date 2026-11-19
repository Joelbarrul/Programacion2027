import model.Movimiento;
import java.util.Scanner;

public class DawBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("===BIENVENIDO A DAWBANK===");
        String iban = "";

        while (true) {
            System.out.println("Introduce el IBAN de la cuenta nueva: ");
            iban = sc.nextLine().replace("", "");

            if (iban.matches("^[A-Z]{2}[0-9]{20}$")) {
                System.out.println("Iban Valido");
                break;
            } else {
                System.out.println("Error : El iban debe empezar por 2 letras y tener 22 digitos(has puesto" + iban.length() + ").\n");
            }
        }
        System.out.println("Introduce el nombre del titular: ");
        String titular = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(iban, titular, 0.0);
        System.out.println("\n Cuenta creada con exito para " + titular + ".\n");

        int opcion = 0;
        while (opcion != 6) {
            System.out.println("---MENU DE OPCIONES---");
            System.out.println("1. Mostrar datos de la cuenta(IBAN, titular y saldo)");
            System.out.println("2. Mostrar saldo actual");
            System.out.println("3. Realizar un ingreso");
            System.out.println("4. Realizar una retirada");
            System.out.println("5. Ver el historial de movimientos");
            System.out.println("6. Salir");
            System.out.println("Selecciona una opcion: ");

            if(sc.hasNextInt()) {
                opcion = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Por favor, introduce un numero valido. \n");
                sc.nextLine();
                continue;
            }


            switch (opcion) {
                case 1:
                    System.out.println("\n=== DATOS DE LA CUENTA ===");
                    System.out.println("IBAN:" + cuenta.getiban());
                    System.out.println("Titular: " + cuenta.getTitular());
                    System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");


                    break;

                case 2:
                    System.out.println("\n Tu saldo actual es de: " + cuenta.getSaldo() + "€");
                    break;

                case 3:
                    System.out.println("\n Introduce la cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    sc.nextLine();
                    cuenta.ingresar(ingreso);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("\n Introduce la cantidad a retirar: ");
                    double retirada = sc.nextDouble();
                    sc.nextLine();
                    cuenta.retirar(retirada);
                    System.out.println();
                    break;

                case 5:
                    cuenta.mostrarMovimientos();
                    break;

                case 6:
                    System.out.println("\n Gracias por usar DawBank. Hasta pronto");
                    break;

                default:
                    System.out.println("\n Opcion no valida. Intentalo de nuevo. \n");
            }

        } sc.close();
    }
}
