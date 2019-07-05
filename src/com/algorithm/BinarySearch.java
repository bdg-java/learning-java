package com.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {1, 4, 7, 8, 13, 15, 19, 23, 29, 30, 32, 34};
        int found = 34;
        System.out.println(binarySearch(a, found));
        System.out.println(binarySearchRecurcive(a, found, 0, a.length - 1));
    }

    public static int binarySearch(int[] a, int found) {
        int first = 0;
        int last = a.length - 1;
        int mid = -1;

        if (a[first] == found)
            return first;
        if (a[last] == found)
            return last;

        while (first < last) {
            mid = first + (last - first) / 2;
            if (a[mid] == found)
                return mid;
            if (found > a[mid])
                first = mid + 1;
            else last = mid - 1;
        }
        return -1;
    }

    public static int binarySearchRecurcive(int a[], int found, int first, int last) {
        if (first > last) return -1;
        if (a[first] == found) return first;
        if (a[last] == found) return last;
        int mid = first + (last - first) / 2;
        if (a[mid] == found) return mid;
        if (found > a[mid])
            return binarySearchRecurcive(a, found, mid + 1, last);
        else return binarySearchRecurcive(a, found, 0, mid - 1);


    }


}
