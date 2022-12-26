import java.util.Scanner;
import java.util.Locale;

public class exercicioRaio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double pi, a, r;

        r = sc.nextDouble();
        pi = 3.14159;
        a = pi * (r*r);

        System.out.printf("%.4f", a);
        sc.close();
    }
}
