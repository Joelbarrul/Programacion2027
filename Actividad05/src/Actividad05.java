import java.util.Arrays;
import java.util.Scanner;
public class Actividad05 {
    public static void main(String[] args) {


    // ejercicio 1 : 1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        //palabra de la cadena en una línea distinta.
        Scanner teclado1 = new Scanner(System.in);

        System.out.println("Introducir la primera frase :");
        String cadena1 = teclado1.nextLine();

        String[] palabras = cadena1.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        System.out.println("--------------");



        // Ejercicio 2 : Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        //iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas
        Scanner teclado2 = new Scanner(System.in);

        System.out.println("Cadena de teclado 1");
        String cadena2 = teclado2.nextLine();

        System.out.println("Cadena de teclado 2");
        String cadena3 = teclado2.nextLine();

        if (cadena2.equalsIgnoreCase(cadena3)) {
            System.out.println("Las cadenas son iguales");
        }

    }
}
