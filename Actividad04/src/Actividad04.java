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

        //  Ejercicio 3 : Crea un programa que pida diez números reales por teclado, los almacene en un array,
        // y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla

        Scanner teclado2 = new Scanner(System.in);

        double[] numeros2 = new double[10];
        double maximo = numeros[0];
        double minimo = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            if (numeros[i] > minimo) {
                minimo = numeros[i];
            }

        }

        System.out.println("------------------------");

        // Ejercicio 4 : Crea un programa que pida veinte números enteros por teclado, los almacene en un
        //array y luego muestre por separado la suma de todos los valores positivos y negativos

        Scanner teclado3 = new Scanner(System.in);

        // 1. Array de 20 enteros (int)
        int[] numeros3 = new int[20];

        // 2. Huchas para acumular las sumas, ¡empiezan vacías (en 0)!
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        // 3. Bucle para PEDIR los datos (te faltaba esta parte en tu código)
        System.out.println("Por favor, introduce 20 números enteros (pueden ser positivos o negativos):");
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            numeros3[i] = teclado3.nextInt(); // Guardamos el entero

        }

        // 4. Bucle para RECORRER y CLASIFICAR
        for (int i = 0; i < numeros3.length; i++) {

            // Si el número es mayor que 0, va a la hucha de los positivos
            if (numeros3[i] < 0) {
                sumaPositivos = sumaPositivos + numeros3[i];
            }

            // Si el número es menor que 0, va a la hucha de los negativos
            else if (numeros3[i] < 0) {
                sumaNegativos = sumaNegativos + numeros3[i];
            }
            // Nota: Si es 0, no hace falta sumarlo a ningún lado porque no aporta valor
        }

        // 5. Mostrar los resultados por separado
        System.out.println("\n--- Resultado de las Sumas---");
        System.out.println("Suma de todos los valores positivos: " + sumaPositivos);
        System.out.println("Suma de todos los valores negativos: " + sumaNegativos);


        System.out.println("------------------------");


        // Ejercicio 5:  Crea un programa que pida veinte números reales por teclado, los almacene en un array
        //y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.

        





    }
}
