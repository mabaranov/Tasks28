package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    private static int Min(int a, int b, int c) {
        if (a < b && a < c) return a;
        else if ( b < c) return b;
        return c;
    }

    private static void ShiftLeft(int n, int [] arr) {

        int tmp = arr[0];

        for (int i=1; i<n; i++) {
            arr[i-1] = arr[i];
        }

        arr[n-1] = tmp;
    }

    public static boolean MisterRobot(int N, int [] data) {

        for (int j=0; j<N/3+1; j++) {
            for (int i = 1; i < N - 1; i++) {

                if (data[i - 1] < data[i] && data[i] < data[i+1]) continue;

                int[] tmp = new int[]{data[i - 1], data[i], data[i + 1]};

                int min = Min(data[i - 1], data[i], data[i + 1]);

                while (min != tmp[0]) {
                    ShiftLeft(tmp.length, tmp);
                }

                data[i-1] = tmp[0];
                data[i] = tmp[1];
                data[i+1] = tmp[2];
            }
        }

        boolean res = false;

        for (int i=1; i<N; i++) {
            if (data[i] < data[i-1]) return false;
        }

        return true;
    }
  }