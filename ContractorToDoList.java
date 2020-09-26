/**
 * The ContractorToDoList class can only hold max 2 items on the list and doubles in size when the end of the array is reached
 */
import java.util.ArrayList;
import java.util.Arrays; 
public class ContractorToDoList {

	/**
	 * instance variables
	 */
	static final int MAX = 2;
	private String address;
	private ToDo[] todos;
	private int count;
	
	/**
	 * Constructor class that creates new ToDo array
	 * @param address
	 */
	public ContractorToDoList(String address) {
		todos = new ToDo[MAX];
		this.address = address;
	}
	
	/**
	 * the addToDo method adds the title, description, price, contact, and list of supplies to the ToDo array.
	 * the method also calls to double the size of the array if there are two or more items.
	 * @param title
	 * @param description
	 * @param price
	 * @param contact
	 * @param supplies
	 */
	public void addToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		ToDo todo = new ToDo(title, description, price, contact,supplies);
		if(count >= MAX) {
			growArray(todos);
		} else {
			// ToDo todo = new ToDo(title, description, price, contact,supplies);
			todos[count] = todo;
			count = count + 1;
		}
	}
	
	/**
	 * the createIterator method returns a new ToDoiterator
	 * @return ToDoIterator
	 */
	public ToDoIterator createIterator() {
		return new ToDoIterator(todos);
	}

	/**
	 * this method is an accessor for address
	 * @return String address
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * the getTotalCost method returns total price after all items on the todo list are completed
	 * @return double
	 */
	public double getTotalCost() {
		double sum = 0.0;
		for(int i = 0; i < todos.length; i++) {
			sum += todos[i].getPrice();
		}
		return sum;
	}

	/**
	 * the growArray method doubles the size of the ToDo array
	 * @param todos
	 * @return ToDo[]
	 */
	private ToDo[] growArray(ToDo[] todos) {
	    todos = Arrays.copyOf(todos, count * 2);
	    return todos;
	}
	
}
