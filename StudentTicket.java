public class StudentTicket extends Ticket {
	
	private int cost;
	
	public StudentTicket() {
		this.cost = 6;
	} //StudentTicket constructor
	
	public int getCost() {
		return cost;
	} //getCost()
	
	public void setCost(int cost) {
        this.cost = cost;
	} //setCost()
}	