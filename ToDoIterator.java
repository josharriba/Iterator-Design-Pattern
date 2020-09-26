/**
 * The iterator class implements Iterator
 */
import java.util.Iterator;

public class ToDoIterator implements Iterator{
	
	/**
	 * variables
	 */
	private ToDo[] todos;
	private int position = 0;

	/**
	 * constructor accepts an array of ToDo items
	 * @param todos
	 */
	public ToDoIterator(ToDo[] todos) {
		this.todos = todos;
	}
	
	/**
	 * hasNext method returns true if there are more items to iterate over
	 */
	public boolean hasNext() {
		if(position >= todos.length || todos[position] == null) {
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * next method returns the next item in the ToDo array
	 */
	public ToDo next() {
		ToDo toDo = todos[position];
		position = position + 1;
		return toDo;
	}
}
