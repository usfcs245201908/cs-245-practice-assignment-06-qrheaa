import java.util.*;

public class ArrayStack<T> implements Stack<T> {
	int top;
	Object[] a;

	public ArrayStack() {
		a = new Object[10];
		top = -1;
	}

	public boolean empty() {
		return top == -1;
	}

	public Object pop(){ //throws Exception {
		//takes out recent element added
		//always have empty case
		// if(empty()) {
		// 	throw new Exception("Stack is empty.");
		// }
		return a[top--];
	} //Constant time: O(1)

	public void push(Object item) {
		if(a.length - 1 == top)
			grow_array();
		a[++top] = item;
	} //O(1)

	public Object peek() {//throws Exception {
		// if(empty())
		// 	throw new Exception("Stack is empty.");
		return a[top];
	} //O(1)

	void grow_array() {
		Object[] new_a = Arrays.copyOfRange(a,0,a.length*2);
		a = new_a;
	}


}