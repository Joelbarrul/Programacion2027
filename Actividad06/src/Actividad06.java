import java.util.Scanner;
import java.util.Arrays;
import java.util.Locale;

public class Actividad06 {
    public static void main(String[] args) {

        // Ejercicio 1 : Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        //y luego muestre la matriz por pantalla.

        int numero = 1;
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = numero;
                numero++;
            }
        }

        System.out.println("El tamaño de la matriz en numeros es :");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        // Ejercicio 2 : Crea un programa que cree una matriz de 10x10 e introduzca
        // los valores de las tablas de
        //multiplicar del 1 al 10 (cada tabla en una fila).
        // Luego mostrará la matriz por pantalla.


        int[][] matriz1 = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz1[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("El tamaño de la matriz en numeros es :");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-----------------------");

        //Ejercicio 3 :Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        //introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        //matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        //menores que cero y cuántos son igual a cero

        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce los valores de N:");
        int N = teclado.nextInt();

        System.out.println("introduce los valores de M ");
        int M = teclado.nextInt();

        int iguales = 0;
        int mayores = 0;
        int menores = 0;

        int[][] matriz2 = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println("Introduce un numero");
                matriz2[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matriz2[i][j] > 0) {
                    mayores++;
                } else if (matriz2[i][j] < 0) {
                    menores++;
                } else {
                    iguales++;
                }
            }
        }
        System.out.println("Mayores que cero:" + mayores);
        System.out.println("Menores que cero: " + menores);
        System.out.println("iguales a cero:" + iguales);

        System.out.println("-----------------------");


        // Ejercicio 4 : Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        //1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        //programa mostrará la nota mínima, máxima y media de cada alumno

        Scanner teclado1 = new Scanner(System.in);

        int alumnos = 4, asignaturas = 5;

        double[][] matriz3 = new double[alumnos][asignaturas];
        double[][] estadisticas = new double[alumnos][3];

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("ingrese el valor de la not de la asignatura " + (j + 1) + ": ");
                matriz3[i][j] = teclado1.nextDouble();
            }
        }

        for (int i = 0; i < matriz3.length; i++) {
            estadisticas[i][0] = Double.MAX_VALUE;
            estadisticas[i][1] = - Double.MAX_VALUE;
            estadisticas[i][2] = 0.0;
            for (int j = 0; j < 10; j++) {
                estadisticas[i][0] = Math.min(estadisticas[i][0], matriz3[i][j]);
                estadisticas[i][1] = Math.max(estadisticas[i][1], matriz3[i][j]);
                estadisticas[i][2] = estadisticas[i][2] + matriz3[i][j];
            }
            estadisticas[i][2] = estadisticas[i][2] / matriz3[i].length;
        }

        System.out.println("-----------------------");

        // Ejercicio 5 :Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa
        //y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la información
        //de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su
        //género (0 para varón y 1 para mujer) y su sueldo. Esta información debe guardarse en una única
        //matriz. Luego se mostrará por pantalla el sueldo medio de cada género.

        Scanner teclado2 = new Scanner(System.in);

        System.out.println("Introduzca el  numero de personas");
        int nPersonas = teclado2.nextInt();

        int[][] matriz4 = new int[nPersonas][2];
        double mediaH = 0.0, mediaM = 0.0;
        int contadorH = 0, contadorM = 0;

        for (int i = 0; i < matriz4.length; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("ingrese el genero de la persona (0 varon, 1 mujer");
                matriz4[i][0] = teclado1.nextInt();
                System.out.println("Ingrese el valor del salario");
                matriz4[i][1] = teclado2.nextInt()

                        if (matriz4[i][0] == 0.0) {
                            mediaH += 
                        }
            }
        }
    }
}
