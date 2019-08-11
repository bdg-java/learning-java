package com.bdg.repetition.from31to40;

public class Task39 {

    public static void main(String[] args) {

        if(rs.a < rs.b){
            if(rs.b < rs.c){
                if(rs.c < rs.d){
                    System.out.println(rs.a + " , " + rs.b + " , " + rs.c + " , " + rs.d);
                } else if(rs.b < rs.d){
                    System.out.println(rs.a + " , " + rs.b + " , " + rs.d + " , " + rs.c);
                } else if(rs.a < rs.d){
                    System.out.println(rs.a + " , " + rs.d + " , " + rs.b + " , " + rs.c);
                } else{
                    System.out.println(rs.d + " , " + rs.a + " , " + rs.b + " , " + rs.c);
                }
            } else if(rs.a < rs.c){
                if(rs.b < rs.d){
                    System.out.println(rs.a + " , " + rs.c + " , " + rs.b + " , " + rs.d);
                } else if(rs.c < rs.d){
                    System.out.println(rs.a + " , " + rs.c + " , " + rs.d + " , " + rs.b);
                } else if(rs.a < rs.d){
                    System.out.println(rs.a + " , " + rs.d + " , " + rs.c + " , " + rs.b);
                } else{
                    System.out.println(rs.d + " , " + rs.a + " , " + rs.c + " , " + rs.b);
                }
            } else if(rs.b < rs.d){
                System.out.println(rs.c + " , " + rs.a + " , " + rs.b + " , " + rs.d);
            } else if(rs.a < rs.d){
                System.out.println(rs.c + " , " + rs.a + " , " + rs.d + " , " + rs.b);
            } else if(rs.c < rs.d){
                System.out.println(rs.c + " , " + rs.d + " , " + rs.a + " , " + rs.b);
            } else{
                System.out.println(rs.d + " , " + rs.c + " , " + rs.a + " , " + rs.b);
            }
        } else if(rs.a < rs.c){
            if(rs.c < rs.d){
                System.out.println(rs.b + " , " + rs.a + " , " + rs.c + " , " + rs.d);
            } else if(rs.a < rs.d){
                System.out.println(rs.b + " , " + rs.a + " , " + rs.d + " , " + rs.c);
            } else if(rs.b < rs.d){
                System.out.println(rs.b + " , " + rs.d + " , " + rs.a + " , " + rs.c);
            } else{
                System.out.println(rs.d + " , " + rs.b + " , " + rs.a + " , " + rs.c);
            }
        } else if(rs.b < rs.c){
            if(rs.a < rs.d){
                System.out.println(rs.b + " , " + rs.c + " , " + rs.a + " , " + rs.d);
            } else if(rs.c < rs.d){
                System.out.println(rs.b + " , " + rs.c + " , " + rs.d + " , " + rs.a);
            } else if(rs.b < rs.d){
                System.out.println(rs.b + " , " + rs.d + " , " + rs.c + " , " + rs.a);
            } else{
                System.out.println(rs.d + " , " + rs.b + " , " + rs.c + " , " + rs.a);
            }
        } else if(rs.a < rs.d){
            System.out.println(rs.c + " , " + rs.b + " , " + rs.a + " , " + rs.d);
        } else if(rs.b < rs.d){
            System.out.println(rs.c + " , " + rs.b + " , " + rs.d + " , " + rs.a);
        } else if(rs.c < rs.d){
            System.out.println(rs.c + " , " + rs.d + " , " + rs.b + " , " + rs.a);
        } else{
            System.out.println(rs.d + " , " + rs.c + " , " + rs.b + " , " + rs.a);
        }
    }

}
