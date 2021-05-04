package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.ArrayList;
import java.util.Collections;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;


    public static Month[] getWinterMonths() {
//        ArrayList<Month> winterList = new ArrayList<>();
        //        Collections.addAll(winterList, DECEMBER, JANUARY, FEBRUARY);

        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSpringMonths() {
//        ArrayList<Month> springList = new ArrayList<>();
//        Collections.addAll(springList, MARCH, APRIL, MAY);

        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonths() {
//        ArrayList<Month> summerList = new ArrayList<>();
//        Collections.addAll(summerList, JUNE, JULY, AUGUST);

        return new Month[]{JUNE, JULY, AUGUST};
    }

    public static Month[] getAutumnMonths() {
//        ArrayList<Month> autumnList = new ArrayList<>();
//        Collections.addAll(autumnList, SEPTEMBER, OCTOBER, NOVEMBER);

        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }

}
