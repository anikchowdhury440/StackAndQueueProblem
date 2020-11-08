import org.junit.Assert;
import org.junit.Test;

import linkedlist.*;

public class StackTest {
	
	@Test
	public void givenValues_WhenAddedToStack_ShouldAddedToTheTopOfStack() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<>();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		boolean result = thirdNode.getNext().equals(secondNode) &&
				secondNode.getNext().equals(firstNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void whenPeekOperationInStack_ShouldReturnTopValueOfStack() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<>();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		Node<Integer> topNode = stack.peek();
		System.out.println("Top of stack: " + topNode.getValue());
		Assert.assertEquals(thirdNode, topNode);
	}
	
	@Test
	public void whenPopkOperationInStack_ShouldRemoveValueFromTopOfStack() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<>();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.printStack();
		Node<Integer> topNode = stack.pop();
		System.out.println("Removed Value: " + topNode.getValue());
		stack.printStack();
		Assert.assertEquals(thirdNode, topNode);
	}
}
