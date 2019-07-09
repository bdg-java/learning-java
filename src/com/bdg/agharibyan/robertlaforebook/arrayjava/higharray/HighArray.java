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

    public long getMax(){
        if(nElemenets == 0){
            System.out.println("-1");
            return -1;
        } else{
            long curMax = a[0];
            for(int j = 0; j < nElemenets; j++){
                if(curMax < a[j+1]){
                    curMax = a[j+1];
                }
            }
            return curMax;
        }
    }

    public boolean removeMax(){
        this.delete(this.getMax());
        return true;
    }

    public void noDups(){
        for(int i = 0; i < nElemenets; i++) {
            for(int k = i+1; k < nElemenets; k++){
                if(a[i] == a[k]){
                    a[k] = -1;
                }
            }
        }
        while(this.find(-1)){
            this.delete(-1);
        }
    }

}
