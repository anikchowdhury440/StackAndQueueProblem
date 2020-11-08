import linkedlist.*;

public class Queue<K> {
	private final LinkedList<K> linkedlist;
	
	public Queue() {
		linkedlist = new LinkedList<>();
	}
	
	public void enQueue(Node<K> value) {
		linkedlist.append(value);
	}
	
	public Node<K> deQueue() {
		return linkedlist.pop();
	}
	
	public void printStack() {
		linkedlist.printNodes();
	}
}
