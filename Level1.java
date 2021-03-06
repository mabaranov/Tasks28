package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Level1 {

    public static String Keymaker(int k)
    {
        int [] doors = new int[k];
        for (int i=0; i<k; i++)
        {
            doors[i] = 1;
        }

        for (int i=2; i<=k; i++)
        {
            if (i == 2)
            {
                for (int j=1; j<=k; j++)
                    if (j%2 == 0 ) doors[j-1] = 0;
                continue;
            }
            for(int j=1; j<=k; j++)
            {
                if (j%i == 0)
                {
                    if (doors[j-1] == 0) doors[j-1] = 1;
                    else doors[j-1] = 0;
                }
            }
        }

        String res = "";
        for (int i=0; i<k; i++)
        {
            res += doors[i];
        }

        return res;
    }

//    private static void swap(int n1, int n2)
//    {
//        int t = n1;
//        n1 = n2;
//        n2 = t;
//    }
//
//    private static boolean priem2(int arr[], int N)
//    {
//        for (int i=0; i<N; i++)
//        {
//            for (int j=i+1; j<N; j++)
//            {
//                if (arr[i] < arr[j]) continue;
//
//                //swap(arr[i], arr[j]);
//                int t = arr[i];
//                arr[i] = arr[j];
//                arr[j] = t;
//                if (isSorted(arr, N))
//                    return true;
//                //swap(arr[i], arr[j]);
//                t = arr[i];
//                arr[i] = arr[j];
//                arr[j] = t;
//            }
//        }
//        return false;
//    }
//
//    private static boolean priem1(int arr[], int N)
//    {
//        for (int i=0; i<N/2; i++)
//        {
//            int t = arr[N-i-1];
//            arr[N-i-1] = arr[i];
//            arr[i] = t;
//        }
//
//        if (isSorted(arr, N)) return true;
//
//        return false;
//    }
//
//    private static boolean isSorted(int arr[], int N)
//    {
//        for (int i=1; i<N; i++)
//        {
//            if (arr[i] < arr[i-1]) return false;
//        }
//        return true;
//    }
//
//    public static boolean Football(int F[], int N)
//    {
//        int copy1[] = new int[N];
//        int copy2[] = new int[N];
//        for (int i=0; i<N; i++)
//        {
//            copy1[i] = F[i];
//            copy2[i] = F[i];
//        }
//
//        if (priem1(copy1, N)) return true;
//        if (priem2(copy2, N)) return true;
//
//        return false;
//    }

//    public static boolean white_walkers(String village)
//    {
//        if (village == "") return false;
//
//        //char [] tempDigits = new char[] {'0','1','2','3','4','5','6','7','8','9'};
//        HashMap<Character, Boolean> tempDigits = new HashMap<>();
//        tempDigits.put('0', true);
//        tempDigits.put('1', true);
//        tempDigits.put('2', true);
//        tempDigits.put('3', true);
//        tempDigits.put('4', true);
//        tempDigits.put('5', true);
//        tempDigits.put('6', true);
//        tempDigits.put('7', true);
//        tempDigits.put('8', true);
//        tempDigits.put('9', true);
//
//        char target = '=';
//        int countTarget = 0;
//        int leftDigits = -1;
//        boolean seq = false;
//        for (int i=0; i<village.length(); i++)
//        {
//            if (tempDigits.containsKey(village.charAt(i)) && leftDigits == -1)
//            {
//                leftDigits = i;
//                continue;
//            }
//
//            //if (village.charAt(i) == target && leftDigits != -1 && seq) countTarget += 1;
//
//
//            if (tempDigits.containsKey(village.charAt(i)) && leftDigits != -1)
//            {
//                String subSt = village.substring(leftDigits, i+1);
////                if ((Character.getNumericValue(subSt.charAt(0))
////                        + Character.getNumericValue(subSt.charAt(subSt.length()-1))) == 10
//                if ( subSt.contains("==="))
//                    return true;
//
//                leftDigits = i;
//                //countTarget = 0;
//            }
//        }
//
//
//        return false;
//    }

//    private static int findMaxValue(int [] arr, int N)
//    {
//        int max = 0;
//
//        for (int i=0; i<N; i++)
//        {
//            if (i == 0) max = arr[i];
//            if (arr[i] > max) max = arr[i];
//        }
//
//        return max;
//    }
//
//    private static int [] transform(int [] arr, int N)
//    {
//        ArrayList<Integer> B = new ArrayList<>();
//        for (int i=0; i<=N-1; i++)
//        {
//            for (int j=0; j<=N-i-1; j++)
//            {
//                int k = i+j;
//                int [] t = Arrays.copyOfRange(arr, j,k+1);
//                int max = findMaxValue(t, t.length);
//                B.add(max);
//            }
//        }
//
//        int [] k = new int[B.size()];
//        for (int i=0; i<B.size(); i++)
//        {
//            k[i] = B.get(i);
//        }
//        return k;
//    }
//
//    public static boolean TransformTransform(int A[], int N)
//    {
//        int [] A1 = transform(A, N);
//        int [] A2 = transform(A1, A1.length);
//
//        int sum=0;
//        for (int i=0; i<A2.length; i++)
//        {
//            sum += A2[i];
//        }
//
//        boolean res = false;
//
//        if (sum%2 == 0) res = true;
//
//        return res;
//    }

//    public static void matrixTurnToOneStep(int [][] arr, int M, int N)
//    {
//        int start = 0;
//        int endRow = N-1;
//        int endCol = M-1;
//        int count = 0;
//
//        while (count < N*M) {
//            ArrayList<Integer> t = new ArrayList<>();
//            for (int c = start; c <= endRow && count<N*M; ++c) {
//                t.add(arr[start][c]);
//                count++;
//            }
//            for (int c = start + 1; c <= endCol-start && count<N*M; ++c) {
//                t.add(arr[c][endRow]);
//                count++;
//            }
//            for (int c = endRow - 1; c >= start && count<N*M; --c) {
//                t.add(arr[endCol-start][c]);
//                count++;
//            }
//            for (int c = endCol - 1; c >= start + 1 && count<N*M; --c) {
//                t.add(arr[c][start]);
//                count++;
//            }
//
//            for (int i=t.size()-2, last=t.get(t.size()-1); i>=0; i--)
//            {
//                t.set(i+1, t.get(i));
//                if (i == 0) t.set(0, last);
//            }
//
//            int start1 = start;
//            int endRow1 = endRow;
//            int ch = 0;
//            int tCount = t.size();
//
//                for (int c = start1; c <= endRow1 && ch < tCount; ++c) {
//                    arr[start1][c] = t.get(ch);
//                    ch++;
//                }
//                for (int c = start1 + 1; c <= endCol - start1 && ch < tCount; ++c) {
//                    arr[c][endRow1] = t.get(ch);
//                    ch++;
//                }
//                for (int c = endRow1 - 1; c >= start1 && ch < tCount; --c) {
//                    arr[endCol - start1][c] = t.get(ch);
//                    ch++;
//                }
//                for (int c = endCol - 1; c >= start1 + 1 && ch < tCount; --c) {
//                    arr[c][start1] = t.get(ch);
//                    ch++;
//                }
//
//
//            endRow -= 1;
//            start += 1;
//        }
//    }
//
//    public static void MatrixTurn(String Matrix[], int M, int N, int T)
//    {
//        int [][] arr = new int[M][N];
//
//        for (int i=0; i<M; i++)
//        {
//            for (int j=0; j<N; j++)
//            {
//                arr[i][j] = Character.getNumericValue(Matrix[i].charAt(j));
//            }
//        }
//
//        for (int i=0; i<T; i++)
//        {
//            matrixTurnToOneStep(arr, M, N);
//        }
//
//        for (int i=0; i<M; i++)
//        {
//            String t = "";
//            for (int j=0; j<N; j++)
//            {
//               t += String.valueOf(arr[i][j]);
//            }
//            Matrix[i] = t;
//        }
//    }

//    private static void addEvenYear(int H, int W, int [][] tree)
//    {
//        for (int i=0; i<H; i++)
//        {
//            for (int j=0; j<W; j++)
//            {
//                tree[i][j] += 1;
//            }
//        }
//    }
//
//    private static void addOddYear(int H, int W, int [][] tree)
//    {
//        for (int i=0; i<H; i++)
//        {
//            for (int j=0; j<W; j++)
//            {
//                tree[i][j] += 1;
//            }
//        }
//
//        int [][] arrCopy = new int[H][W];
//        for (int i=0; i<H; i++) {
//            for (int j=0; j<W; j++)
//            {
//                arrCopy[i][j] = tree[i][j];
//            }
//        }
//
//        for (int i=0; i<H; i++)
//        {
//            for (int j=0; j<W; j++)
//            {
//                if (arrCopy[i][j] < 3) continue;
//
//                tree[i][j] = 0;
//                if (i-1 >= 0) tree[i-1][j] = 0;
//                if (i+1 < H) tree[i+1][j] = 0;
//                if (j-1 >= 0) tree[i][j-1] = 0;
//                if (j+1 < W) tree[i][j+1] = 0;
//            }
//        }
//    }
//
//    public static String [] TreeOfLife(int H, int W, int N, String [] tree)
//    {
//        int [][] arr = new int[H][W];
//
//        for (int i=0; i<H; i++)
//        {
//            for (int j=0; j<W; j++)
//            {
//                if (tree[i].charAt(j) == '.') arr[i][j] = 0;
//                if (tree[i].charAt(j) == '+') arr[i][j] = 1;
//            }
//        }
//
//        for (int i=0; i<N; i++)
//        {
//            if (i%2 == 0) addEvenYear(H, W, arr);
//            else addOddYear(H, W, arr);
//        }
//
//        String [] res = new String[H];
//        for (int i=0; i<H; i++)
//        {
//            String t = "";
//            for (int j=0; j<W; j++)
//            {
//                if (arr[i][j] == 0) t += '.';
//                else t += '+';
//            }
//            res[i] = t;
//        }
//
//        return res;
//    }

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