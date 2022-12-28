import java.util.Scanner;

public class exercicioNegativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;
        hora = sc.nextInt();

        if (hora < 0) {
            System.out.println("NEGATIVO");
        }

        else{
            System.out.println("NAO NEGATIVO");
        }
        sc.close();
    }
}
