package com.bdg.agharibyan.robertlaforebook.arrayjava.higharray;

public class HighArray {

    private long[] a;
    private int nElemenets;

    public HighArray(int max){
        a = new long[max];
        nElemenets = 0;
    }

    public boolean find(long searchKey){
        int j;
        for(j = 0; j < nElemenets; j++){
            if(a[j] == searchKey){
                break;
            }
        }
        if(j == nElemenets){
            return false;
        } else{
            return true;
        }
    }

    public void insert(long value){
        a[nElemenets] = value;
        nElemenets++;
    }

    public boolean delete(long value){
        int j;
        for(j = 0; j < nElemenets; j++){
            if(a[j] == value){
                break;
            }
        }
        if(j == nElemenets){
            return false;
        } else {
            for(int k = j; k < nElemenets; k++){
                a[k] = a[k+1];
            }
            nElemenets--;
            return true;
        }
    }

    public void display(){
        for(int j = 0; j < nElemenets; j++){
            System.out.print(a[j] + " ");
        }
    }


}
