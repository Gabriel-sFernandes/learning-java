import java.util.Scanner;
import java.util.Locale;

public class exercicioFormasGeometricas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a, b, c, pi = 3.14159, triangulo, circulo, trapezio, quadrado, retangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (double) (a * c) / 2;
        circulo = (double) pi * (c * c);
        trapezio = (double) (a + b) * c / 2;
        quadrado = (double) b * b;
        retangulo = (double) a * b;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETAANGULO: %.3f\n", triangulo, circulo, trapezio, quadrado, retangulo);

        sc.close();        
    }
}
