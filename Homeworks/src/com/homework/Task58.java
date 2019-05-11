package com.homework;

public class Task58 {
	public static void main(String[] args){
		int a = 321;
		
		int lastNumber = a % 10;
		int midNumber = a % 100 / 10;
		int firstNumber = a / 100;
		
		char f;
		
		if (midNumber + firstNumber < 5)
			f = 'a';
		else
			f = 'b';
		
		System.out.println(f);
	}
}