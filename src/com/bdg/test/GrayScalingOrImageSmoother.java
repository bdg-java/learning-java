package com.bdg.test;

import java.util.Arrays;

public class GrayScalingOrImageSmoother {

    private static int[][] imageSmoother(int[][] M){
        int R = M.length, C = M[0].length;
        int[][] answer = new int[R][C];

        for(int r = 0; r < M.length; r++){
            for(int c = 0; c < M[0].length; c++){
                int count = 0;
                for(int nr = r-1; nr <= r+1; nr++){
                    for(int nc = c-1; nc <= c+1; nc++) {
                        if (nr >= 0 && nr < R && nc >= 0 && nc < C) {
                            answer[r][c] += M[nr][nc];
                            count++;
                        }
                    }
                }
                answer[r][c] = answer[r][c]/count;
            }
        }
        return answer;
    }

    private static void print2DArray(int[][]M){
        for(int r = 0; r < M.length; r++){
            for(int c = 0; c < M[0].length; c++){
                System.out.print(M[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void print2dArray(int[][]M){
        for(int[] r: M){
            for(int c: r){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] M = new int[][]{
                {2, 2, 2, 2, 2},
                {2, 1, 1, 1, 2},
                {2, 1, 0, 1, 2},
                {2, 1, 1, 1, 2},
                {2, 2, 2, 2, 2}
        };

        print2DArray(M); //1st version
        print2dArray(M); //2nd version
        System.out.println();
        System.out.println(Arrays.deepToString(M)); //3rd version
        System.out.println();
        print2DArray(imageSmoother(M));

    }
}
