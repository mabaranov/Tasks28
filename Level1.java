package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    private static void bubble_sort(int N, int [] price) {

        for(int i=N-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(price[j] < price[j+1]) {
                    int tmp = price[j];
                    price[j] = price[j+1];
                    price[j+1] = tmp;
                }
            }
        }

    }

    public static int MaximumDiscount(int N, int [] price) {

        bubble_sort(N, price);

        int discount = 0;
        for (int i=1; i<=N; i++) {
            if (i % 3 == 0)
                discount += price[i-1];
        }

        return discount;
    }
  }