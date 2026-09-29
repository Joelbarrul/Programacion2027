import java.util.Scanner;
public class UD2Actividad2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    System.out.println("Por favor, introduce tu edad");
        int edad;
    edad = teclado.nextInt();
    if( edad >= 18){
        System.out.println("eres mayor de edad" + edad);
    }


    System.out.println("-------------------------------");


    // Ejercicio 2 : Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
        //mayor de edad” o el mensaje de “eres menor de edad”.

        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad");
        int edad1;
        edad1 = teclado1.nextInt();
        if( edad1 >= 18){
            System.out.println("eres mayor de edad" + edad1);
        }

        else{
            System.out.println("Eres menor de edad");
        }


        System.out.println("-------------------------------");

    // Ejercicio 3 : Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2,
        //3... 20).

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }


        System.out.println("-------------------------------");

    // Ejercicio 4 : aliza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        //Para ello utiliza un contador y suma de 2 en 2.

        for (int i1 = 2; i1 <= 200; i1 += 2){
            System.out.println(i1);
        }

        System.out.println("-------------------------------");

    // ejercicio 5 : Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200.
        //Esta vez utiliza un contador sumando de 1 en 1.

        for (int i2 = 1; i2 <= 200; i2++) {
            System.out.println(i2);
        }

        System.out.println("-------------------------------");


    // Ejercicio 6 : Realiza un programa que muestre los números desde el 1 hasta un número N que se
        //introducirá por teclado

        Scanner teclado2 = new Scanner(System.in);
    System.out.println("Por favor, introduce el numero limite");
    int N;
    N = teclado2.nextInt();
    for (int i3 = 1; i3 <= N; i3++);


    System.out.println("-------------------------------");

    // Ejercicio 7 : Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en
    //calificación alfabética, escribiendo el resultado.
    //• de 0 a <3 Muy Deficiente.
    //• de 3 a <5 Insuficiente.
    //• de 5 a <6 Bien.
    //• de 6 a <9 Notable
    //• de 9 a 10 Sobresaliente

        Scanner teclado4 = new Scanner(System.in);
        System.out.println("Por favor, introduce tu nota (de 0 a 10):");

    double nota1 = teclado4.nextDouble();
        if (nota1 < 3) {
            System.out.println("Muy deficiente");
        }
        else if (nota1 < 5) {
            System.out.println("Insuficiente");
        }
        else if (nota1 < 6) {
            System.out.println("Bien");
        }
        else if (nota1 < 9){
            System.out.println("Notable");
        }
        else {
            System.out.println("Sobresaliente");
        }

        System.out.println("-------------------------------");

    // Ejercicio 8 :  Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
        //Siendo el factorial:
        //• 0! = 1
        //• 1! = 1
        //• 2! = 2 * 1
        //• 3! = 3 * 2* 1
        //• N! = N * (N-1) * (N-2)........* 3*2*1
    System.out.println("introduce el factorial");
    Scanner teclado5 = new Scanner(System.in);
    int N1 = teclado5.nextInt();
    long factorial = 1;
    for (int i4 = 1; i4 <= N1; i4++){
        factorial *= i4;
    }

    }
}
