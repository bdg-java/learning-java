package com.homework;

import java.util.Scanner;

public class Task33 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
	if(a == 1 || b == 1 || c == 1 || d == 1)
		System.out.println(true);
	else
		System.out.println(false);
	}
}