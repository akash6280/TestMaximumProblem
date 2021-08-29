package com.bridgelabz.testmaximumproblem;

public class TestMaximum { 
	public static void getMaximum(String firstWord, String secondWord, String thirdWord) {
		if (firstWord.compareTo(secondWord) > 0) {
			if (firstWord.compareTo(thirdWord) > 0) {
				System.out.println(firstWord);
			} 
			else {
				System.out.println(thirdWord);
			}
		} 
		else {
			if (secondWord.compareTo(thirdWord) > 0) {
				System.out.println(secondWord);
			} 
			else {
				System.out.println(thirdWord);
			}
		}
	}
	public static void main(String[] args) {
		getMaximum("Apple","Peach","Banana");
		
	}
}