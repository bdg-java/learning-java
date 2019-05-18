package com.homework;

public class Task55 {
	public static void main(String[] args){
		int a = 123;
		
		int lastNumber = a % 10;
		int midNumber = a % 100 / 10;
		int firstNumber = a / 100;
		
		int min = lastNumber;
		
		if (midNumber < min)
			min = midNumber;
		if (firstNumber < min)
			min = firstNumber;	
		
		System.out.println(min);
	}
}