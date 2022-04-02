package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static int Unmanned(int L, int N, int [][] track) {

        int time = 0;

        for(int i=0; i<=N; i++) {

            if(i == N) {
                time += L-track[i-1][0];
                break;
            }

            int [] pCur = track[i];
            int [] pPrev = {0,0,0};
            if(i>0)
                pPrev = track[i-1];

            if(pCur[0] > L) {
                time += L - pPrev[0];
                break;
            }

            time += pCur[0]-pPrev[0];

            boolean isRed = true;
            int t = time;
            while(t > 0) {
                if(isRed) {
                    t -= pCur[1];
                    isRed = false;
                } else {
                    t -= pCur[2];
                    isRed = true;
                }
            }
            if(isRed == false) time = time - t;
        }

        return time;
    }


//    public static int [] UFO(int N, int [] data, boolean octal) {
//
//        int base = octal ? 8 : 16;
//
//        int [] res = new int[N];
//
//        for(int i=0; i<N; i++) {
//
//            int nBase = data[i];
//            int n10 = 0;
//            int pow = 0;
//            while( nBase >= 1 ) {
//                int n = nBase % 10;
//                n10 += n * Math.pow(base, pow);
//                nBase /= 10;
//                pow += 1;
//            }
//
//            res[i] = n10;
//        }
//
//        return res;
//    }
 }