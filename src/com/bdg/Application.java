package com.bdg;


/**
 * @author William Arustamyan
 */


public class Application {

    public static void main(String[] args) {

        int x = 300;

        if (x == 200) {
            System.out.println("OK");
        } else if (x == 300) {
            System.out.println("Multiple Choice");
        } else if (x == 404) {
            System.out.println("Not Found");
        } else if (x == 500) {
            System.out.println("Internal Server Error");
        } else {
            System.out.println("Unexpected response");
        }



        switch (x) {
            case 200:
                System.out.println("OK");
                break;
            case 300:
                System.out.println("Multiple Choice");
                break;
            case 404:
                System.out.println("Not Found");
                break;
            case 500:
                System.out.println("Internal Server Error");
                break;
            default:
                System.out.println("Unexpected response");
        }
    }
}
