package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static int SumOfThe(int N, int [] data) {

        for(int i=0; i<N; i++) {
            int sum = 0;
            for(int j=0; j<N; j++) {
                if(j == i) continue;
                sum += data[j];
            }
            if(data[i] == sum) return data[i];
        }

        return 0;
    }
 }