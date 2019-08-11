package com.bdg.repetition.from51to60;

public class Task54 {

    public static void main(String[] args) {

        //which one do you choose(1 or 2)?

        if(rs.m > rs.t && rs.m > rs.h){ // 1.
            System.out.println(rs.m);
        }
        if(rs.t > rs.m && rs.t > rs.h){
            System.out.println(rs.t);
        }
        if(rs.h > rs.m && rs.h > rs.t){
            System.out.println(rs.h);
        }

        if(rs.m > rs.t && rs.m > rs.h){ // 2.
            System.out.println(rs.m);
        } else if(rs.t > rs.m && rs.t > rs.h){
            System.out.println(rs.t);
        }else{
            System.out.println(rs.h);
        }
    }

}
