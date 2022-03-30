package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Level1 {

    public static String MassVote(int N, int [] Votes) {

        int sum = 0;
        int max = Votes[0];
        int candidate = 1;
        for(int i=0; i<Votes.length; i++) {
            if(max < Votes[i]) { max = Votes[i]; candidate=i+1; }
            sum += Votes[i];
        }

        int countWinner = 0;
        for(int i=0; i<Votes.length; i++) {
            if(max == Votes[i]) countWinner++;
        }

        double per = max*100.0/sum;

        int tmp = (int)(per*1000);
        if(per*1000 - tmp >= 0.5)
            per = (tmp+1)/1000;
        else
            per = tmp*1.0/1000;

        if(countWinner == 1 && per > 50)
            return "majority winner " + candidate;

        if(countWinner == 1)
            return "minority winner " + candidate;

        return "no winner";
    }
 }