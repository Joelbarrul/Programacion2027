public class Main {


    void main() {

        Astros[] sistemaSolar = new Astros[10];

        Planeta tierra = new Planeta(6.4e6, 24600,5.98e24, 25, 9.8, 1, 365, true);
        sistemaSolar[0] = tierra;
        Satelites luna = new Satelites(1.734e6, 28, 7.35e22, 0, 1.7, 30000, 28,tierra);
        sistemaSolar[1] = luna;

        for(int i = 0; i < sistemaSolar.length; i++){
            if(sistemaSolar[i] != null){
                System.out.println(sistemaSolar[i].muestra());
            }

        }
    }
}
