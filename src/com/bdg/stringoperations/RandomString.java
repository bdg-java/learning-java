package com.bdg.stringoperations;

public class RandomString {
   public static String generateRandomString(int n)
    {
        String alphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder(n);
        for (int i =0;i<n;i++){
            int index =(int) (alphaString.length()*Math.random());
            sb.append(alphaString.charAt(index));
        }
        return  sb.toString();


    }
}
