import java.util.Arrays;

class EmptyStackException extends Exception {}

public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITAL_CAPACITY = 16;
	
	public Stack() { // Constructor
		elements = new Object[DEFAULT_INITAL_CAPACITY];
	}
	
	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}
	
	public Object pop() throws EmptyStackException {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // 참조 해제
		return result;
		/* return elements[--size];*/
	}
	
	/*
	 * 원소를 위한 공간을 적어도 하나 이상 확보함.
	 * 배열 크기를 늘려야 할 때마다 대략 두 배씩 늘림.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
}
