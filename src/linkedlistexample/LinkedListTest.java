package linkedlistexample;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
				
		list.add(0,"A");
		list.add(0, "B");
		list.add(1, "C");
		list.add("D");
		//list.print();
		list.remove(2);
		//list.print();
		list.remove();
		//list.print();
		list.add("Z");
		//list.print();
		list.add(1, "S");
		list.print();
		list.reverse();
		list.print();
	}

}
