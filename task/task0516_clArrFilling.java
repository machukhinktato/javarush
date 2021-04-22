package com.javarush.task.pro.task05.task0516;

import java.util.Arrays;

/* 
Заполняем массив
Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd. Если длина массива нечётная,
то большую часть заполнить значениями valueStart, меньшую — valueEnd. Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
При тестировании значения полей класса Solution будут разными, учти это.


Требования:
1. Реализуй метод main(String[]) согласно условию.*/

public class Solution {

    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

//      public static void main(String[] args) {
//        if (array.length % 2 == 0){
//            Arrays.fill(array, 0, valueStart, valueStart);
//            Arrays.fill(array,valueStart, array.length, valueEnd);
//            System.out.println();
//        }
//        else {
//            Arrays.fill(array, 0, array.length / 2 + 1, valueStart);
//            Arrays.fill(array, array.length / 2 + 1, array.length, valueEnd);
//        }
//        System.out.println(Arrays.toString(array));
//    }
    public static void main(String[] args) {
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, valueStart);
        Arrays.fill(array, firstPart, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
