import java.util.Scanner;

public class circle_distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
     // Prompt for user input
     		System.out.print("Enter point 1 (Latitude & Longitude in degrees:");
     		double x1 = input.nextDouble();
     		double y1 = input.nextDouble();
     //Get point 2
     		System.out.print("Enter point 2 (Latitude & Longitude in degrees:");
     		double x2 = input.nextDouble();
     		double y2 = input.nextDouble();
     		     		
     		double total = 6371.01*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
     		//Calculate that Math.pow(x1y1) = 
     //Formula d=radius*arccos(sin(x1)*sin(x2)+cos(x1)*cos(x2)*cos(y1-y2))
     		 
     		System.out.print("The distance between the two points is" + total);
     		
	
	}
	
}
