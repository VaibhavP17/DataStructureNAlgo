package linkedlistexample;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size=0;
	
	public boolean add(T object){
		if(head== null){	
			head = new Node<T>();
		
			Node<T> node = new Node<T>();
			node.setValue(object);
			
			head = node;
			tail = node;
			++size;
		}else if(tail != null){
			Node<T> node = new Node<T>();
			node.setValue(object);
			tail.setNext(node);
			tail = node;
			++size;
		}
		return true;
	}
	
	public boolean add(int index, T object){
		if(head == null){
			Node<T> node = new Node<T>();
			node.setValue(object);
			
			head= node;
			tail = node;
			++size;
		}else if(index > size-1){
			throw new ArrayIndexOutOfBoundsException(index); 
		}else if(index == 0){
			Node<T> node = new Node<T>();
			node.setValue(object);
			node.setNext(tail);
			head = node;
			++size;
		}else if(index <= size -1){
			Node<T> prevNode = head;
			int temp = 0;
			while(temp != index-1){
				prevNode = prevNode.getNext();
				temp++;
			}
			
			Node<T> currentNode = prevNode.getNext();
			
			Node<T> newNode = new Node<T>();
			newNode.setValue(object);
			
			prevNode.setNext(newNode);
			newNode.setNext(currentNode);
			
			++size;
		}
		return true;
	}
	
	public boolean remove(){
		if(size==0){
			return true;
		}else{
			Node<T> prevNode = head;
			while(prevNode.getNext()!=tail){
				prevNode = prevNode.getNext();
			}
			prevNode.setNext(null);
			tail = prevNode;
			size--;
		}		
		return true;
	}
	
	public void reverse(){
		Node<T> current = head;
		Node<T> prev = null;
		Node<T> next = null;
		tail = head;
		while(current != null){
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}
	
	public void recursiveReverse(Node<T> temp){
		
	}
	
	
	
	public boolean remove(int index){
		if(index > size-1 || size ==0){
			throw new ArrayIndexOutOfBoundsException(index);
		}else{
			int temp =0;
			Node<T> prevNode = head;
			while(temp != index-1){
				prevNode = prevNode.getNext();
				temp++;
			}
			
			Node<T> targetNode = prevNode.getNext();
			prevNode.setNext(targetNode.getNext());
			targetNode = null;
			
			size--;
		}
		return true;
	}

	public int getSize() {
		return size;
	}
	
	public void print(){
		Node<T> temp = head;
		while(temp!=null){
			System.out.print(temp.getValue()+", ");
			temp = temp.getNext();
		}
		System.out.print("\n");
	}
	
}
