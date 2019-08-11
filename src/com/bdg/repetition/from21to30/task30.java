package com.bdg.repetition.from21to30;

public class task30 {

    public static void main(String[] args) {

        if(rs.a > rs.b && rs.b > rs.c){
            System.out.println(rs.a + " , " + rs.b + " , " + rs.c);
        }else if(rs.a > rs.b && rs.c > rs.b && rs.a > rs.c){
            System.out.println(rs.a + " , " + rs.c + " , " + rs.b);
        } else if(rs.a > rs.b && rs.c > rs.b && rs.c > rs.a){
            System.out.println(rs.c + " , " + rs.a + " , " + rs.b);
        } else if(rs.b > rs.a && rs.a > rs.c){
            System.out.println(rs.b + " , " + rs.a + " , " + rs.c);
        } else if(rs.b > rs.a && rs.c > rs.a && rs.b > rs.c){
            System.out.println(rs.b + " , " + rs.c + " , " + rs.a);
        }else{
            System.out.println(rs.c + " , " + rs.b + " , " + rs.a);
        }
    }

}
