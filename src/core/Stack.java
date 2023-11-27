package core;

public class Stack implements IStack {
	
	Object stack[];
	int top,size,maxTop;
	
	Stack(int size){
		this.size = size;
		stack = new Object[size];
		top = -1;
		maxTop = size-1;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

	@Override
	public boolean isFull() {
		return top == maxTop;
	}
	
	@Override
	public void push(Object elm) throws Exception {
		if(isEmpty()) {
			stack[++top] = elm;
		}
		else {
			if(isFull()){
				throw new Exception("Stack is full");
			}
			else {
				if(elm.getClass()!= stack[0].getClass()) {
					throw new Exception("All elements in the stack must be of the same type.");
				}
				else {
					stack[++top] = elm;
				}
			}
		}
	}

	@Override
	public Object pop() {
		if(isEmpty()) {
			System.out.print("Error");
			return -1;
		}
		else {
			return stack[top--];
		}
	}

	@Override
	public Object top() {
		if(isEmpty()) {
			System.out.print("Error");
			return -1;
		}
		else{
			return stack[top];
		}
	}
	
}
