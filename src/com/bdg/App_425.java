package com.bdg;

public class App_425 {

    public static void main(String[] args) {

        int [] [] matrix = new int [][]{

                {0, 1, 2, 3, 4},

                {54, 32, 96, 39, 45},

                {54, 15, 20, 59, 14}};

          int m = 3;
          int qount = 0;
          int sum = 0;

          for ( int i = 0; i < m ; i++){

              for (int j = 0; j < m ; j ++){

                  if ( j <= i){
                      if ( matrix [i] [j] % 2 == 0){

                          qount ++;

                          System.out.println(qount);

                      }
                  }
              }
        }
    }
}
