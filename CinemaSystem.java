import java.util.*;
import java.text.SimpleDateFormat;

public class CinemaSystem {
	
	public static void main (String[] args) {
		System.out.println("Welcome to the QA Cinema System!");
		
		int totalCost = 0, totalTickets = 0, ticketAmount = 0;
		Scanner sc = new Scanner(System.in);
		
		//Take requested ticket amounts from stdin
		//Keep tally of total tickets and total cost
		try {
			System.out.println("How many Standard tickets do you wish to purchase?");
			ticketAmount = sc.nextInt();
			if (ticketAmount < 0)
				throw new IllegalArgumentException("This number cannot be negative!");
			totalTickets += ticketAmount;
			totalCost = new StandardTicket().getCost() * ticketAmount;
		
			System.out.println("How many OAP tickets do you wish to purchase?");
			ticketAmount = sc.nextInt();
			if (ticketAmount < 0)
				throw new IllegalArgumentException("This number cannot be negative!");
			totalTickets += ticketAmount;
			totalCost += new OAPTicket().getCost() * ticketAmount;
		
			System.out.println("How many Student tickets do you wish to purchase?");
			ticketAmount = sc.nextInt();
			if (ticketAmount < 0)
				throw new IllegalArgumentException("This number cannot be negative!");
			totalTickets += ticketAmount;
			totalCost += new StudentTicket().getCost() * ticketAmount;
				
			System.out.println("How many Child tickets do you wish to purchase?");
			ticketAmount = sc.nextInt();
			if (ticketAmount < 0)
				throw new IllegalArgumentException("This number cannot be negative!");
			totalTickets += ticketAmount;
			totalCost += new ChildTicket().getCost() * ticketAmount;
		
			//Check if today is Wednesday. If so, apply discount
			Date now = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E");
			if (simpleDateFormat.format(now).equals("Wed"))
				totalCost -= (2 * totalTickets);
		
			System.out.println("------------------------------------------------");
			System.out.println("Total price of your tickets is: \u00A3" + totalCost);
			} //try
		//If user enters non-integer
			catch (InputMismatchException e) {
				System.out.println("Please only enter integers greater than or equal to zero!");
				System.out.println("Terminating...");
			} //catch
	} //main()
}
