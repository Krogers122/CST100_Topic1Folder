import java.util.Scanner;

public class tip_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Prompt for user input
		System.out.print("Enter the Bill total");
	double dollars = input.nextInt();
	
	double gratuity = dollars * .15;
	double total = gratuity + dollars;
	System.out.println("The new bill total with 15% Gratuity is $" + total);
	}
	
}
