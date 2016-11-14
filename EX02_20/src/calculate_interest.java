import java.util.Scanner;

public class calculate_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Prompt for user input
		System.out.print("Enter the balance and interest rate (ex: 3 for 3%)");
		double balance = input.nextInt();
		double interest_rate = input.nextInt();
		// calculate the numbers
		double total = balance * (interest_rate/1200);
		// print the total
		System.out.println("Next months interest amount will be " + total);
	}

}
