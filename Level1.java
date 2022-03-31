package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static int [] UFO(int N, int [] data, boolean octal) {

        int base = octal ? 8 : 16;

        int [] res = new int[N];

        for(int i=0; i<N; i++) {

            int nBase = data[i];
            int n10 = 0;
            int pow = 0;
            while( nBase >= 1 ) {
                int n = nBase % 10;
                n10 += n * Math.pow(base, pow);
                nBase /= 10;
                pow += 1;
            }

            res[i] = n10;
        }

        return res;
    }
 }