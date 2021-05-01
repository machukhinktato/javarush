package com.javarush.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 1
*/

public class Solution {
//    public ArrayList<Integer> list = new ArrayList<>();

    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if(destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
//        for (int i = 0; i < source.size(); i++) {
//            destination.set(i, source.get(i));
//        }
        Collections.copy(destination, source);
    }


    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
//        System.out.println(Collections.addAll(Arrays.asList(strings)));
        //        ArrayList<String> listCopy = new ArrayList<>();
//        listCopy.addAll(listCopy, strings.toString());
//        for (String string : strings) {
//        list.addAll(list, strings);
//        }
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
//        for (int i = 0; i < list.size(); i++) {
//            String string = list.get(i);
//            if(string.equals(oldValue)) {
                Collections.replaceAll(list, oldValue, newValue);
//            }
//        }
    }
}
