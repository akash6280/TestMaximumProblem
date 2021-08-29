package com.bridgelabz.testmaximumproblem;

public class TestMaximum { 
	public static <T extends Comparable<T>> void getMaximum(T first, T second, T third) {
		if (first.compareTo(second) > 0) {
			if (first.compareTo(third) > 0)
				System.out.println(first);
			else
				System.out.println(third);
		} 
		else {
			if (second.compareTo(third) > 0) 
				System.out.println(second);
			else 
				System.out.println(third);
		}
	}
	public static void main(String[] args) {
		getMaximum(31,1313,131);
		getMaximum(31.0f,65.2f,63.8f);
		getMaximum("Apple","Peach","Banana");
		
	}
}