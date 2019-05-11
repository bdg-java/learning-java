package com.homework;

public class Task57 {
	public static void main(String[] args){
		int a = 321;
		
		int lastNumber = a % 10;
		int midNumber = a % 100 / 10;
		int firstNumber = a / 100;
		
		System.out.println(a > 300 ? midNumber / lastNumber : lastNumber / lastNumber);
	}
}