
public interface Stack<T> {
	
	/**
	 * Pushes a new T onto the stack
	 * @param p
	 */
	public void push(T p);
	/**
	 * Pops a T off the top of the stack
	 * @return
	 */
	public T pop();
	/**
	 * 
	 * @return true if the stack is empty
	 */
	public boolean isEmpty();
	/**
	 * 
	 * @return true if the stack is full
	 */
	public boolean isFull();
}
