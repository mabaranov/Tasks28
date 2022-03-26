package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static int PrintingCosts(String Line) {

        HashMap<Character, Integer> symbolToner = new HashMap<>();
        symbolToner.put(' ', 0);
        symbolToner.put('&', 24);
        symbolToner.put(',', 7);
        symbolToner.put('2', 22);
        symbolToner.put('8', 23);
        symbolToner.put('>', 10);
        symbolToner.put('D', 26);
        symbolToner.put('J', 18);
        symbolToner.put('P', 23);
        symbolToner.put('V', 19);
        symbolToner.put('\\', 10);
        symbolToner.put('b', 25);
        symbolToner.put('h', 21);
        symbolToner.put('n', 18);
        symbolToner.put('t', 17);
        symbolToner.put('z', 19);
        symbolToner.put('!', 9);
        symbolToner.put('\'', 3);
        symbolToner.put('-', 7);
        symbolToner.put('3', 23);
        symbolToner.put('9', 26);
        symbolToner.put('?', 15);
        symbolToner.put('E', 26);
        symbolToner.put('K', 21);
        symbolToner.put('Q', 31);
        symbolToner.put('W', 26);
        symbolToner.put(']', 18);
        symbolToner.put('c', 17);
        symbolToner.put('i', 15);
        symbolToner.put('o', 20);
        symbolToner.put('u', 17);
        symbolToner.put('{', 18);
        symbolToner.put('"', 6);
        symbolToner.put('(', 12);
        symbolToner.put('.', 4);
        symbolToner.put('4', 21);
        symbolToner.put(':', 8);
        symbolToner.put('@', 32);
        symbolToner.put('F', 20);
        symbolToner.put('L', 16);
        symbolToner.put('R', 28);
        symbolToner.put('X', 18);
        symbolToner.put('^', 7);
        symbolToner.put('d', 25);
        symbolToner.put('j', 20);
        symbolToner.put('p', 25);
        symbolToner.put('v', 13);
        symbolToner.put('|', 12);
        symbolToner.put('#', 24);
        symbolToner.put(')', 12);
        symbolToner.put('/', 10);
        symbolToner.put('5', 27);
        symbolToner.put(';', 11);
        symbolToner.put('A', 24);
        symbolToner.put('G', 25);
        symbolToner.put('M', 28);
        symbolToner.put('S', 25);
        symbolToner.put('Y', 14);
        symbolToner.put('_', 8);
        symbolToner.put('e', 23);
        symbolToner.put('k', 21);
        symbolToner.put('q', 25);
        symbolToner.put('w', 19);
        symbolToner.put('}', 18);
        symbolToner.put('$', 29);
        symbolToner.put('*', 17);
        symbolToner.put('0', 22);
        symbolToner.put('6', 26);
        symbolToner.put('<', 10);
        symbolToner.put('B', 29);
        symbolToner.put('H', 25);
        symbolToner.put('N', 25);
        symbolToner.put('T', 16);
        symbolToner.put('Z', 22);
        symbolToner.put('`', 3);
        symbolToner.put('f', 18);
        symbolToner.put('l', 16);
        symbolToner.put('r', 13);
        symbolToner.put('x', 13);
        symbolToner.put('~', 9);
        symbolToner.put('%', 22);
        symbolToner.put('+', 13);
        symbolToner.put('1', 19);
        symbolToner.put('7', 16);
        symbolToner.put('=', 14);
        symbolToner.put('C', 20);
        symbolToner.put('I', 18);
        symbolToner.put('O', 26);
        symbolToner.put('U', 23);
        symbolToner.put('[', 18);
        symbolToner.put('a', 23);
        symbolToner.put('g', 30);
        symbolToner.put('m', 22);
        symbolToner.put('s', 21);
        symbolToner.put('y', 24);

        int sumToner = 0;
        for(int i=0; i<Line.length(); i++) {

            char ch = Line.charAt(i);
            Integer val = symbolToner.get(ch);
            if(val == null) val = 23;
            sumToner += val;
        }

        return sumToner;
    }

 }