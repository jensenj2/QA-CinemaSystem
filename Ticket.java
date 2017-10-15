public abstract class Ticket {
	
	private int cost;
	
	public Ticket(int cost) {
		this.cost = cost;
	} //Ticket constructor
	
	public Ticket() {
	} //Secondary constructor for use by subclasses
	
	public int getCost() {
		return cost;
	} //getCost()
	
	public void setCost(int cost) {
        this.cost = cost;
	} //setCost()
}	