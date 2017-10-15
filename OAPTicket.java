public class OAPTicket extends Ticket {
	
	private int cost;
	
	public OAPTicket() {
		this.cost = 6;
	} //OAPTicket constructor
	
	public int getCost() {
		return cost;
	} //getCost()
	
	public void setCost(int cost) {
        this.cost = cost;
	} //setCost()
}	