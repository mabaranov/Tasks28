package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static boolean LineAnalysis(String line) {

        int size = line.length();

        if (line.charAt(size-1) != '*') return false;

        boolean even = (size % 2 == 0 ? true : false);
        int i1 = (even ? size/2-1 : size/2-1);
        int i2 = (even ? i1 : i1+2);

        for (int i=i1, j=i2; i>=0; i--, j++) {
            char c1 = line.charAt(i);
            if (c1 != '*' && c1 != '.') return false;
            char c2 = line.charAt(j);
            if (c2 != '*' && c2 != '.') return false;
            if (c1 != c2) return false;
        }

        return true;
    }
    
  }