package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Level1 {

    private static ArrayList<String> listOperation = new ArrayList<>();
    private static ArrayList<String> listResults = new ArrayList<>();
    private static int curIndex = -1;
    private static boolean prevOperationUndo = false;

    public static String BastShoe(String command)
    {
        String operation = command;
        String parameter = "";

        int sep = command.indexOf(' ');
        if (sep != -1) {
            operation = command.substring(0, sep);
            parameter = command.substring(sep + 1);
        }

        if (prevOperationUndo && (operation.equals("1") || operation.equals("2"))) {
            String tOperation = listOperation.get(curIndex);
            String tResults = listResults.get(curIndex);
            listOperation.clear();
            listResults.clear();
            listOperation.add(tOperation);
            listResults.add(tResults);
            curIndex = 0;
        }

        prevOperationUndo = false;

        if (operation.equals("1")) {
            String res = "";
            if (curIndex != -1)
                res = listResults.get(curIndex);
            res += parameter;
            listOperation.add(operation);
            listResults.add(res);
            curIndex += 1;
            return res;
        }
        if (operation.equals("2")) {
            String res = "";
            if (curIndex != -1)
                res = listResults.get(curIndex);

            int start = 0;
            int end = res.length() - Integer.valueOf(parameter);

            if (end < 0) end = 0;

            res = res.substring(start, end);

            listOperation.add(command);
            listResults.add(res);
            curIndex += 1;
            return res;
        }
        if (operation.equals("3")) {
            String res = "";
            if (curIndex != -1)
                res = listResults.get(curIndex);

            int i = Integer.valueOf(parameter);
            if (i<0 || i>=res.length())
                return "";

            return "" + res.charAt(i);
        }
        if (operation.equals("4")) {
            String res = "";
            curIndex -= 1;
            if (curIndex < 0)
                curIndex = 0;
            if (curIndex < stopIndex)
                curIndex = stopIndex;

            res = listResults.get(curIndex);
            prevOperationUndo = true;
            return res;
        }
        if (operation.equals("5")) {
            String res = "";
            curIndex += 1;
            if (curIndex >= listOperation.size())
                curIndex = listOperation.size()-1;

            res = listResults.get(curIndex);

            return res;
        }

        return command;
    }
}