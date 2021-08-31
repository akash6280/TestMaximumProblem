package com.bridgelabz.testmaximumproblem;

public class TestMaximum <E extends Comparable<E>>{
	E first,second, third;
	
	public TestMaximum(E first, E second, E third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

	 void getMaximum() {
		if (first.compareTo(second)> 0) {
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
		new TestMaximum<Integer>(31,1313,131).getMaximum();
		new TestMaximum<Float>(31.0f,65.2f,63.8f).getMaximum();
		new TestMaximum<String>("Apple","Peach","Banana").getMaximum();
		
	}
}