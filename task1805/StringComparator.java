package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    public int compare(String t0, String t1) {
        return t0.length() - t1.length();
    }
}