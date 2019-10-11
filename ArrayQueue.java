import java.util.*;

public class ArrayQueue<T> implements Queue<T> {
	Object[] a;
	int front;
	int back;

	public ArrayQueue() {
		a = new Object[10];
		this.front = 0;
		this.back = 0;
	}

	public boolean empty() {
		return back==front;
	}

	public Object dequeue() {
		//check to see if empty
		// if(empty())
		// 	throw new Exception("Queue is empty.");
		// T item = a[front];
		// front = (front+1) % a.length;
		return a[front++];
	}

	public void enqueue(Object item) {
		if(back==a.length)
			grow_array();
		//return a[back++];
		a[back++] = item;
		// back = back % a.length;
	}

	void grow_array() {
		Object[] new_a = Arrays.copyOf(a,a.length*2);
		a = new_a;
	}
}