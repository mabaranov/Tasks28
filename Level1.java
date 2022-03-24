package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static String encoding(String s) {

        String tmpStr = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' ')
                tmpStr += s.charAt(i);
        }

        double a = Math.sqrt( tmpStr.length() );
        int x = (int) a;
        int y = (int) (a+1);

        int lenTmpStr = tmpStr.length();
        if( x*y < lenTmpStr )
            x += 1;

        char [][] matr = new char[x][y];
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                if( i*y+j < lenTmpStr)
                    matr[i][j] = tmpStr.charAt(i*y+j);
                else
                    matr[i][j] = ' ';
            }
        }

        String res = "";
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                if( matr[j][i] != ' ')
                    res += matr[j][i];
            }
            res += ' ';
        }

        return res;
    }

    public static String decoding(String s) {

        String tmpStr = "";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' ')
                tmpStr += s.charAt(i);
        }

        double a = Math.sqrt( tmpStr.length() );
        int x = (int) a;
        int y = (int) (a+1);

        int lenTmpStr = tmpStr.length();
        if( x*y < lenTmpStr )
            x += 1;

        char [][] matr = new char[x][y];
        int index = 0;
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                if( index < s.length() )
                    if( s.charAt(index) == ' ') {
                        matr[j][i] = ' ';
                        continue;
                    } else
                        matr[j][i] = s.charAt(index);
                else
                    matr[j][i] = ' ';
                index++;
            }
            index++;
        }

        String res = "";
        for(int i=0; i<x; i++) {
            for(int j=0; j<y; j++) {
                if( matr[i][j] != ' ')
                    res += matr[i][j];
            }
        }

        return res;
    }

    public static String TheRabbitsFoot(String s, boolean encode) {

        String res = "";

        if(encode)
            res = encoding(s);
        else
            res = decoding(s);

        return res;
    }
 }