package com.bdg.agharibyan.app_646_670;

import java.util.Arrays;

public class App_652 {
    public static void main(String[] args) {

        int n = 7;
        char [] array1 = new char [] {'0','A','z','a','*','0','z'};
        char [] array2 = new char [] {'7','A','%','k','v','0','*'};

        char [] newarray = new char [n];
        int qanak = 0;
        int length = 0;

        for(int i = 0; i < n; i++){
            char duplicateElement = array2[i];
            for(int k = 0; k < n; k++){
                if(array2[i] == array1[k]){
                    qanak++;
                    duplicateElement = array1[k];
                }
            }
            if(qanak >= 1){
                newarray[length] = duplicateElement;
                length++;
            }
            qanak = 0;
        }

        char [] duplicateArray = new char[length];

        if(length > 0){
            for(int j = 0; j < length; j++){
                duplicateArray[j] = newarray[j];
            }
        }
        System.out.print(Arrays.toString(duplicateArray));
    }
}
