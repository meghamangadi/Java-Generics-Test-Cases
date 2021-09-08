package com.bridgelabz.generics;

public class Maximum<E extends Comparable> {

	E[] inputarray;
	E max;
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
	public static<E> void printarray(E[] inputarray,E max)
    {
        System.out.print("Maximum Element in the following Array { ");
        for(E element : inputarray) {
            System.out.printf("%s ", element);
        }
        System.out.println("} is "+max);
        System.out.println();
    }
}