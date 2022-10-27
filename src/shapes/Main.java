package shapes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		boolean menu = true;
		
		while (menu == true) {
			menu = false;
		
			System.out.println ("Welcome to the shapes program! Choose an option.");
			
			int createShape = 1;
			int changeProperties = 2;
			int viewProperties = 3;
			int quit = 4;
			
			System.out.println ("1. Create shape 2. Change properties 3. View properties 4. Quit");
			int option = in.nextInt();
			System.out.println();
		
		if (option == createShape) {
			System.out.println("You chose to create a shape!");
			System.out.println();
			
		System.out.println("Pick a shape to create:");
		System.out.println("1. Rectangle 2. Triangle 3. Circle");
		
		
		int shape = in.nextInt();
		
		if (shape == 1) {
			
			System.out.println();
			Rectangle r = new Rectangle (3,5);
			r.printStats();
			r.setLength(8);
			r.printStats();
			
		}
		
		if (shape == 2) {
			
		}
		
		if (shape == 3) {
			
		}
		
		System.out.println();
		System.out.println("Would you like to run the program again?");
		System.out.println("1. Yes 2. No");
		
		int yesno = in.nextInt();
		
		if (yesno == 1) {
		System.out.println();
		menu = true;
		
		}
		else if (yesno == 2) {
			
			System.out.println();
			System.out.println ("Quitting program...");
			in.close();
			
		}
		
		}
		
		else if (option == changeProperties) {
		System.out.println("You chose to change the properties!");
		
		
		
		}
		else if (option == viewProperties) {
			System.out.println("You chose to view the properties!");
		
		
			
		}
		else if (option == quit) {
			System.out.println ("Quitting program...");
			in.close();
			
		}
		
		}
		
		in.close();
		
		
	}
		

}

	