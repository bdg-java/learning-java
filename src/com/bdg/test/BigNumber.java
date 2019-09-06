package com.bdg.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BigNumber {

    private static List multiply(List<BigInteger> A, List<Integer> b){

        List<BigInteger> multiplyArray = new ArrayList<>();
        BigInteger multiplyAB;

        for(int i = 0; i < 9; i++){
            multiplyAB = A.get(i).multiply(BigInteger.valueOf(b.get(i)));
            multiplyArray.add(multiplyAB);
            System.out.println("A " + A.get(i));
            System.out.println("b " + b.get(i));
            System.out.println("A*b " + multiplyArray.get(i));
        }
        return multiplyArray;
    }

    private static List add(List<BigInteger> A, List<BigInteger> B){
        List<BigInteger> C = new ArrayList<>();
        BigInteger addAB;

        for(int i = 0; i < 9; i++){
            addAB = A.get(i).add(B.get(i));
            C.add(addAB);
            System.out.println("A " + A.get(i));
            System.out.println("B " + B.get(i));
            System.out.println("A+B " + C.get(i));
        }
        return C;
    }

    public static void main(String[] args) {

        Random rnd = new Random();
        List<BigInteger> A = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<BigInteger> B = new ArrayList<>();
        int i = 0;
        while (i < 9) {
            A.add(BigInteger.valueOf(rnd.nextLong()).abs());
            b.add(i+1);
            B.add(BigInteger.valueOf(rnd.nextLong()));
            i++;
        }
        multiply(A,b);
        System.out.println();
        add(A,B);
    }
}
