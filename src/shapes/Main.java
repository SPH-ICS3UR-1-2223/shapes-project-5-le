package shapes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		boolean menu = true;
		Rectangle r = new Rectangle ();
		Triangle t = new Triangle ();
		Circle c = new Circle ();
		
		while (menu == true) {
			menu = false;
		
			System.out.println ("Welcome to the shapes program! Choose an option (properties will be set to 1 as a default if not changed).");
			
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
			r.printStats();
			
		}
		
		if (shape == 2) {
			
			System.out.println();
			t.printStats();
			
		}
		
		if (shape == 3) {
			
			System.out.println();
			c.printStats();
			
		}
		
		System.out.println();
		System.out.println("Would you like to go back to the menu?");
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
		
		System.out.println("Which shape would you like to change?");
		System.out.println("1. Rectangle 2. Triangle 3. Circle");
		int shape = in.nextInt();
		
		if (shape==1) {
		
			
		System.out.println("Choose a width for your rectangle.");
			
		r.setWidth(in.nextInt());
		
		System.out.println("Choose a length for your rectangle.");
		
		r.setLength(in.nextInt());
		
		System.out.println();
		System.out.println("Would you like to go back to the menu?");
		System.out.println("1. Yes 2. No");

		}
		
		if (shape==2) {
			
			
			System.out.println("Choose a length for side A (height) of your triangle.");
			
			t.setSideA(in.nextInt());
			
			System.out.println("Choose a length for side B (base) of your triangle.");
			
			t.setSideB(in.nextInt());
			
			System.out.println("Choose a length for side C of your triangle.");
			
			t.setSideC(in.nextInt());
			
			System.out.println();
			System.out.println("Would you like to go back to the menu?");
			System.out.println("1. Yes 2. No");
		
		}
		
			
		if (shape==3) {
				
			System.out.println("Choose a radius for your circle.");
				
			c.setRadius(in.nextInt());
			
			System.out.println();
			System.out.println("Would you like to go back to the menu?");
			System.out.println("1. Yes 2. No");
			
		}
			
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
		
		else if (option == viewProperties) {
			System.out.println("You chose to view the properties!");
			
			System.out.println("Which shape would you like to view the properties of?");
			System.out.println("1. Rectangle 2. Triangle 3. Circle");
			int shape = in.nextInt();
			
			if (shape == 1) {
				System.out.println("The width of your rectangle is: " + r.getWidth());
				System.out.println("The length of your rectangle is: " + r.getLength());
				
				System.out.println();
				System.out.println("Would you like to go back to the menu?");
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
			
			if (shape==2) {
				System.out.println("Side A (height) of your triangle is: " + t.getSideA());
				System.out.println("Side B (base) of your triangle is: " + t.getSideB());
				System.out.println("Side C of your triangle is: " + t.getSideC());
				
				System.out.println();
				System.out.println("Would you like to go back to the menu?");
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
			
			if (shape==3) {
				System.out.println("The radius of your circle is: " + c.getRadius());
				
				System.out.println();
				System.out.println("Would you like to go back to the menu?");
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
		
			
		}
		else if (option == quit) {
			System.out.println ("Quitting program...");
			in.close();
			
		}
		
		}
		
		in.close();
		
		
	}
		

}

	