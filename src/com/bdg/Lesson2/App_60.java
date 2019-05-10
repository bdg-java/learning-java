package com.bdg.Lesson2;

public class App_60 {
    public static void main(String[] args) {

    int wholeNum = 438;
    int firstNum = wholeNum/100;
    int midNum  = wholeNum/10%10;
    int lastNum = wholeNum%10;

        if ((firstNum < midNum)&& (midNum < lastNum)){
        System.out.println(lastNum + "," + midNum + "," + firstNum);
    }
        else if ((firstNum < lastNum) && (lastNum < midNum)){
        System.out.println(midNum + "," + lastNum + ","+ firstNum);
    }
        else if ((midNum < firstNum) && (firstNum < lastNum)){
        System.out.println(lastNum + "," + firstNum + "," + midNum );
    }
        else if ((midNum < lastNum) && (lastNum < firstNum)) {
        System.out.println(firstNum + "," + lastNum +"," + midNum);
    }
        else if ((lastNum < firstNum) && (firstNum < midNum)) {
        System.out.println(midNum + "," + firstNum + "," +lastNum);
    }
        else if ((lastNum < midNum) && (midNum < firstNum )){
        System.out.println(firstNum + "," + midNum +","+ lastNum);
    }
  }
}


