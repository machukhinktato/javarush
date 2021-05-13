package com.javarush.task.pro.task18.task1805;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Прощание с лямбда-выражением
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();

        Collections.addAll(strings, "JavaRush", "Amigo", "Java Developer", "CodeGym");

        sortStringsByLength(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void sortStringsByLength(ArrayList<String> strings) {
        Collections.sort(strings, new StringComparator());
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String t0, String t1) {
//                return t0.length() - t1.length();
//            }
//        };

//        Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());

    }
}
