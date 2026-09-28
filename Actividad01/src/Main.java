import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ejercicio 1: Escribir un programa que diga "buenos dias".
         */
        System.out.println("Hola buenos dias");
        System.out.println("Anuar dejame usar phyton POR FAVOOOOOOR");


        System.out.println("----------------------------------------");


        /*
        Ejercicio 2:  Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5
         */
        // 1. Guardamos cuanto mide el lado del cuadrado
        int lado = 5;
        // 2. Calculamos el area multiplicando lado por lado
        int area = lado * lado;
        // 3. Mostramos el resultado en la pantalla
        System.out.println("El area del cuadrado es: " + area);


        System.out.println("----------------------------------------");

        // Ejercicio 3: escribe un programa que calcule el área de un cuadrado cuyo lado se introduce por el teclado
        System.out.println("Introduce el lado del cuadrado:");
        Scanner teclado = new Scanner(System.in);
        double ladoA = teclado.nextDouble();
        double area1 = ladoA * ladoA;
        System.out.println("El area es: " + area1);


        System.out.println("----------------------------------------");

        // Ejercicio 4: Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
        //producto y división.

        System.out.println("Introduce el primer número:");
        double num1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número:");
        double num2 = teclado.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicacion de los números es: " + multiplicacion);
        System.out.println("La division de los números es: " + division);

        System.out.println("----------------------------------------");

        // Ejercicio 5: Escribe un programa que toma como dato de entrada un número que corresponde a la
        //longitud de un radio y nos escribe la longitud de la circunferencia, el área del círculo y el
        //volumen de la esfera que corresponden con dicho radio.

        System.out.println("Introduce el radio:");
        double radio = teclado.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("la longitud del circulo es" + longitud);
        System.out.println("la longitud del circulo es" + areaCirculo);
        System.out.println("la longitud del circulo es" + volumen);

        System.out.println("----------------------------------------");

        // Ejercicio 6:  Escribe un programa que dado el precio de un artículo y el precio de venta real nos
        //muestre el porcentaje de descuento realizado.

        System.out.println("Introduce el precio Original");
        double precioOriginal = teclado.nextDouble();
        System.out.println("Introduce el precio de venta");
        double precioVenta = teclado.nextDouble();
        double porcentajeDescuento = ((precioOriginal - precioVenta) / precioOriginal) * 100;
        System.out.println("El descuento realizado es del:" + porcentajeDescuento + "%");


        System.out.println("----------------------------------------");

        //Ejercicio 7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        //y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.

        System.out.println("Introduce la distancia en millas marinas");
        double millas = teclado.nextDouble();
        double DistanciaMetros = millas * 1852;
        System.out.println(millas + " millas marinas equivalen a " + DistanciaMetros + " metros.");

        System.out.println("----------------------------------------");

        // Ejercicio 8: Escribe un programa que lee dos números y los visualiza en orden ascendente.

        System.out.println("Introduce el primer número:");
        double numero1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número:");
        double numero2 = teclado.nextDouble();

        double menor = Math.min(numero1, numero2);
        double mayor = Math.max(numero1, numero2);
        System.out.println("Los números en orden ascendente son: " + menor + " y " + mayor);

        System.out.println("----------------------------------------");

        // Ejercicio 9:  Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
        System.out.println("Introduce el primer número:");
        double Num1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número:");
        double Num2 = teclado.nextDouble();

        String resultado = (Num1 == Num2) ? "Los numeros son iguales" : (Num1 > Num2) ? "El primer numero es el mayor" : "El segundo numero es el mayor";
        System.out.println(resultado);

        System.out.println("----------------------------------------");

        // Ejercicio 10:  Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.

        System.out.println("Introduce el primer número");
        double n1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número");
        double n2 = teclado.nextDouble();
        System.out.println("Introduce el tercer número");
        double n3 = teclado.nextDouble();

        double elMayor = Math.max(n1, Math.max(n2, n3));
        System.out.println("El numero mayor de los tres es: " + elMayor);

        System.out.println("----------------------------------------");

        // Ejercicio 11 : Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
        //producto y división. (Ten en cuenta la división por cero).

        System.out.println("Introduce el primer número:");
        double número1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número:");
        double número2 = teclado.nextDouble();

        double sumar = número1 + número2;
        double restar = número2 - número2;
        double multiplicar = número1 * número2;
        String dividir = (número2 == 0) ? "No se puede dividir entre cero" : String.valueOf(número1 / número2);

        System.out.println("----------------------------------------");

        // Ejercicio 12 :  Escribe un programa que lee 2 números y muestra el mayor

        System.out.println("Introduce el primer número:");
        double number1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número:");
        double number2 = teclado.nextDouble();

        double grande = Math.max(number1, number2);
        System.out.println("El numero mayor es:" + grande);

        System.out.println("----------------------------------------");

        // Ejercicio 13:  Escribe un programa que lee un número y me dice si es positivo o negativo
        //consideraremos el cero como positivo.

        System.out.println("Introduce un numero:");
        double Nam = teclado.nextDouble();
        String resultado1 = (Nam >= 0) ? "positivo" : "negativo";
        System.out.println("El numeor introducido es" + resultado1);
    }
}




