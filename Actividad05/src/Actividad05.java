import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Actividad05 {
    public static void main(String[] args) {


        // ejercicio 1 : 1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        //palabra de la cadena en una línea distinta.
        Scanner teclado1 = new Scanner(System.in);

        System.out.println("Introducir la primera frase :");
        String cadena1 = teclado1.nextLine();

        String[] palabras = cadena1.split("");

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

        if (cadena2.equals(cadena3)) {
            System.out.println("Las cadenas son iguales");
        } else if (cadena2.equalsIgnoreCase(cadena3)) {
            System.out.println("Las frases son iguales ignorando mayusculas y minusculas");
        } else {
            System.out.println("Las frases son distintas");
        }

        System.out.println("--------------");


        // Ejercicio 3 : Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        //Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        //las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        //“Tarazón” y “Alcocer” mostrará “LIOTARALC”.

        Scanner teclado3 = new Scanner(System.in);

        System.out.print("Introduzca el nombre");
        String cadena4 = teclado3.nextLine();

        System.out.println("Introduzca el primer apellido");
        String cadena5 = teclado3.nextLine();

        System.out.println("Introduzca el segundo apellido");
        String cadena6 = teclado3.nextLine();

        String seleccionador =
                cadena4.substring(0, 3);
        cadena5.substring(0, 3);
        cadena6.substring(0, 3);

        System.out.println(seleccionador.toUpperCase());


        System.out.println("--------------");

        // Ejercicio 4 : Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        //‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        //mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
        //Nº de A's: 3
        //Nº de E's: 1
        //Nº de I's: 2
        //Nº de O's: 0
        //Nº de U's: 0

        Scanner teclado4 = new Scanner(System.in);

        System.out.println("Introduzca la primera frase");
        String frase = teclado4.nextLine();

        int aes = 0, ees = 0, ies = 0, oes = 0, ues = 0;

        for (char c : frase.toLowerCase().toCharArray()) {
            switch (c) {
                case 'a' -> aes++;
                case 'e' -> ees++;
                case 'i' -> ies++;
                case 'o' -> oes++;
                case 'u' -> ues++;
            }
        }

        System.out.println("--------------");

        // Ejercicio 5 : Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        //o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        //Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        //acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        //derecha a izquierda.
        //Por ejemplo:
        //Amigo no gima
        //Dabale arroz a la zorra el abad
        //Amo la pacífica paloma
        //A man a plan a canal Panama

        Scanner teclado5 = new Scanner(System.in);

        System.out.println("Introduzca la primera frase");
        String frase1 = teclado5.nextLine();

        String frase2 = frase1.replace(" ", "").toLowerCase();


        //Algoritmo para ver si es un palindramo
        boolean isPalindromo = true;
        int izquierda = 0;
        int derecha = frase2.length() - 1;

        while (izquierda < derecha) {
            if (frase2.charAt(izquierda) != frase2.charAt(derecha)) {
                isPalindromo = false;
                break;
            }
            izquierda++;
            derecha--;
        }
        System.out.println("La frase es un palindromo" + isPalindromo);

    }
}
