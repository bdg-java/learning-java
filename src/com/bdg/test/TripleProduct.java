package com.bdg.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TripleProduct {

    private static int tripleProduct1Version(List<Integer> array){

        System.out.println(array);
        int max = 0;
        for(int i = 0; i < array.size(); i++) {
            for(int j = 1; j < array.size(); j++){
                for(int k = 2; k < array.size(); k++){
                    if(i != j  && j != k && i != k && array.get(i)*array.get(j)*array.get(k) >= max){
                        max = array.get(i)*array.get(j)*array.get(k);
                    }
                }
            }
        }
        return max;
    }

    private static int tripleProduct2Version(List<Integer> array){
        array.sort(Comparator.naturalOrder());
        System.out.println(array);
        int max = 1;
        if(array.get(1) < 0){
            if(array.get(0)*array.get(1)*array.get(array.size()-1) > array.get(array.size()-1)*array.get(array.size()-2)*array.get(array.size()-3)){
                max = array.get(0)*array.get(1)*array.get(array.size()-1);
            } else{
                max = array.get(array.size()-1)*array.get(array.size()-2)*array.get(array.size()-3);
            }
        } else{
            max = array.get(array.size()-1)*array.get(array.size()-2)*array.get(array.size()-3);
        }

        return max;
    }

    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(6);
        array.add(0);
        array.add(3);
        array.add(5);
        array.add(-6);

        boolean isOk = false;

        if (array.size() >= 3 && array.size() <= 104) {
            for (Integer a : array) {
                if (a >= -1000 && a <= 1000) {
                    isOk = true;
                }
            }
        }

        if(isOk){
            System.out.println(tripleProduct1Version(array)); // first version
            System.out.println(tripleProduct2Version(array)); // second version
        }
    }
}
