package com.homework;

import java.util.Scanner;

public class Task37 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		int max = a;
		
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		
		int min = a;
		
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
		
		//Sorting in ascending order
		if (a == max) {
			int temp = d;
			d = a;
			a = temp;
		}
		if (b == max) {
			int temp = d;
			d = b;
			b = temp;
		}
		if (c == max) {
			int temp = d;
			d = c;
			c = temp;
		}
		
		if (b == min) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (c == min) {
			int temp = a;
			a = c;
			c = temp;
		}
		if (d == min) {
			int temp = a;
			a = d;
			d = temp;
		}
		
		if (b > c){
			int temp = c;
			b = c;
			c = temp;
		}
		
		if (b - a == c - b && c - b == d - c)
			System.out.println(true);
		else
			System.out.println(false);
	}	
}