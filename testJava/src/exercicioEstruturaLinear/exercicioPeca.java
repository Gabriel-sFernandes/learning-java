import java.util.Scanner;
import java.util.Locale;

public class exercicioPeca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US); 

        int codigo1, nmrPeca1, codigo2, nmrPeca2;
        double valor1, valor2, result;

        codigo1 = sc.nextInt();
        nmrPeca1 = sc.nextInt();
        valor1 = sc.nextDouble();
        codigo2 = sc.nextInt();
        nmrPeca2 = sc.nextInt();
        valor2 = sc.nextDouble();

        result = (valor1 * nmrPeca1) + (valor2 * nmrPeca2);
        System.out.printf("VALOR A PAGAR: R$  %.2f", result);

        sc.close();
    }
}
