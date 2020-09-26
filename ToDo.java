/**
 * the ToDo class holds the details of an item which they have to complete
 */
import java.util.ArrayList;

public class ToDo {

	/**
	 * variables
	 */
	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
	/**
	 * Constructor accepts all variables of a todo item
	 * @param title
	 * @param description
	 * @param price
	 * @param contact
	 * @param supplies
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		 this.title = title;
		 this.description = description;
		 this.price = price;
		 this.contact = contact;
		 this.supplies = supplies;
	}
	
	/**
	 * getPrice method accesses the price variable
	 * @return double
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * toString method returns a string containing the title, description, contact, supply list, and price
	 */
	public String toString() {
		return "\n***** " + title + " *****" + "\n" + description + "\nBusiness Contact: " + contact + "\nSupply List:\n" + supplies + "\nPrice: $" + price;
	}
}
