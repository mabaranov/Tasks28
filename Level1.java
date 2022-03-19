package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static double determineDistance(int a, int b) {
        if( (a == 1 && b == 5)
            || (a == 1 && b == 8)
            || (a == 2 && b == 4)
            || (a == 2 && b == 6)
            || (a == 2 && b == 7)
            || (a == 2 && b == 9)
            || (a == 3 && b == 5)
            || (a == 3 && b == 8)
            || (a == 4 && b == 2)
            || (a == 5 && b == 1)
            || (a == 5 && b == 3)
            || (a == 6 && b == 2)
            || (a == 7 && b == 2)
            || (a == 8 && b == 1)
            || (a == 8 && b == 3)
            || (a == 9 && b == 2) ) {

            return Math.sqrt(2);
        }

        return 1;
    }

    public static String PatternUnlock(int N, int [] hits) {

        double sum = 0;
        for(int i=0; i<N-1; i++) {
            sum += determineDistance(hits[i], hits[i+1]);
        }

        int sum5 = (int) (sum * 100000);

        if(sum*100000 - sum5 >= 0.5)
            sum5 += 1;

        String tmp = "";
        while( sum5 > 0 ) {

            int rightNumber = sum5%10;
            sum5 = (int)sum5/10;

            if (rightNumber != 0) {
                tmp += rightNumber;
            }
        }

        String res = "";
        for(int i=tmp.length()-1; i>=0; i--) {
            res += tmp.charAt(i);
        }

        return res;
    }

    public static void bubbleSort(int [] arr) {

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    int buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
    }

    public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {

        int [] tmpIds = Arrays.copyOf(ids, N);

        bubbleSort(tmpIds);
        bubbleSort(salary);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++) {
            map.put(tmpIds[i], salary[i]);
        }

        int [] res = new int[N];
        for(int i=0; i<N; i++) {
            res[i] = map.get( ids[i]);
        }

        return res;
    }

    public static int [] MadMax(int N, int [] Tele) {

        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < Tele.length-1; i++) {
                if(Tele[i] > Tele[i+1]){
                    isSorted = false;
                    int buf = Tele[i];
                    Tele[i] = Tele[i+1];
                    Tele[i+1] = buf;
                }
            }
        }

        int [] res = new int[N];
        for(int i=0; i<=N/2; i++) {
            if(i == N/2)
                res[N-1] = Tele[i];
            else {
                res[i] = Tele[i];
                res[N / 2 + i] = Tele[N - i - 1];
            }
        }

        return res;
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