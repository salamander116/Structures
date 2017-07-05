class Stack<E> {

	private int size;
	private int top;
	private E[] stack;

	public Stack() {
		this(10);
	}

	@SuppressWarnings("unchecked")
	public Stack(int s) {
		size = s > 0 ? s : 10;
		top = -1;

		stack = (E[]) new Object[size];
	}

	public void push(E object) {
		stack[++top] = object;
	}

	public E pop() {
		return stack[top--];
	}
}