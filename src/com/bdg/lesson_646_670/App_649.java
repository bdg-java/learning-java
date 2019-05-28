package com.bdg.lesson_646_670;

import com.bdg.lessonarays_2.SetCharArray;

public class App_649 {
    public static void main(String[] args) {
        char[] array = {'w', 'z', 'e', 'g', 'z', 'a'};
        SetCharArray.displayArray(array);
        int count = 0;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'z') {
                index1 = i;
                break;
            }
        }
        for (int i = index1 + 1; i < array.length; i++) {
            if (array[i] == 'z') {
                index2 = i;
                }
            }

        for (int i = index1+1; i<index2; i++){
                count++;
            }
            System.out.println(count);
        }
    }
