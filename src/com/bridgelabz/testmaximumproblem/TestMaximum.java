package com.bridgelabz.testmaximumproblem;

public class TestMaximum { 
	public static void getMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) {
		if (firstNumber.compareTo(secondNumber) > 0) {
			if (firstNumber.compareTo(thirdNumber) > 0) {
				System.out.println(firstNumber);
			} 
			else {
				System.out.println(thirdNumber);
			}
		} 
		else {
			if (secondNumber.compareTo(thirdNumber) > 0) {
				System.out.println(secondNumber);
			} 
			else {
				System.out.println(thirdNumber);
			}
		}
	}
	public static void main(String[] args) {
		getMaximum(31,1313,131);
		
	}
}