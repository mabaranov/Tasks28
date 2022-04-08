package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Level1 {

    public static String [] ShopOLAP(int N, String [] items) {

        HashMap<String, Integer> mapSales = new HashMap<String, Integer>();

        for (int i=0; i<N; i++)
        {
            String str = items[i];
            int indexSeparator = str.indexOf(' ');

            String product = str.substring(0, indexSeparator);
            int count = Integer.valueOf( str.substring(indexSeparator+1) );

            if (!mapSales.containsKey(product))
                mapSales.put(product, 0);

            int val = mapSales.get(product);
            mapSales.put(product, val+count);
        }

        ArrayList<String> listProducts = new ArrayList<String>();
        ArrayList<Integer> listCounts = new ArrayList<Integer>();

        for (Map.Entry<String, Integer> e: mapSales.entrySet())
        {
            String key = e.getKey();
            Integer value = e.getValue();
            int count = listCounts.size();

            for (int i = 0; i <= count; i++)
            {
                if (i == count)
                {
                    listProducts.add(key);
                    listCounts.add(value);
                }
                if (value == listCounts.get(i)
                    && key.compareTo(listProducts.get(i)) < 0)
                {
                    listProducts.add(i, key);
                    listCounts.add(i, value);
                    break;
                }
                if (value > listCounts.get(i))
                {
                    listProducts.add(i, key);
                    listCounts.add(i, value);
                    break;
                }
            }
        }

        String [] res = new String[listProducts.size()];
        for (int i=0; i<listProducts.size(); i++)
        {
            res[i] = listProducts.get(i) + " " + listCounts.get(i);
        }

        return res;
    }
}