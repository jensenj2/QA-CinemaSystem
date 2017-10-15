public class StandardTicket extends Ticket {
	
	private int cost;
	
	public StandardTicket() {
		this.cost = 8;
	} //StandardTicket constructor	
	
	public int getCost() {
		return cost;
	} //getCost()
	
	public void setCost(int cost) {
        this.cost = cost;
	} //setCost()
}