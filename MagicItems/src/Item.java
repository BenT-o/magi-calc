
public class Item {
	String name;
	int cost;
	
	/**
	 * Constructor
	 */
	public Item(String name){
		this.name = name;
		cost = 0;
	}
	
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
}
