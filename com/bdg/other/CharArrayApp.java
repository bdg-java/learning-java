package com.bdg.other;

public class CharArrayApp {

    public static void main(String[] args) {

        char[] text = {'a', 'b', '{', 'a', '5', 'j'};
        int c = 0;
        for (int i = 0; i < text.length; i++) {
            if ((text[i] >= 'A' && text[i] <= 'z') || (text[i] >= '0' && text[i] <= '9')) {
                c++;
            }
        }
        System.out.println(c);


        int matrix[][] = {
                {2, 3, 6, 7},
                {2, 3, 6, 7},
                {2, 3, 6, 7},
        };

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(matrix[i][k] + ", ");
            }
            System.out.println();
        }

    }
}
