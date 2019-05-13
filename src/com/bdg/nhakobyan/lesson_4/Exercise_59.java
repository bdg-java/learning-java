package com.bdg.nhakobyan.lesson_4;

public class Exercise_59 {
    public static void main(String[] args) {
        int from = 100 , to = 999; // random number's range
        int num = from + (int)(Math.random() * to); // getting random number
        System.out.println("The number is " + num);
        int miavor = num % 10;
        int tasnavor = (num / 10)% 10;
        int haryuravor = num / 100 ;
//աճման կարգով
        if (miavor < tasnavor && miavor < haryuravor ){
            if (tasnavor < haryuravor )
                System.out.println(miavor + " " + tasnavor +" " + haryuravor );
            else{
                System.out.println(miavor + " " + haryuravor + " "+ tasnavor );
            }
        }
        else if  ( miavor < tasnavor && miavor > haryuravor){
            System.out.println(haryuravor +" "+ miavor +" "+ tasnavor );
        }
        else if (miavor > tasnavor && miavor < haryuravor)
            System.out.println(tasnavor + " "+ miavor +" "+ haryuravor);
        else if (miavor > tasnavor && miavor > haryuravor){
            if (tasnavor > haryuravor)
                System.out.println(haryuravor + " " + tasnavor + " " + miavor);
            else{
                System.out.println(tasnavor + " " + haryuravor + " " + miavor  );
            }
        }

    }
}
