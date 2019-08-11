package com.bdg.repetition.from31to40;

public class Task32 {

    public static void main(String[] args) {
        String min = "MIN is ";

        if(rs.a < rs.b && rs.a < rs.c && rs.a < rs.d){
            System.out.println(min + rs.a);
        } else if(rs.b < rs.a && rs.b < rs.c && rs.b < rs.d){
            System.out.println(min + rs.b);
        } else if(rs.c < rs.a && rs.c < rs.b && rs.c < rs.d){
            System.out.println(min + rs.c);
        } else{
            System.out.println(min + rs.d);
        }
    }

}
