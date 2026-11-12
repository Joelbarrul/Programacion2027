import java.util.Arrays;
import java.util.Scanner;

public class ExamenUD2 {

    void main() {


        /*
        Modificar colección:
        ▪ Insertar número.
        ▪ Borrar número de una posición específica
        ▪ Modificar número de una posición específica.
        o Estadísticas de la colección:
        ▪ Media de todos los valores no nulos.
        ▪ Suma de todos los valores.
        ▪ Máximo de la colección
        ▪ Mínimo de la colección
        o Ampliar el valor de la colección.
        o Salir.
         */


        //Crea un programa que pida la cantidad total de números a almacenar al inicial el programa
        // Debe generar un menu con la siguiente estructura


        Scanner sc = new Scanner(System.in);
        int[] numero = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String opcion = "6";
        int numero1 = 0;
        int  numero2 = 0;
        double media = 0;
        int suma = 0;
        int Maximo = 0;
        int minimo = 0;
        int aumentarValor = 0;
        int eleccion = 0;

        do {

            sc = new Scanner(System.in);

            boolean borrar = false;
            if(numero != null){
                int index = -1;
                for(int i = 0; i < numero.length; i++) {
                    if(numero != null){
                        if(numero.equals(numero.length)){
                            index = i;
                            break;
                        }
                    }
                }
                if(index != -1){
                    numero = null;
                    borrar = true;
                }
            }

            System.out.println(" Inserta Un numero y recibiras las Estadisticas de la colección : ");

            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    for (int i = 0; i < numero.length; i++) {
                        suma = suma + numero[i];

                    }
                    media = (double) suma / numero.length;
                    System.out.println("La media de todos los valores es \n" + media);

                    if (eleccion < 0 || eleccion > 10){
                        System.out.println("eleccion no valida, escoja otra");
                    }
                    break;


                case "2":
                    for (int i = 0; i < numero.length; i++) {
                        suma = suma + numero[i];
                    }
                    System.out.println("La suma de todos los elementos son \n" + suma);

                case "3":
                    if (Maximo == 10) {
                        System.out.println("El maximo de la coleccion es \n " + numero[10]);
                    } else {
                        System.out.println("El anterior al maximo es \n " + numero[9]);
                    }

                case "4":
                    if (minimo == 0) {
                        System.out.println("El minimo de la coleccion es \n" + 0);
                    } else {
                        System.out.println("El anterior de la coleccion es \n" + numero[0]);
                    }
                case "5":
                    for(int i = 0; i != numero.length; i++) {
                        if (numero.length != aumentarValor) {
                            aumentarValor++;
                        }
                        break;
                    }
            }


        } while (!opcion.equalsIgnoreCase("6"));


    }
}

