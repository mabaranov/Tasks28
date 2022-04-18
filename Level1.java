package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Level1 {

    private static void addEvenYear(int H, int W, int [][] tree)
    {
        for (int i=0; i<H; i++)
        {
            for (int j=0; j<W; j++)
            {
                tree[i][j] += 1;
            }
        }
    }

    private static void delNearby(int i, int j, int H, int W, int [][] tree)
    {
        if (i-1 >= 0) tree[i-1][j] = 0;
        if (i+1 < H) tree[i+1][j] = 0;
        if (j-1 >= 0) tree[i][j-1] = 0;
        if (j+1 < W) tree[i][j+1] = 0;
        tree[i][j] = 0;
    }

    private static void addOddYear(int H, int W, int [][] tree)
    {
        for (int i=0; i<H; i++)
        {
            for (int j=0; j<W; j++)
            {
                tree[i][j] += 1;
            }
        }

        for (int i=0; i<H; i++)
        {
            for (int j=0; j<W; j++)
            {
                if (tree[i][j] >= 3) delNearby(i, j, H, W, tree);
            }
        }
    }

    public static String [] TreeOfLife(int H, int W, int N, String [] tree)
    {
        int [][] arr = new int[H][W];

        for (int i=0; i<H; i++)
        {
            for (int j=0; j<W; j++)
            {
                if (tree[i].charAt(j) == '.') arr[i][j] = 0;
                if (tree[i].charAt(j) == '+') arr[i][j] = 1;
            }
        }

        for (int i=0; i<N; i++)
        {
            if (i%2 == 0) addEvenYear(H, W, arr);
            else addOddYear(H, W, arr);
        }

        String [] res = new String[H];
        for (int i=0; i<H; i++)
        {
            String t = "";
            for (int j=0; j<W; j++)
            {
                if (arr[i][j] == 0) t += '.';
                else t += '+';
            }
            res[i] = t;
        }

        return res;
    }

//    public static boolean SherlockValidString(String s)
//    {
//        HashMap<Character, Integer> hsh = new HashMap<Character, Integer>();
//
//        for (int i=0; i<s.length(); i++)
//        {
//            Character ch = s.charAt(i);
//
//            hsh.put(
//                    ch,
//                    hsh.containsKey(ch) ? hsh.get(ch)+1 : 1
//            );
//        }
//
//
//        ArrayList<Integer> z = new ArrayList<>(hsh.values());
//        boolean fDel = false;
//
//        for (int i=1; i<z.size(); i++)
//        {
//            int a = z.get(i);
//            int b = z.get(i-1);
//
//            if (a == b) continue;
//            if (a != b && fDel) return false;
//            int r = (a>b ? a-b : b-a);
//            if (r>1) return false;
//            if (r == 1) fDel = true;
//        }
//
//        return true;
//    }

//    public static String BiggerGreater(String input)
//    {
//        char [] arr = input.toCharArray();
//        int len = arr.length;
//
//        int i=0;
//        int j=0;
//
//        for (i=len-2; i>=0 && arr[i]>=arr[i+1]; i--)
//        {}
//
//        if (i < 0) return "";
//
//        for (j=len-1; arr[i]>=arr[j]; j--)
//        {}
//
//        char t = arr[j];
//        arr[j] = arr[i];
//        arr[i] = t;
//
//        for (int k=len-1, r=i+1; k>r; r++, k--)
//        {
//            t = arr[k];
//            arr[k] = arr[r];
//            arr[r] = t;
//        }
//
//        return new String(arr);
//    }
}