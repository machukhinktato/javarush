package com.javarush.task.pro.task05.task0501;

/* 
Создаем массивы

Создаем массивы
В методе main проинициализируй переменные intArray и doubleArray массивами соответствующих типов, размер которых равен 10.


Требования:
1. В классе Solution должна быть публичная статическая переменная intArray типа int[].
2. В классе Solution должна быть публичная статическая переменная doubleArray типа double[].
3. В методе main(String[]) проинициализируй переменные intArray и doubleArray согласно условию.
*/

public class Solution {
    public static int[] intArray;
    public static double[] doubleArray;

    public static void main(String[] args) {
        intArray = new int[10];
        doubleArray = new double[10];
//        System.out.println(intArray.length);
//        System.out.println(doubleArray.length);
    }
}
