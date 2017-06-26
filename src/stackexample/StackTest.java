package stackexample;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(10);
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		stack.push("F");
		stack.push("G");
		stack.push("H");
		stack.push("I");

		stack.print();
		
		System.out.println("Peeked Element: "+stack.peek());
		
		System.out.println("Popped Element: "+stack.pop());
		
		stack.print();
	}

}
