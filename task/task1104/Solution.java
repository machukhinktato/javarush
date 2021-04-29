package com.javarush.task.pro.task11.task1104;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        double db = Double.parseDouble(string);
        db = Math.round(db);
        System.out.println((int) db);
    }
}

//class Double {
//    public static double parseDouble(String str){
//        int temp = Integer.parseInt(str);
//        System.out.println((double) str);
//        return (double) temp;
//    }
//}