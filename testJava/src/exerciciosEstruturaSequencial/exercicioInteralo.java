import java.util.Scanner;

public class exercicioInteralo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double intervalo = sc.nextDouble();

        if (intervalo > 0 && intervalo <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (intervalo > 0 && intervalo <= 50) {
            System.out.println("Intervalo [25,50]");
        }
        else if (intervalo > 0 && intervalo <= 75) {
            System.out.println("Intervalo [50,75]");
        }
        else if (intervalo > 0 && intervalo <= 100) {
            System.out.println("Intervalo [75,100]");
        }
        else {
            System.out.println("Fora do intervalo");
        }
        sc.close();
    }
}
