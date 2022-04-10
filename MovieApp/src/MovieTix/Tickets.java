package MovieTix;
//Parent class to initialized all the variables locally to be accessed by the child classes.
public class Tickets 
{
	int ageRange;
	double child = 5.00;
	double adults = 8.00;
	double seniors = 7.00;
	//Constructor of the Ticket class to initialize the age range.
		public Tickets(int ageRange) 
		{
			this.ageRange = ageRange;
		}
		//This is the display class used to go through the and print of ticket cost for age input.
		void display()
		{
			if(ageRange < 13)
			{
				System.out.println("Your ticket cost is: $" + child);
			}
			if(ageRange > 13 && ageRange < 60)
			{
				System.out.println("Your ticket cost is: $" + adults);
			}
			if(ageRange > 60 && ageRange < 100)
			{
				System.out.println("Your ticket cost is: $" + seniors);
			}
		}
}
