import linkedlist.*;

public class Queue<K> {
	private final LinkedList<K> linkedlist;
	
	public Queue() {
		linkedlist = new LinkedList<>();
	}
	
	public void enQueue(Node<K> value) {
		linkedlist.append(value);
	}
	
	public void printStack() {
		linkedlist.printNodes();
	}
}
