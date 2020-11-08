import org.junit.Assert;
import org.junit.Test;

import linkedlist.*;

public class QueueTest {
	@Test
	public void givenValues_WhenAddedToQueue_ShouldAddedToRearOfQueue() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		Queue<Integer> queue = new Queue<>();
		queue.enQueue(firstNode);
		queue.enQueue(secondNode);
		queue.enQueue(thirdNode);
		queue.printStack();
		boolean result = firstNode.getNext().equals(secondNode) &&
				secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void whenDeQueueOperationInQueue_ShouldRemoveValueFromFrontOfQueue() {
		Node<Integer> firstNode = new Node<Integer>(56);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(70);
		Queue<Integer> queue = new Queue<>();
		queue.enQueue(firstNode);
		queue.enQueue(secondNode);
		queue.enQueue(thirdNode);
		queue.printStack();
		Node<Integer> removeNode = queue.deQueue();
		System.out.println("Removed Value " + removeNode.getValue());
		queue.printStack();
		Assert.assertEquals(firstNode, removeNode);
	}
}
