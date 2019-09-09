package com.bdg.test;

public class TwoBucketsWithRecursion {

    private static int pour(int m, int n, int d){
        int c = 0;
        if(d%GCD(m,n) == 0){
            if (m > n) {
                c = findMinimumSteps(m,n,d);
            } else if (m < n) {
                c = findMinimumSteps(n,m,d);
            }
        } else {
            System.out.println(GCD(m,n));
            System.out.println("Our case don't have solution. We must replace d, if m isn't equal n or we must replace m or n,they must not be equal.");
        }
        return c;
    }

    private static int findMinimumSteps(int m, int n, int d){
        int from = m, to = 0;
        int step = 1;
        while( from != d || to != d){
            int temp;
            if(from < n - to){
                temp = from;
            } else{
                temp = n - to;
            }
            from = from - temp;
            to = to + temp;
            step ++;

            if(from == d || to == d){
                break;
            }

            if(from == 0){
                from = m;
                step++;
            }

            if(to == n){
                to = 0;
                step++;
            }
        }
        return step;
    }

    private static int GCD(int m, int n){
        if(m == 0){
            return n;
        }
        return GCD(n%m, m);
    }

    public static void main(String[] args) {
        int m = 5, n = 3, d = 4;

        if(m > 0 && n > 0 && (m > d || n > d)){
            System.out.println("the minimum steps " + pour(m,n,d));
        } else{
            System.out.println("d must be smaller of displacement of one of buckets");
        }


    }
}
