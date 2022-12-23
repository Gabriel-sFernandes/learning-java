import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f\n", product1, price1);
		System.out.printf("%s, wich price is $ %.2f\n", product2, price2);
		System.out.println();
		System.out.print("Record: ");
		System.out.printf("%d years old, code %d and gender: %s\n", age, code, gender);
		System.out.println();
		System.out.print("Measure with eight decimal places:");
		System.out.printf("%f\n", measure);
		System.out.print("Rounded (three decimal places):");
		System.out.printf("%.3f\n", measure);
		System.out.print("US decimal point):");
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f\n", measure);

	}

}
