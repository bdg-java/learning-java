package com.bdg.repetition.from231to250;

import java.util.Arrays;

public class qstn {

    public static void main(String[] args) {

        int [] a = rs.buildIntegerArray();
        int [] b = rs.buildIntegerArray();
        System.out.println(a.equals(b));
        System.out.println(Arrays.equals(a,b));                                                                                   //liarzheq nuynn e, inch vereviny?

        System.out.println(a.hashCode() == b.hashCode());




        int [] newarray = new int[10];
        System.out.println(a.equals(newarray));






        //ete a-n ev b-n Heapum nuyn hatvatsum en, inchpes em karoghanum ogtagortsel te a-i tvyalnery, te b-i?b-n chi jnjum a-i tvyalnery?
    }

}
