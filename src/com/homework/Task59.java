package com.homework;

public class Task59 {
	public static void main(String[] args){
		int a = 321;
		
		int lastNumber = a % 10;
		int midNumber = a % 100 / 10;
		int firstNumber = a / 100;
		
		int max = lastNumber;
		
		if (midNumber > max)
			max = midNumber;
		if (firstNumber > max)
			max = firstNumber;
		
		int min = lastNumber;
		
		if (midNumber < min)
			min = midNumber;
		if (firstNumber < min)
			min = firstNumber;
		
		//Sorting in ascending order
		if (lastNumber == max) {
			int temp = firstNumber;
			firstNumber = lastNumber;
			lastNumber = temp;
		}
		if (midNumber == max) {
			int temp = firstNumber;
			firstNumber = lastNumber;
			midNumber = temp;
		}
		
		if (midNumber == min) {
			int temp = lastNumber;
			lastNumber = midNumber;
			midNumber = temp;
		}
		if (firstNumber == min) {
			int temp = lastNumber;
			lastNumber = firstNumber;
			firstNumber = temp;
		}
		
			System.out.printf("%d %d %d", lastNumber, midNumber, firstNumber);
	}
}