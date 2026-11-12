import java.util.Arrays;
import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {


        // Ejercicio 14 : Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
        //valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
        //muestre por pantalla.
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elige una opción: ");
            opcion = teclado.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer número:");
                    int num1 = teclado.nextInt();
                    System.out.println("Introduce el segundo número");
                    int num2 = teclado.nextInt();

                    int suma = num1 + num2;
                    System.out.println("El resultado es: " + suma);
                    break;

                case 2:
                    System.out.println("Introduce el primer número:");
                    int numResta1 = teclado.nextInt();
                    System.out.println("Introduce el segundo número");
                    int numResta2 = teclado.nextInt();

                    int resta = numResta1 - numResta2;
                    System.out.println("El resultado es:" + resta);

                case 3:
                    System.out.println("Introduce el primer número:");
                    int numMult1 = teclado.nextInt();
                    System.out.println("Introduce el segundo número");
                    int numMult2 = teclado.nextInt();

                    int multiplicacion = numMult1 * numMult2;
                    System.out.println("El resultado es :" + multiplicacion);

                case 4:
                    System.out.println("Introduce el primer número:");
                    int numDiv1 = teclado.nextInt();
                    System.out.println("Introduce el segundo número");
                    int numDiv2 = teclado.nextInt();

                    if (numDiv2 == 0) {
                        System.out.println("Error: No se puede dividir entre cero");
                    } else {
                        int divison = numDiv1 / numDiv2;
                        System.out.println("El resultado es:" + divison);
                    }
                    break;
            }
        } while (opcion != 5);
    }
}

