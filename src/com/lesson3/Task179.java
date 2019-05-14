package com.lesson3;

public class Task179 {
    public static void main(String[] args) {
        int n = 25, k = 2, q = 0;
        while (n > 0 && n >= k) {
            n -= k;
            q++;
        }
        System.out.println("Ostatok: " + n + "\n" + "Chastnoe : " + q);
    }
}
