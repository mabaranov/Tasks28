package com.company;

public class Level1 {

    public static String BiggerGreater(String input)
    {
        char [] arr = input.toCharArray();
        int len = arr.length;

        int i=0;
        int j=0;

        for (i=len-2; i>=0 && arr[i]>=arr[i+1]; i--)
        {}

        if (i < 0) return "";

        for (j=len-1; arr[i]>=arr[j]; j--)
        {}

        char t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;

        for (int k=len-1, r=i+1; k>r; r++, k--)
        {
            t = arr[k];
            arr[k] = arr[r];
            arr[r] = t;
        }

        return new String(arr);
    }
}