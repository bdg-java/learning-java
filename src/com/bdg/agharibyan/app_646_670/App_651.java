package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_651 {
    public static void main(String[] args) {

        int n = 7;
        char [] array = new char [] {'0','A','z','a','0','0','z'};

        char [] newarray = new char [n];
        int length = 0;
        int qanak = 0;

        for(int i = 0; i < n; i++){
            char duplicateElement = array[i];
            for(int k = 0; k < n; k++){
                if(array[i] == array[k]){
                    qanak++;
                    duplicateElement = array[k];
                }
            }
            if(qanak == 1){
                newarray[length] = duplicateElement;
                length++;
            }
            qanak = 0;
        }

        char [] noDuplicateArray = new char[length];

        if(length > 0){
            for(int j = 0; j < length; j++){
                noDuplicateArray[j] = newarray[j];
            }
        }
        System.out.print(Arrays.toString(noDuplicateArray));
    }
}
