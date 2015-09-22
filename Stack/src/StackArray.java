
public class StackArray<T> implements Stack<T> {
	
	private T[] data;
	private int top;
	
	public StackArray(int n){
		this.data = (T[]) new Object[n];
		this.top = 0;
	}
	

	public void push(T p) {
		// TODO Auto-generated method stub
		if (!isFull()){
			this.data[top] = p;
			this.top++;
		}
	}


	public T pop() {
		// TODO Auto-generated method stub
		if(!isEmpty()){
			top--;
			return this.data[top];
		}
			
		return null;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(this.top == 0){
			return true;
		}
		return false;
	}

	
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(this.top == this.data.length){
			return true;
		}
		return false;
	}
	

}
