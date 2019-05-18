package com.homework;

import java.util.Scanner;

public class Task36 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt() % 2;
		int b = scanner.nextInt() % 2;
		int c = scanner.nextInt() % 2;
		int d = scanner.nextInt() % 2;
		
		if ((a + b + c + d) >= 2)
			System.out.println(true);
		else
			System.out.println(false);		
	}	
}