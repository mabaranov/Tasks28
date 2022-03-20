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

 }