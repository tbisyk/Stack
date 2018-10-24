package com.gmail.t.bisyk;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Stack st = new Stack();
		BlackList bl = new BlackList();

		bl.addClass(st.getClass().getSimpleName());
		bl.addClass("Integer");

		st.addToStack(false);
		st.addToStack("Hi");
		st.addToStack(1234);
		st.addToStack(true);
		st.addToStack(4.5);
		st.addToStack(st);
		st.addToStack(9);
		System.out.println("-----------------");

		st.removeFromStack();
		System.out.println(st);
		System.out.println("-----------------");

		if (st.firstElementFromStack() == null)
			System.out.println("Stack is empty");
		else
			System.out.println(st.firstElementFromStack());
	}

}
