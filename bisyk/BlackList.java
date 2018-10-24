package com.gmail.t.bisyk;

import java.util.Arrays;

public class BlackList {
	private static String[] bl = new String[0];

	public BlackList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addClass(String cls) {
		if (inBL(cls))
			return;
		bl = Arrays.copyOfRange(bl, 0, bl.length + 1);
		bl[bl.length - 1] = cls;
	}

	public void removeClass(String cls) {
		if (!inBL(cls)) {
			System.out.println("This class is not blacklisted.");
			return;
		}
		for (int i = 0; i < bl.length; i++) {
			if (bl[i].equals(cls.toString())) {
				bl[i] = null;
			}
		}
	}

	public boolean inBL(String obj) {
		if (bl.length == 0)
			return false;
		for (String i : bl) {
			if (i.equals(obj))
				return true;
		}
		return false;
	}

}
