package com.bdg.repetition.from51to60;

public class Task60 {

    public static void main(String[] args) {

        if(rs.m > rs.t && rs.t > rs.h){
            System.out.println(rs.m + " , " + rs.t + " , " + rs.h);
        } else if(rs.m > rs.h && rs.h > rs.t){
            System.out.println(rs.m + " , " + rs.h + " , " + rs.t);
        } else if(rs.t > rs.m && rs.m > rs.h){
            System.out.println(rs.t + " , " + rs.m + " , " + rs.h);
        } else if(rs.t > rs.h && rs.h > rs.m){
            System.out.println(rs.t + " , " + rs.h + " , " + rs.m);
        } else if(rs.h > rs.t && rs.t > rs.m){
            System.out.println(rs.h + " , " + rs.t + " , " + rs.m);
        } else{
            System.out.println(rs.h + " , " + rs.m + " , " + rs.t);
        }
    }

}
