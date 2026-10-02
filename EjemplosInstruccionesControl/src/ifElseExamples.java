import java.util.Scanner;

public class ifElseExamples {
    public static void main(String[] args) {

        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu edad");
        edad = sc.nextInt();

        if (edad >= 18 && edad <= 120) {
            System.out.println("Puedes pasar");
        }
    }
}
