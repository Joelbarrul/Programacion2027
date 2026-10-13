import java.util.Arrays;
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

        Scanner teclado4 = new Scanner(System.in);

        double[] numeros4 = new double[20];
        double suma2 = 0.0;

        System.out.println("por favor, introduce 20 numeros reales:");

        for (int i = 0; i < numeros4.length; i++) {
            System.out.println("numero" + (i + 1) + ": ");
            numeros4[i] = teclado4.nextDouble();
        }

        for (int i = 0; i < numeros4.length; i++) {
            suma2 = suma2 + numeros4[i];
        }

        double media = suma2 / numeros4.length;

        System.out.println("\n--- resultados ---");
        System.out.println("Suma total" + suma2);
        System.out.println("La media es " + media);


        System.out.println("------------------------");


        // Ejercicio 6 : Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        //N, escriba M en todas sus posiciones y lo muestre por pantalla.

        Scanner teclado5 = new Scanner(System.in);
        System.out.println("Introduce el valor de N: ");
        int N = teclado5.nextInt();

        System.out.println("Introduce el valor de M: ");
        int M = teclado5.nextInt();

        int[] miArray = new int[N];

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = M;


        }

        System.out.println("El resultado del array es: " + Arrays.toString(miArray));


        System.out.println("------------------------");


        //Ejercicio 7 : Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
        //todos los valores desde P hasta Q, y lo muestre por pantalla.

        Scanner teclado6 = new Scanner(System.in);
        System.out.println("Introduce el valor de P");
        int P = teclado6.nextInt();

        System.out.println("Introduce el valor de Q");
        int Q = teclado6.nextInt();

        int tamaño = (Q - P) + 1;
        int[] miArray1 = new int[tamaño];

        for (int i = 0; i < miArray1.length; i++) {
            miArray1[i] = P + i;
        }

        System.out.println("el array con los valores P hasta Q es :");
        System.out.println("El resultado del array es: " + Arrays.toString(miArray1));


        System.out.println("------------------------");


        //Ejercicio 8 : Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
        //utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
        //cuántos valores del array son igual o superiores a R.


        Scanner teclado7 = new Scanner(System.in);

        double[] numeros5 = new double[100];


        for (int i = 0; i < numeros5.length; i++) {
            numeros5[i] = Math.random();
        }

        System.out.println("Introduce un valor real R ( entre 0.0 y 1.0): ");
        double R = teclado.nextDouble();

        int contador = 0;

        for (int i = 0; i < numeros5.length; i++) {
            if (numeros[i] >= R) {
                contador++;
            }
        }

        System.out.println("Cantidad de valores iguales o superiores a R: " + contador);


        System.out.println("------------------------");

        //Ejercicio 9 :  Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
        //enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N
        //y mostrará en qué posiciones del array aparece N.

        Scanner teclado8 = new Scanner(System.in);

        int[] numeros6 = new int[100];

        for (int i = 0; i < numeros6.length; i++) {
            numeros6[i] = (int) (1 + Math.random() * 10);
        }

        System.out.println("Introduce un valor real N ( entre 1 y 10) : ");
        double N1 = teclado8.nextDouble();

        System.out.println("El valor N aparece en las pòsiciones ");
        for (int i = 0; i < numeros6.length; i++) {
            if (numeros6[i] == N1) {
                System.out.println(i + " ");
            }
        }


        System.out.println("------------------------");

        // Ejercicio 10 : Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        //personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima, así como cuántas personas
        //miden por encima y por debajo de la media.

        Scanner teclado9 = new Scanner(System.in);
        System.out.println("¿Cuantas alturas vas a introducir?: ");
        int N2 = teclado9.nextInt();

        double[] alturas = new double[N2];

        System.out.println("Introduce las " + N2 + "alturas (en metros, usando coma o punto segun tu PC):");
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Persona " + (i + 1) + ": ");
            alturas[i] = teclado9.nextInt();
        }

        double suma1 = 0;

        for (int i = 0; i < alturas.length; i++) {
            suma1 = suma1 + alturas[i];
            }

        double media1 = suma1 / N2;
        double maxima = alturas[0];
        double minima = alturas[0];

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > maxima) {
                maxima = alturas[i];
            }
        }

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] < minima) {
                minima = alturas[i];
            }
        }

        int porEncima = 0;
        int porDebajo = 0;

        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media1) {
                porEncima++;
            }
            if (alturas[i] < media1) {
                porDebajo++;
            }
        }
        System.out.println("La altura maxima es: " + maxima);
        System.out.println("La altura media es: " + media1);
        System.out.println("La altura minima es: " + minima);


        System.out.println("------------------------");


        // Ejercicio 11 : Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
        //el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
        //del primer array al segundo array en orden inverso, y mostrar ambos por pantalla

        Scanner teclado10 = new Scanner(System.in);

        int[] numeros7 = new int[100];
        int[] numeros8 = new int[100];

        for (int i = 0; i < numeros7.length; i++) {
            numeros7[i] = (i + 1);
        }
        for (int i = 0; i < numeros8.length; i++) {
            numeros8[i] = numeros7[99 - i];
        }

        System.out.println(" Primer array (1 al 100)");
        for (int i = 0; 1 < numeros7.length; i++) {
            System.out.println("posicion" + i + ":" + numeros7[i]);
        }

        System.out.println("Segundo array invertido");
        for (int i = 0; 1 < numeros8.length; i++) {
            System.out.println("posicion" + i + ":" + numeros8[i]);
        }


        System.out.println("------------------------");


        // Ejercicio 12 :   Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
        //con distintas opciones:
        //a. Mostrar valores.
        //b. Introducir valor.
        //c. Salir.
        //La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
        //posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
        //que el usuario elija la opción ‘c’ que terminará el programa

        Scanner teclado11 = new Scanner(System.in);

        int [] numeros9 = new int[10];

        int opcion = 0;
        boolean continuar = true;
        do  {
            System.out.println("1. Mostrar valores");
            System.out.println("2. Introducir valor");
            System.out.println("3. Salir");


            switch (opcion) {
                case 1:
                    for (int i = 0; i < 10; i++){
                        System.out.println("Intrduce el numero para la posicion " + i + ":");

                        numeros9[i] = teclado11.nextInt();
                    }

                    System.out.println("Los numeros guardados en el array son:");

                    // // Recorremos otra vez las casillas de la 0 a la 9
                    for (int i = 0; i < 10; i++) {
                        // Imprimimos lo que hay dentro de la casilla 'i'
                        System.out.println("Posicion" + i + numeros[i]);
                    }

                case 2:
                    int Valor = 0;
                    int Posicion = 0;

                    System.out.println("Introduce el valor a guardar:");
                    Valor = teclado11.nextInt();

                    System.out.println("Introduce una posicion entre 0 y 9");
                    Posicion = teclado11.nextInt();

                    if ( Posicion >= 0 && Posicion <= 9) {

                        numeros9[Posicion] = Valor;
                        System.out.println("Valor guardado con exito");
                    } else {
                        System.out.println("error : la posicion debe estar entre 0 y 9");
                    }

                    break;

                case 3:
                    System.out.println("Gracias por usar el programa. Adios");
                    continuar = false;
                    break;
            }
        } while (continuar);


        System.out.println("------------------------");


        //Ejercicio 13 : Crea un programa que permita al usuario almacenar una secuencia aritmética en un
        //array y luego mostrarla. Una secuencia aritmética es una serie de números que
        //comienza por un valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1
        //e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El
        //programa solicitará al usuario V, I además de N (nº de valores a crear).

        Scanner teclado12 = new Scanner(System.in);

        int ValorInicial = 0;
        int incremento = 0;
        int numeroActual = 0;

        int[] secuencia = new int [N];

        for (int i = 0; i < N; i++) {
            secuencia[i] = numeroActual;
            numeroActual = numeroActual + incremento;
        }

        System.out.println("La secuencia aritmetica generada es:");


        for (int i = 0; i < N; i++) {
            System.out.println(secuencia[i] + "");
        }


        System.out.println("------------------------");


        // Ejercicio 14 : Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
        //valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
        //muestre por pantalla.

        int[] secuencia1 = new int [55];
        int posicion1 = 0;


        for (int numero  = 1; numero <= 1; numero++) {

            for (int repeticion = 1; repeticion <= numero; repeticion++) {
                secuencia[posicion1] = numero;
                posicion1++;
            }

            System.out.println("La secuencia generada es:");
            for (int i = 0; i < secuencia.length; i++) {
                System.out.println(secuencia[i] + "");
            }

            System.out.println("------------------------");
        }
    }
}

