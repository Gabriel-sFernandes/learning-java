package exerciciosFor;
import java.util.Scanner;

public class exercicioQudradoCubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nmr = sc.nextInt();

        for (int i = 1; i <= nmr; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            
            System.out.println(i + " " + quadrado + " " + cubo + " ");            
        }
        sc.close();
    }
}
