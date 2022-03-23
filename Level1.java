package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static int findSubStr(String str, String subStr) {

        int lenStr = str.length();
        int lenSubStr = subStr.length();

        for(int i=0; i<=lenStr-lenSubStr; i++) {
            for(int j=0; j<=lenSubStr; j++) {
                //if(j == lenSubStr)
                if (j == lenSubStr) {
                    if (j == lenStr || str.charAt(j) == ' ')
                        return 1;
                    break;
                }
                if(str.charAt(i+j) != subStr.charAt(j))
                    break;
            }
        }
        return 0;

    }

    public static String[] breakIntoLines(String s, int len) {

        int lenSource = s.length();
        ArrayList<String> arr = new ArrayList<>();

        for(int i=0; i<lenSource; i++) {

            int start = i;
            int end = i;

            if(s.charAt(i) == ' ')
                continue;

            for(int j=start; j<=lenSource; j++) {

                if((j-i == len) || (j==lenSource))
                {
                    if(start == end)
                        end = j;

                    break;
                }

                if(s.charAt(j) == ' ')
                    end = j;
            }
            arr.add(s.substring(start, end));
            i = end-1;
        }

        return arr.toArray(new String[0]);
    }

    public static String[] breakIntTolines_v2(String s, int len) {

        ArrayList<String> arr = new ArrayList<>();
        int lenS = s.length();

        //for(int i=0; i<lenS; i++) {
        int start = 0;
        while(start<lenS-1) {
            //int start = i;
            int end = start+len;
            if( end > lenS-1 )
                end = lenS-1;


            String subS = s.substring(start, end);
            for(int j=end; j>=start; j--) {
                //if( subS.charAt(j) == ' ' ) {
                if( s.charAt(j) == ' ' ) {
                    end = j;
                    break;
                }
            }
            if(end == lenS-1)
                arr.add(s.substring(start));
            else
                arr.add(s.substring(start, end));
            if(s.charAt(end) == ' ')
                start = end+1;
            else
                start = end;
        }

        return arr.toArray(new String[0]);
    }

    public static int [] WordSearch(int len, String s, String subS) {

        //String [] arrString = breakIntoLines(s, len);
        String [] arrString = breakIntTolines_v2(s, len);

        int count = arrString.length;
        int [] res = new int[count];
        for(int i=0; i<count; i++) {
            res[i] = findSubStr(arrString[i], subS);
        }

        return res;
    }

 }