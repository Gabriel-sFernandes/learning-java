package exerciciosFor;
import java.util.Scanner;
import java.util.Locale;

public class exercicioDivisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int nmr = sc.nextInt();
        double divisao;

        for (int i = 0; i < nmr; i++) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();

            if (b == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                divisao = (double) a / b;
                System.out.println(divisao);
            }
        }

        sc.close();
    }
}
