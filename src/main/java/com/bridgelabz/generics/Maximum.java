package com.bridgelabz.generics;

public class Maximum {
	public static void main(String[] args) {
		String a = "rat", b = "dog", c = "cat";
		getmaximum(a, b, c);
	}

	public static String getmaximum(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0 && b.compareTo(c) > 0)
			max = b;
		else if (c.compareTo(max) > 0)
			max = c;

		return max;
	}
}
