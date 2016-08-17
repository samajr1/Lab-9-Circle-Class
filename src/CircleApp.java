import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radius;
//		Circle circle1 = new Circle(radius);  // would require initializing radius;
		// do I even want to keep this out of the loop?
		
		boolean valid = true;
		do {
			System.out.print("What is the radius of your circle? (in meters): ");
			
			boolean bool = true;
			while (bool) {
				if (scan.hasNextDouble()) {
					System.out.println();
					radius = scan.nextDouble();
					Circle circle1 = new Circle(radius);
					System.out.println(circle1);
					bool = false;
					
				} else {
					System.out.print("Invalid input. Try again: ");
					scan.nextLine();
				} 
			}
			
			scan.nextLine();
			System.out.print("Would you like to measure another circle? (y/n): ");
			String response = scan.nextLine();
			if (response.contains("n")){
				valid = false;
			}
		} while (valid);
		
		System.out.println("You measured a total of " + Circle.getObjectCount() + " circles.");
		System.out.println("Goodbye.");
		
		scan.close();
	}

}
