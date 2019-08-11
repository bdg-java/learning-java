package com.bdg.repetition.from31to40;

public class Task36 {

    public static void main(String[] args) {

//        if(rs.a%2 != 0){
//            if(rs.b%2 != 0 || rs.c%2 != 0 || rs.d%2 != 0){
//                System.out.println(1);
//            } else{
//                System.out.println(2);
//            }
//        } else if(rs.b%2 != 0){
//            if(rs.c%2 != 0 || rs.d%2 != 0){
//                System.out.println(1);
//            } else{
//                System.out.println(2);
//            }
//        } else if(rs.c%2 !=0 && rs.d%2 != 0){
//            System.out.println(1);
//        } else{
//            System.out.println(2);
//        }

        //short  solution

        int  oddnumbers = 0;
        if(rs.a%2 != 0){
            oddnumbers ++;
        }
        if(rs.b%2 != 0){
            oddnumbers++;
        }
        if(rs.c%2 != 0){
            oddnumbers++;
        }
        if(rs.d%2 != 0){
            oddnumbers++;
        }
        if(oddnumbers >= 2){
            System.out.println(1);
        } else{
            System.out.println(2);
        }
    }

}
