package com.homework;

import java.util.Scanner;

public class Task34 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		if ((a + b == c + d) || (a + c == b + d) || (a + d == b + c))
			System.out.println(true);
		else
			System.out.println(false);
	}
}