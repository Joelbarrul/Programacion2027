import java.util.Scanner;
public class PiedraPapelOtijera {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crea un juego de piedra papel o tijera en el que se explique como jugar
        //mediante P (piedra), L (papel) o T(tijeras) o S(para salir terminando la partida)
        //también se debe decidir quien ha ganado, Si el programa o el jugador

        System.out.println("Juego de piedra papel o tijera");
        System.out.println("Debes elegir una de las tres opciones");
        System.out.println("El programa decidira aleatoriamente una de las tres opciones");
        System.out.println("El ganador se elige aleatoriamente");
        System.out.println("Preparados, listos, A jugar!!");

        int opcion = 0;
        int papel = 1;
        int tijera = 1;
        int piedra = 1;
        int jugador = 1;
        System.out.println("Elige una de las tres opciones");
        do {
            System.out.println("1.Piedra");
            System.out.println("2.Papel");
            System.out.println("3.Tijera");
            System.out.println("4.Salir");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    if (jugador == piedra) {
                        System.out.println(papel);
                        System.out.println("La maquina a escojido papel, has perdido");

                    }
                    else if (jugador == papel) {
                        System.out.println(tijera);
                        System.out.println("La maquina ha escojido tijera, Has perdido");
                    }
                    else if (jugador == tijera) {
                        System.out.println(piedra);
                        System.out.println("La maquina ha escogido piedra, has perdido");

                    }
                    break;
                case 2:
                    if (jugador == papel) {
                        System.out.println(piedra);
                        System.out.println("La maquina a escojido piedra, has ganado");

                    }
                    else if (jugador == papel) {
                        System.out.println(tijera);
                        System.out.println("La maquina ha escojido tijera, Has perdido");
                    }
                    else if (jugador == tijera) {
                        System.out.println(piedra);
                        System.out.println("La maquina ha escogido piedra, has perdido");
                    }
                    break;

                case 3:
                    if (jugador == tijera) {
                        System.out.println(tijera);
                        System.out.println("La maquina a escojido tijera, es un empate");
                    }
                    else if (jugador == papel) {
                        System.out.println(tijera);
                        System.out.println("La maquina ha escojido tijera, Has perdido");
                    }
                    else if (jugador == tijera) {
                        System.out.println(piedra);
                        System.out.println("La maquina ha escogido piedra, has perdido");
                    }
                    break;
            }
        } while (opcion != 4);



    }

}
