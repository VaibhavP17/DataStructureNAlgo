package stackexample;

public class Stack<T> {

	private int MAX_CAPACITY = 10;
	private Object[] holder = new Object[MAX_CAPACITY];
	private int size;
	
	public Stack(int capacity){
		super();
		this.MAX_CAPACITY = capacity;
	}
	
	public boolean push(T object){
		if(size == MAX_CAPACITY){
			throw new StackOverflowError();
		}else{
			holder[size] = object;
			++size;
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	public T peek(){
		if(this.size==0){
			return null;
		}else{
			return (T)holder[size-1];
		}
	}
	
	public T pop(){
		T object = peek();
		holder[size-1]= null;
		size--;
		return object;
	}
	
	public void print(){
		for(int i=0; i<=size-1;i++){
			System.out.println("Element at index "+i+": "+holder[i]);
		}
	}
}