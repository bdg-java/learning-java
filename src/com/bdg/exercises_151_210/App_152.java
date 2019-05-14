package com.bdg.exercises_151_210;

public class App_152 {
    public static void main(String[] args) {

        int n= 10;
        int s =1;
        {
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                s*=i;
            }
        }
        System.out.println(s);

    }
}
}
