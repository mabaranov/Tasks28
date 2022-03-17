package com.company;

import java.util.ArrayList;

public class Level1 {

    public static boolean isAreaFill(int [][] area) {
        for(int i=0; i<area.length; i++) {
            for(int j=0; j<area[i].length; j++) {
                if (area[i][j] == 0) return false;
            }
        }
        return true;
    }

    public static int ConquestCampaign(int N, int M, int L, int [] battalion) {

        int max = N * M;
        int days = 0;

        int [][] arealFill = new int[N][M];
        int [][] arealFill1 = new int[N][M];
        for(int i=0; i<N; i++)  {
            for(int j=0; j<M; j++) {
                arealFill[i][j] = 0;
                arealFill1[i][j] = 0;
            }
        }

        for(int i=0; i<battalion.length; i+=2) {
            int x = battalion[i];
            int y = battalion[i+1];
            arealFill[x-1][y-1] = 1;
            arealFill1[x-1][y-1] = 1;
        }

        boolean isFill = false;
        while( !isFill ) {
            isFill = true;
            for( int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {

                    int k = arealFill[i][j];
                    if(k == 0) isFill = false;
                    else {
                        if (i + 1 < N) arealFill1[i + 1][j] = 1;
                        if (i - 1 >= 0) arealFill1[i - 1][j] = 1;
                        if (j + 1 < M) arealFill1[i][j + 1] = 1;
                        if (j - 1 >= 0) arealFill1[i][j - 1] = 1;
                    }
                }
            }
            for (int i=0; i<N; i++) {
                for(int j=0; j<M; j++) {
                    arealFill[i][j] = arealFill1[i][j];
                }
            }
            days++;
        }

        return days;
    }

    public static int odometer(int [] oksana) {

        int s = 0;
        int h = 0;

        for (int i=0; i<oksana.length; i=i+2) {
             s += (oksana[i+1]-h) * oksana[i];
             h = oksana[i+1];
        }

        return s;
    }

    public static int factorial(int N) {
        int factorial = 1;
        for(int i=2; i<=N; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int squirrel(int N) {

        int emerald = factorial(N);

        while( (float)emerald/10 > 1) {
            emerald /= 10;
        }

        return emerald;
    }
}