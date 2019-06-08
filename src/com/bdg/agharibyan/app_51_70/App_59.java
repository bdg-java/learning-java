package com.bdg.agharibyan.app_51_70;

/**@autor Ani Gharibyan
 *
 */
public class App_59 {
    public static void main(String[] args) {

        int a = 567;
        int m = a%10;
        int t = a%100/10;
        int h = a%1000/100;

        if ( m < t && t < h ){
            System.out.println( m +","+ t +","+ h );
        } else if ( m < t && h < t && m < h ){
            System.out.println( m +","+ h +","+ t );
        } else if ( m < t && h < t && h < m ){
            System.out.println( h +","+ m +","+ t );
        } else if ( t < m && m < h ){
            System.out.println( t +","+ m +","+ h );
        } else if ( t < m && h < m && t < h ){
            System.out.println( t +","+ h +","+ m );
        } else {
            System.out.println( h +","+ t +","+ m );
        }
    }
}
