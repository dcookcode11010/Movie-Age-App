package MovieTix;
//This project is the demonstrate price of ticket for the movies based on users specific age.
import java.util.Scanner;

public class Register 
{
	//The main class to run the program
	public static void main(String[] args)
	{	
		System.out.println("Hello, Welcome to the movie?\n");
		
		Scanner Reage = new Scanner(System.in);
		System.out.println("If you don't mind me asking, How old are you?");
		
		int age = Reage.nextInt();
		//Creating an object for the Ticket class.
		Tickets t1 = new Tickets(age);
		//Object to call a method from the objects class.
		t1.display();
	}
}
