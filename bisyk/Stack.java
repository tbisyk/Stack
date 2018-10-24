package com.gmail.t.bisyk;

import java.io.IOException;
import java.util.Arrays;

public class Stack {
	private Object[] stack = new Object[0];
	private BlackList bl = new BlackList();
	private ReturnFirstElement rfe = new ReturnFirstElement();

	public Stack() {
		super();
	}

	public void addToStack(Object obj) {
		if (bl.inBL(obj.getClass().getSimpleName())) {
			System.out.println("Object "+obj.getClass().getSimpleName() + "("+obj+") in blacklist");
			return;
		}
		stack = Arrays.copyOfRange(stack, 0, stack.length + 1);

		for (int i = stack.length - 1; i > 0; i--) {
			stack[i] = stack[i - 1];
		}
		stack[0] = obj;
		System.out.println(stack[0]+" add to stack.");
	}

	public void removeFromStack() {
		if (stack.length == 0)
			return;
		System.out.println(stack[0] + " remove from stack");
		for (int i = 0; i < stack.length - 1; i++) {
			stack[i] = stack[i + 1];
		}
		stack = Arrays.copyOfRange(stack, 0, stack.length - 1);
	}

	public Object firstElementFromStack() {
		if (stack.length == 0)
			return null;
		try {
			rfe.saveElementToFile(stack[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Object out = rfe.readElementFromFile();
		return out;

	}
	@Override
	public String toString() {
		return "Stack = " + Arrays.toString(stack);
	}

}
