package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    private static int [][] stringToArray(int h, int w, String s) {

        int [][] res = new int [h][w];
        String tmp = s;
        for (int i=0; i<h; i++) {

            int j = 0;
            while(j<tmp.length() && tmp.charAt(j) != ' ') {
                res[i][j] = Character.getNumericValue(tmp.charAt(j));
                j += 1;
            }
            if(j+1 < tmp.length())
                tmp = tmp.substring(j+1);
        }

        return res;
    }

    private static int [][] copySubArray(int start_i, int start_j, int count_i, int count_j, int size_i, int size_j, int [][] source) {

        int [][] res = new int [count_i][count_j];

        for(int i=0; i<count_i; i++) {
            for(int j=0; j<count_j; j++) {
                if (start_i+i < size_i && start_j+j < size_j)
                    res[i][j] = source[start_i+i][start_j+j];
            }
        }

        return res;
    }

    private static boolean compareArray(int size_i, int size_j, int [][] source, int [][] target) {

        for (int i=0; i<size_i; i++) {
            for (int j=0; j<size_j; j++) {
                if( source[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }

    public static boolean TankRush(int H1, int W1, String S1, int H2, int W2, String S2) {

        int [][] map = stringToArray(H1, W1, S1);
        int [][] tank = stringToArray(H2, W2, S2);

        int delta_i = 0;
        int delta_j = 0;
        boolean isFind = false;

        for (int i=0; i<H1; i++) {
            for (int j=0; j<W1; j++) {

                int source = map[i][j];
                int target = tank[delta_i][delta_j];

                if (source == target) {
                    int [][] subMap = copySubArray(i, j, H2, W2, H1, W1, map);
                    isFind = compareArray(H2, W2, subMap, tank);
                    if (isFind) break;
                };


            }
            if (isFind) break;
        }

        return isFind;
    }
  }