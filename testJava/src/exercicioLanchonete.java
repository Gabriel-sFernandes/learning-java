import java.util.Scanner;

public class exercicioLanchonete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int esc, qtd;
        double pagar;
        
        esc = sc.nextInt();
        qtd = sc.nextInt();

        if (esc == 1) {
            pagar = (double) 4.00 * qtd;
        }
        else if (esc == 2) {
            pagar = (double) 4.50 * qtd;
        }
        else if (esc == 3) {
            pagar = (double) 5.00 * qtd;
        }
        else if (esc == 4) {
            pagar = (double) 2.00 * qtd;
        }
        else {
            pagar = 1.50 * qtd;
        }
        System.out.printf("Total: R$ %.2f", pagar);

        sc.close();
    }
}
