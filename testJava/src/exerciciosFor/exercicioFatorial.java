package exerciciosFor;
import java.util.Scanner;

public class exercicioFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nmr = sc.nextInt();
        int result;
        result =  1;

        for (int i = 1; i <= nmr; i++) {
            result *= i;
        }
        System.out.println(result);

        sc.close();
    }
}
