
public interface Queue<T> {
	
	public Object dequeue();
	public void enqueue(Object item);
	public boolean empty();

}
