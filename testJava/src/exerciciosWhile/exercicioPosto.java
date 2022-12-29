package exerciciosWhile;
import java.util.Scanner;

public class exercicioPosto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipoAbastecido, alcool, gasolina, diesel;
        tipoAbastecido = sc.nextInt();
        alcool = 0;
        gasolina = 0;
        diesel = 0;

        while (tipoAbastecido != 4) {
			if (tipoAbastecido == 1) {
				alcool = alcool + 1;
			}
			else if (tipoAbastecido == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipoAbastecido == 3) {
				diesel = diesel + 1;
			}
			
			tipoAbastecido = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);

        sc.close();
    }
}
