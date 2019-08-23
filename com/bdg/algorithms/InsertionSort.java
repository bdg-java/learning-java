package com.bdg.algorithms;

import com.bdg.other.getArrayRandomNumbers;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = new int[5];
        getArrayRandomNumbers.randomArrayNumbers(array,99,2);
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {//i decrement@ u arjeq@  anhaskanalia , vortev arjeq@ arajin loop-i jamanak darnuma -1
                //isk decrement@ dranic misht minus meka , aysinqn arajin 2 loopin -1 u 0
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                    System.out.println(Arrays.toString(array));
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}
