package com.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }

    //    public static String[] getTokens(String query, String delimiter) {
//        StringTokenizer token = new StringTokenizer(query, delimiter);
//        StringBuilder arr = new StringBuilder();
//        while (token.hasMoreTokens()) {
//            arr.append(token.nextToken() + ", ");
//            arr.deleteCharAt(arr.length() - 1);
//        }
//        String[] banana = arr.toString().split(",");
//
//        return banana;
//    }
    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            result[i++] = stringTokenizer.nextToken();
        }
        return result;
    }
}
