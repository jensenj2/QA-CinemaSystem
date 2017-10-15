public class ChildTicket extends Ticket {
	
	private int cost;
	
	public ChildTicket() {
		this.cost = 4;
	} //ChildTicket constructor
	
	public int getCost() {
		return cost;
	} //getCost()
	
	public void setCost(int cost) {
        this.cost = cost;
	} //setCost()
}	