package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static String BigMinus(String s1, String s2) {

        int count = s1.length();
        if(count < s2.length())
            count = s2.length();

        int [] a = new int[count];
        int [] b = new int[count];

        for(int i=0; i<count; i++) {

            int n1 = 0;
            if(i < s1.length()) n1 = Character.digit(s1.charAt(s1.length()-i-1), 10);
            int n2 = 0;
            if(i < s2.length()) n2 = Character.digit(s2.charAt(s2.length()-i-1), 10);

            a[count-i-1] = n1;
            b[count-i-1] = n2;
        }

        for(int i=0; i<a.length; i++) {
            if(a[i]==b[i]) continue;
            if(a[i]>b[i]) {
                break;
            } else {
                int [] t = new int[count];
                t = b;
                b = a;
                a = t;
                break;
            }
        }

        int [] tmp = new int[count];
        for (int i=a.length-1; i>=0; i--) {
            tmp[i] = a[i]-b[i];
            if(tmp[i] < 0) {
                a[i-1] -= 1;
                tmp[i] += 10;
            }
        }
        
        String res = "";
        boolean isFirstZero = true;
        for(int i=0; i<tmp.length; i++) {
            if(isFirstZero && tmp[i] == 0 && i!=tmp.length-1) continue;
            isFirstZero = false;
            res += tmp[i];
        }

        return res;
    }
 }