import java.util.Scanner;

public class driving_cost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Prompt for user input
		System.out.print("Enter the driving distance:");
		double distance = input.nextDouble();
		System.out.print("Enter the vehicles miles per gallon:");
		double miles = input.nextDouble();
		System.out.print("Enter the vehicles price per gallon:");
		double price = input.nextDouble();
		
		double total = (distance / miles) * price;
		
		System.out.println("The cost of driving is $" + total);
	}

}
