package com.bridgelabz.generics;

public class Maximum<E extends Comparable> {

	E[] inputarray;

	Maximum(E[] inputarray) {
		this.inputarray = inputarray;

	}

	public E getmaximum() {
		E result = getmaximum(inputarray);
		return result;
	}

	public static <E extends Comparable> E getmaximum(E[] inputarray) {
		E max = inputarray[0];
		for (E element : inputarray) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}

		return max;
	}
}