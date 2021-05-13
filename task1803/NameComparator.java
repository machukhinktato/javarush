package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {
    @Override
    public int compare(JavaRushMentor t0, JavaRushMentor t1) {
        return t0.toString().length() - t1.toString().length();
    }
}
