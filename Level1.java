package com.company;

public class Level1 {

    public static int odometer(int [] oksana) {

        int s = 0;
        int h = 0;

        for (int i=0; i<oksana.length; i=i+2) {
             s += (oksana[i+1]-h) * oksana[i];
             h = oksana[i+1];
        }

        return s;
    }

    public static int factorial(int N) {
        int factorial = 1;
        for(int i=2; i<=N; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int squirrel(int N) {

        int emerald = factorial(N);

        while( (float)emerald/10 > 1) {
            emerald /= 10;
        }

        return emerald;
    }
}