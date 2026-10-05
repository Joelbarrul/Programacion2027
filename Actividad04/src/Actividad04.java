import java.util.Scanner;
public class Actividad04 {
    public static void main(String[] args) {

        // 1.Ejercicio : Crea un programa que pida diez números reales por teclado, los almacene en un array,
        //y luego muestre todos sus valores.

        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];

        // Este bucle se va a repetir 10 veces (desde i=0 hasta i=9)
        for (int i = 0; i < 10; i++) {
            System.out.println("Intrduce el numero para la posicion " + i + ":");

            // Leemos el número real del teclado y lo metemos en la casilla actual (i)
            numeros[i] = teclado.nextDouble();

        }

        System.out.println("Los numeros guardados en el array son:");

        // // Recorremos otra vez las casillas de la 0 a la 9
        for (int i = 0; i < 10; i++) {
            // Imprimimos lo que hay dentro de la casilla 'i'
            System.out.println("Posicion" + i + numeros[i]);

        }

        System.out.println("------------------------");

        // 2.Ejercicio : Crea un programa que pida diez números reales por teclado, los almacene en un array,
        //y luego muestre la suma de todos los valores

        Scanner teclado1 = new Scanner(System.in);

        double[] numeros1 = new double[10];

        // Es double porque el array tiene decimales. Si fuera de enteros, sería int.
        double suma = 0.0;

        // PASO 2: Recorremos el array de principio a fin.
        // Usamos .length para que sirva para CUALQUIER tamaño de array (10, 20 o 100).

        for (int i = 0; i < numeros.length; i++) {


            // PASO 3: Sumamos el valor de la casilla actual a nuestra hucha.
            suma = suma + numeros[i];


        }

        // Al salir del bucle, la variable 'suma' ya tiene el total.
        System.out.println("La suma total es:" + suma);


        System.out.println("------------------------");

        // Crea un programa que pida diez números reales por teclado, los almacene en un array,
        // y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla



    }
}
