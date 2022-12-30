package exerciciosFor;
import java.util.Scanner;
import java.util.Locale;

public class exercicioMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int nmr = sc.nextInt();
        double v1, v2, v3, media;
        media = 0;

        for (int i = 0; i < nmr; i++) {
            v1 = sc.nextDouble();
            v2 = sc.nextDouble();
            v3 = sc.nextDouble();

            media = (v1 * 2 + v2 * 3 + v3 * 5) / 10 ;
            System.out.printf("%.1f\n", media);
        }

        sc.close();
    }
}
