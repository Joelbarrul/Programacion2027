import java.util.Scanner;
public class SwitchExapmles {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el mes");
        int mes = sc.nextInt();


        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;

            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
        }

        //Sintaxis moderna
        String opcion = sc.next();
        switch(opcion) {
            case "A" -> {
                System.out.println("Lunes");
            }
            case "B" -> System.out.println("Martes");
            case "C" -> System.out.println("Martes");
            case "D" -> System.out.println("Martes");
            case "E" -> System.out.println("Martes");
                default -> System.out.println("Error: El opcion no existe");
        }
    }
}
