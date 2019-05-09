package com.bdg.Lesson2;

public class App_55 {

        public static void main(String[] args) {
            int wholeNum = 794;
            int firstNum = wholeNum/100;
            int midNum = wholeNum/10%10;
            int lastNum = wholeNum%10;

            if(firstNum < midNum && firstNum < lastNum){
                System.out.println("The minimum value is "+firstNum);
            }
            else if (midNum < firstNum && midNum < lastNum){
                System.out.println("The minimum value is "+midNum);
            }
            else if (lastNum < firstNum && lastNum < midNum){
                System.out.println("The minimum value is "+lastNum);
            }
        }
    }


