package exerciciosFor;
import java.util.Scanner;

public class exercicioDivisores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nmr = sc.nextInt();
		
		for (int i = 1; i <= nmr; i++) {
			if (nmr % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}