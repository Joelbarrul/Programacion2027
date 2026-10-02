import java.util.Scanner;
public class Actividad03 {
    public static void main(String[] args) {

        //  Ejercicio 1 : Realiza un programa que dada una cantidad de euros que el usuario introduce por
        //teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
        //alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que
        //indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
        //programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
        //5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo
        //número de billetes posible).

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la cantida correspondiente :");
        int dinero = teclado.nextInt();

        int billetes500 = dinero / 500;
        dinero = dinero % 500;

        int billetes200 = dinero / 200;
        dinero = dinero % 200;

        int billetes100 = dinero / 100;
        dinero = dinero % 100;

        int billetes50 = dinero / 50;
        dinero = dinero % 50;

        int billetes20 = dinero / 20;
        dinero = dinero % 20;

        int billetes10 = dinero / 10;
        dinero = dinero % 10;

        int billetes5 = dinero / 5;
        dinero = dinero % 5;

        System.out.println("Billetes necesarios:");

        if (billetes500 > 0) System.out.println(billetes500 + " billetes de 500");
        if (billetes200 > 0) System.out.println(billetes200 + " billetes de 200");
        if (billetes100 > 0) System.out.println(billetes100 + " billetes de 100");
        if (billetes50 > 0) System.out.println(billetes50 + " billetes de 50");
        if (billetes20 > 0) System.out.println(billetes20 + " billetes de 20");
        if (billetes10 > 0) System.out.println(billetes10 + " billetes de 10");
        if (billetes5 > 0) System.out.println(billetes5 + " billetes de 5");



        System.out.println("-------------------------------");


        // Ejercicio 2 : . Realiza un programa que muestre un menú de opciones como el siguiente:
        //1. Sumar
        //2. Restar
        //3. Multiplicar
        //4. Dividir (incluir manejo de división por 0)
        //5. Salir
        //El menú debe de repetirse hasta que se escoja la opción 5 (Salir).

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
