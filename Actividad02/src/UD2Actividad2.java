import java.util.Scanner;
public class UD2Actividad2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad");
        int edad;
        edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("eres mayor de edad" + edad);
        }


        System.out.println("-------------------------------");


        // Ejercicio 2 : Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
        //mayor de edad” o el mensaje de “eres menor de edad”.

        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad");
        int edad1;
        edad1 = teclado1.nextInt();
        if (edad1 >= 18) {
            System.out.println("eres mayor de edad" + edad1);
        } else {
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

        for (int i1 = 2; i1 <= 200; i1 += 2) {
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
        for (int i3 = 1; i3 <= N; i3++) ;


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
        } else if (nota1 < 5) {
            System.out.println("Insuficiente");
        } else if (nota1 < 6) {
            System.out.println("Bien");
        } else if (nota1 < 9) {
            System.out.println("Notable");
        } else {
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
        for (int i4 = 1; i4 <= N1; i4++) {
            factorial *= i4;
        }

        System.out.println("-------------------------------");

        // Ejercicio 9: Escribe un programa que recibe como datos de entrada una hora expresada en horas,
        //minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
        //transcurrido un segundo.


        Scanner teclado6 = new Scanner(System.in);
        System.out.println("Introduce las horas (o-23)");
        int horas = teclado6.nextInt();
        System.out.println("Introduce los minutos (0-59):");
        int minutos = teclado6.nextInt();
        System.out.println("Introduce los segundos (0-59):");
        int segundos = teclado6.nextInt();
        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++; // Sumamos uno a los minutos

        }

        if (minutos == 60) {
            minutos = 0;
            horas++; // Sumamos uno a las horas
        }

        if (horas == 24) {
            horas = 0;
        }

        System.out.println("La hora un segundo despues es: " + horas + ":" + minutos + ":" + segundos);


        System.out.println("-------------------------------");

        // Ejercicio 10 : Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha
        //leído algún número negativo o no.

        Scanner teclado7 = new Scanner(System.in);
        boolean unNegativo = false;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero");
            int numero = teclado7.nextInt();

            if (numero < 0) {
                unNegativo = true;
            }
        }
        if (unNegativo == true) {
            System.out.println("Se ha leido algun numer negativo.");
        } else {
            System.out.println("No se ha leido ningun numero negativo");
        }

        System.out.println("-------------------------------");

        // Ejercicio 11 : Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
        //indicando cuántos son positivos y cuantos negativos.

        Scanner teclado8 = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número:");
            int numero = teclado8.nextInt();
            if (numero < 0) {
                negativos++; // Si el numero es menor que 0, le sumamos 1 a los negativos
            } else {
                positivos++; // Si no. Le sumamos uno a los positivos
            }
        }
        System.out.println("Resultados de los contadores:");
        System.out.println("Cantidad de números positivos " + positivos);
        System.out.println("Cantidad de numeros negativos " + negativos);


        System.out.println("-------------------------------");

        // Ejercicio 12 : Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca
        //un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos
        //negativos.

        Scanner teclado9 = new Scanner(System.in);
        System.out.println("introduce algun numero");
        boolean unNegativo1 = false;
        int positivos1 = 0;
        int negativos1 = 0;
        int numero = teclado9.nextInt();

        while (numero != 0) {

            if (numero < 0) {
                negativos1++;
                unNegativo1 = true;
            } else {
                positivos1++;
            }

            System.out.println("introduce otro numero (o 0 para salir): ");
            numero = teclado9.nextInt();
        }

        System.out.println("-------------------------------");

        // Ejercicio 13 : . Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros
        //números naturales.

        int suma = 0;
        int producto = 1;


        for (int i = 1; i <= 10; i++) {
            suma = suma + i; // Aqui nos aseguramos que la primera suma, sea esa misma suma mas lo que da i
            producto = producto * i; // Aqui hacemos lo mismo solo que se le añade lo que i multiplica

        }
        System.out.println("La suma de los 10 primeros numeros naturales es:" + suma);
        System.out.println("El producto de los 10 primeros numeros naturales es:" + producto);


        System.out.println("-------------------------------");

        // Ejercicio 14 : Escribe un programa que calcula el salario neto semanal de un trabajador en función del
        //número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
        //• Las primeras 35 horas se pagan a tarifa normal.
        //• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
        //• Las tasas de impuestos son:
        //• Los primeros 500 euros son libres de impuestos.
        //• Los siguientes 400 tienen un 25% de impuestos.
        //• Los restantes un 45% de impuestos.
        //Escribir nombre, salario bruto, tasas y salario neto.

        Scanner teclado10 = new Scanner(System.in);

        System.out.println("Introduce el nombre del trabajador");
        String nombre = teclado10.next();

        System.out.println("Introduce las horas trabajadas esta semana:");
        int horasTrabajadas = teclado10.nextInt();

        System.out.println("introduce el precio de la hora normal (tarifa):");
        double tarifaNormal = teclado10.nextDouble();

        double salarioBruto = 0;

        if (horasTrabajadas <= 35) {
            salarioBruto = horasTrabajadas * tarifaNormal;

    } else {
            int horasExtras = horasTrabajadas - 35;
            salarioBruto = (35 * tarifaNormal) + (horasExtras * 1.5 * tarifaNormal);

            
    }
        double tasas = 0;
        if (salarioBruto <= 500)
            tasas = 0;

        else if (salarioBruto <= 900) {
            tasas = (salarioBruto - 500) * 0.25;

        } else {
            tasas = 100 + (salarioBruto - 900) * 0.45;
        }
        double salarioNeto = (salarioBruto - tasas);

        System.out.println("Trabajador: " + nombre);
        System.out.println("Salario Bruto: " + salarioBruto + "euros");
        System.out.println("Tasas ( Impuestos)" + tasas + "euros");
        System.out.println("Salario neto: " + salarioNeto + "euros");
    }

    }

